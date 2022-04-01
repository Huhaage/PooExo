package fr.fms.entities;

public class City {
	private String name;
	private String state;
	private int population;
	private static int NbCity = 0;	
	public City (String name, String state, int population ){
		setName(name);
		setState(state);
		setPopulation(population);
		NbCity++;	
	}			
	public City (String name, int population) {
		this(name,"unknown",population);
		NbCity++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;		
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;		
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		if (population < 0)
			throw new RuntimeException("La population ne peut pas étre négative)");
		else
			this.population = population;		
	} 
	public void display() {
		System.out.println("Ville de "  + name  + " en " + getState() + " ayant " + population + " habitants");
	}		
	public String toString() {
		return "nom : " + name + ", pays : " + state;
	}
	public static int getNumCity(){
		return NbCity;
	}
}
