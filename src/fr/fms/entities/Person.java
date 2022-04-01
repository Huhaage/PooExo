package fr.fms.entities;



public abstract class Person {
	private String name;
	private String firstName;
	private int age;
	private String address;
	private City bornCity;

	public Person(String name, String firstName, int age, String address) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.address = address;		
		bornCity = null;
	}
	public Person(String name, String firstName, int age, String address, City bornCity) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.address = address;		
		this.bornCity = bornCity;
	}
	public String toString() {
		return 	this.name +
				", " + this.firstName +
				", " + this.age +
				", " + this.address + ", Ville de naissance : " + bornCity;		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public abstract double remuneration();
}
