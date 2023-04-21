package de.dhbw.tinf21b.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Nahrungsmittel essen = new Nahrungsmittel();
		//Nahrungsmittel.verzehre(essen);
		
		Consumer<Nahrungsmittel> meinVerzehr = Nahrungsmittel::verzehre;
		Function<Nahrungsmittel, Boolean> meineReferenz2 = Nahrungsmittel::verzehre;
		
		Consumer<Nahrungsmittel> meineAusführlicheReferenz = 
				xyz -> {
					//Nahrungsmittel.verzehre(xyz);
					xyz.verzehre();
					return;
				};
				
		BiFunction<Nahrungsmittel, Nahrungsmittel, Boolean> ichAmBuffet =
				Nahrungsmittel::schlemme;
		
		Boolean ergebnis = ichAmBuffet.apply(essen, essen);
		
		boolean ergebnis2 = Nahrungsmittel.schlemme(essen, essen);
		
		LiteratischesEssen<Nahrungsmittel, Nahrungsmittel, Integer, Boolean> ichAmRezitieren =
				Nahrungsmittel::prasse;
		
		List<Nahrungsmittel> meinVorrat = new ArrayList<>();
		Predicate<Nahrungsmittel> ausführlich = new Predicate<Nahrungsmittel>() {
			@Override
			public boolean test(Nahrungsmittel n) {
				return (n.hashCode() % 2 == 0);
			}
		};
		Predicate<Nahrungsmittel> vonMirVerdaubar = n -> (n.hashCode() % 2 == 0);
		for (Nahrungsmittel each : meinVorrat) {
			if (vonMirVerdaubar.test(each)) {
				each.verzehre();
			}
		}
		meinVorrat
			.stream()
			.filter(vonMirVerdaubar)
			.forEach(meinVerzehr);
	}
}
