package de.dhbw.tinf21b.streams;

public class Süßigkeit {

	private String string;
	private int i;

	public Süßigkeit(String string, int i) {
		this.string = string;
		this.i = i;
	}

	public int gewicht() {
		return i;
	}

	public String name() {
		return string;
	}
}
