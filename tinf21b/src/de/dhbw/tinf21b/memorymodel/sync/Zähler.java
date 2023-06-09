package de.dhbw.tinf21b.memorymodel.sync;

public class Zähler {
	
	private int stand;
	
	public Zähler() {
		super();
		this.stand = 0;
	}
	
	public void erhöheUm(int schritt) {
		synchronized (this) {
			this.stand += schritt;
		}
	}
	
	public int getStand() {
		synchronized (this) {
			return this.stand;
		}
	}
	
//	public void setStand(int neuenStand) {
//		this.stand = neuenStand;
//	}
}
