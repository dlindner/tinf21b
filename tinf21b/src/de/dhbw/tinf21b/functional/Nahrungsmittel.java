package de.dhbw.tinf21b.functional;

public class Nahrungsmittel {

	public Nahrungsmittel() {
		super();
	}
	
	public /*static*/ boolean verzehre(/*Nahrungsmittel this*/) {
		System.out.println(this.getClass());
		System.out.println("N1: War lecker, so");
		return true;
	}
	
//	public static boolean verzehre(Nahrungsmittel mittel) {
//		System.out.println("Das hier!");
//		return true;
//		//return "Lecker!";
//	}
	
	public static int summiere(int zahl1, int zahl2) {
		return zahl1 + zahl2;
	}
	
	public static boolean schlemme(
		Nahrungsmittel mittel,
		Nahrungsmittel nachtisch
	) {
		System.out.println("Das hier!");
		return true;
		//return "Lecker!";
	}

	public static boolean prasse(
		Nahrungsmittel hauptgang,
		Nahrungsmittel nachtisch,
		Number gedicht
	) {
		System.out.println("Das hier!");
		return true;
		//return "Lecker!";
	}
}
