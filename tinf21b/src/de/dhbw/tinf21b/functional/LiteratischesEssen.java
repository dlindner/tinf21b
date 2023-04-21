package de.dhbw.tinf21b.functional;

public interface LiteratischesEssen<
					E1 extends Nahrungsmittel,
					E2 extends Nahrungsmittel,
					E3,
					A1 extends Boolean> {
	
	A1 apply(E1 eingabe1, E2 eingabe2, E3 eingabe3);
}
