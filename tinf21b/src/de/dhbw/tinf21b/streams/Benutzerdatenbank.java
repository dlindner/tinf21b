package de.dhbw.tinf21b.streams;

import java.io.IOError;
import java.io.IOException;
import java.util.Optional;

public interface Benutzerdatenbank {

	// Railway-Oriented Programming (ROP)
	Optional<Benutzer> findeFür(String benutzername) throws IOException;
	
	// Maybe, Promise, String?, Nullable
}
