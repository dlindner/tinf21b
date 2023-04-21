package de.dhbw.tinf21b.intro;

public class Mülleimer {

	public Mülleimer() {
		super();
	}
	
	public void entsorge(Nahrungsmittel müll) {
		System.out.println("M1: Bitte in die Biotonne!");
	}
	
	public void entsorge(Kaffee müll) {
		System.out.println("M2: Das kann Dünger sein!");
	}
	
	public void entsorge(Doppelkorn müll) {
		System.out.println("M3: Warum nur?");
	}
}
