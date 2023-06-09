package de.dhbw.tinf21b.memorymodel.sync;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		AtomicInteger zähler = new AtomicInteger();
		Runnable t1 = () -> {
			for (int i = 0; i < 100; i++) {
				int aktuelleStand = zähler.get();
				zähler.incrementAndGet();
//					aktuelleStand = aktuelleStand + 1;
//					zähler.setStand(aktuelleStand);
			}
		};
		Runnable t2 = () -> {
			for (int i = 0; i < 100; i++) {
				int aktuelleStand = zähler.get();
				zähler.incrementAndGet();
//				aktuelleStand = aktuelleStand + 1;
//				zähler.setStand(aktuelleStand);
			}
		};
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println(zähler.get());
	}
}
