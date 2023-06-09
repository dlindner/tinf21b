package de.dhbw.tinf21b.streams;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ErsteBeispiele {

	public static void main(String[] args) {
		Random rng = new Random();
		List<Integer> example1 = Stream
			.of(1, 2, 3, 4, 4)
			.filter(n -> (n % 2) == 0)
			.filter(n -> n > 2)
			.distinct()
			//.filter(n -> rng.nextBoolean())
			.collect(Collectors.toList());
		System.out.println(example1);
		
		System.out.println("----");
		
		Stream<String> example2 = Stream.of(
			new Süßigkeit("Weingummi", 180),
			new Süßigkeit("Lakritzschnecken", 240),
			new Süßigkeit("Gummibärchen", 40)
	    )
		//.parallel()
        .filter(s -> s.gewicht() > 100)
        .map(s -> s.name())
        //.sorted()
        .peek(text -> System.out.println(text));
        //.sorted();
        //.collect(Collectors.toList());
		System.out.println(example2.collect(Collectors.toList()));
		
		System.out.println("----");

		// PECS --> Producer Extends, Consumer Super
		Supplier<Number> zufallszahl = Math::random;
		Stream<Number> generate0 = Stream.<Number>generate(
			zufallszahl
		);
		Stream<Number> generate1 = Stream.<Number>generate(
			() -> Math.random()
		);
		Stream<Number> generate2 = Stream.generate(
			() -> (Number) Math.random()
		)
		//.sorted()
		.limit(1000)
		.skip(200);
		//List<Double> collect = generate.collect(Collectors.toList());
		//System.out.println(collect);
		//System.out.println(collect.size());
		
		System.out.println(
			Stream.empty().collect(Collectors.toList())
		);
		
		System.out.println("----");

		Supplier<Stream<Double>> zehnZahlen = () -> Stream.generate(Math::random).limit(10);
		Stream<Stream<Double>> geschachtelt = Stream.of(
			zehnZahlen.get(),
			zehnZahlen.get(),
			zehnZahlen.get()
		);
		//Stream<Stream<Double>> flattened = geschachtelt;
		Stream<Double> flattened = geschachtelt.flatMap(Stream::unordered);
		System.out.println(flattened.count());
		
		System.out.println("----");

		Stream<Optional<String>> maybes = Stream.of(
			Optional.of("Eins"),
			Optional.empty(),
			Optional.of("Drei")
		);
		Stream<String> flatMap = maybes.flatMap(Optional::stream);
		System.out.println(flatMap.count());
		
		System.out.println("----");

		Stream.of(1, 2, 3).forEach(zahl -> System.out.println(zahl));
	}
}
