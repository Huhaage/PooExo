package fr.fms.entities;

public class Capital extends City {
	private String monument;
	public Capital(String name, String state, int population, String monument) {
		super(name, state, population);
		this.monument = monument;
	}
	public String getMonument() {
		return monument;
	}
	public void setMonument(String monument) {
		this.monument = monument;
	}

	public String toString() {
		return super.toString() + " monument=" + monument;
	}
}