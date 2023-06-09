package de.dhbw.tinf21b.streams;

import java.util.Optional;

public class Maybe {

	public static void main(String[] args) {
		Optional<String> eins = Optional.of("Text");
		Optional<String> zwei = Optional.empty();
		
		int länge = zwei.map(s -> s.length()).orElse(-1);
		System.out.println(länge);
		
		eins.ifPresent(System.out::println);
		zwei.ifPresentOrElse(
			s -> System.out.println(s),
			() -> System.out.println("<Nichts drin>")
		);
		
		String ersteEingabe1 = (args[0] != null) ? args[0] : "";
		String ersteEingabe2 = Optional.ofNullable(args[0]).orElse("");
		Optional<String> ersteEingabe3 = Optional.ofNullable(args[0]);
		
		//ersteEingabe3.orElseThrow(() -> new YouFuckedUpException("Idiot!"));
		
	}
}
