package de.dhbw.tinf21b.hello;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("Hello, TINF21B" + i);
		}
	}
}
