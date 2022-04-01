package fr.fms.entities;

public class Employee extends Person {
	private String company;
	private double salary;
	public final double SMIC = 1200;
	public final double Charge = 0.2;
	
	public Employee(String name, String firstName, int age, String address,City cityBorn, String company, double salary) {
		super(name, firstName, age, address, cityBorn);
		this.company = company;
		setSalary(salary);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary < 0) {
			System.out.println("le salaire ne peut etre négatif !");
			this.salary = SMIC;
		}
		else this.salary = salary;
	}
	public String toString() {
		return super.toString() + " entreprise : " + company + ", salaire : " + salary;
	}
	public double remuneration() {
		return salary * (1 - 0.2);
	}	
}

