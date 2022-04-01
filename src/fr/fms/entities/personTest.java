package fr.fms.entities;

public class personTest {

	public static void main(String[] args) {
		System.out.println("Exercice 3.2");
		Employee gate = new Employee("Gate","Bill",65,"habitant aux USA",new Capital("Washington", "USA", 7600000,"W-M"),"B&M",100000);
		System.out.println(gate);
		Employee musk = new Employee("Musk","Elon",49,"habitant à palo alto",new City("Pretoria", "Afrique du Sud", 800000),"Tesla",150000);
		System.out.println(musk);
		Commercial dupont = new Commercial( "Dupont","Robert",50,"habitant rue des rosiers à Toulouse",new City("Limoges", "France", 133000),"brico",5.0);
		System.out.println(dupont);	
	}
}
