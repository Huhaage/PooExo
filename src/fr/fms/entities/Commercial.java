package fr.fms.entities;

public class Commercial extends Person {
	private String company;
	private double percent;
	public final double MinPercent = 3.5;
	public final double TURNOVER = 50000;
	
	public Commercial(String name, String firstName, int age, String address, City bornCity, String company, double percent) {
		super(name, firstName, age, address,bornCity);
		this.company = company;
		setPercent(percent);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		if(percent < 0) {
			System.out.println("le pourcentage ne peut etre négatif !");
			this.percent = MinPercent;
		}
		else this.percent = percent;
	}
	public String toString() {
		return super.toString() + " entreprise " + company + ", pourcentage : " + percent;
	}
	public double remuneration() {
		return TURNOVER * percent/100;
	}
}
