package de.dhbw.tinf21b.intro;

public class Nahrungsmittel {

	public Nahrungsmittel() {
		super();
	}
	
	public void verzehre() {
		System.out.println("N1: War lecker, so");
	}
	
	public static void verzehre(Nahrungsmittel mittel) {
		System.out.println("Das hier!");
	}
}
