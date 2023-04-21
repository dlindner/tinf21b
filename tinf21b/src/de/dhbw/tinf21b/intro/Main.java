package de.dhbw.tinf21b.intro;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Nahrungsmittel erstesGetränk = new Kaffee();
		Doppelkorn zweitesGetränk = new Doppelkorn();
		
		erstesGetränk.verzehre();
		zweitesGetränk.verzehre();
		
		List<Nahrungsmittel> hausbar = List.of(
			erstesGetränk,
			zweitesGetränk
		);

		// ambigious method reference
//		hausbar.forEach(
//			Nahrungsmittel::verzehre
//		);
//		for (Nahrungsmittel each : hausbar) {
//			each.verzehre();
//		}
		
		Mülleimer eimer = new Mülleimer();
		eimer.entsorge(erstesGetränk);
		eimer.entsorge(zweitesGetränk);
		hausbar.forEach(
			eimer::entsorge
		);
//		for (Nahrungsmittel each : hausbar) {
//			eimer.entsorge(each);
//		}
	}
}
