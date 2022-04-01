package fr.fms.entities;

import java.util.ArrayList;

public class EntitiesTest {
	public static void main(String[] args) {
		Person [] persons = new Person[3];
		persons[0] = new Employee("Gate","Bill",65,"habitant aux USA", new Capital("Washington", "USA", 7600000,"W-M"),"B&M",100000);
 		persons[1] = new Commercial( "Dupont","Robert",50,"habitant rue des rosiers a Toulouse", new City("Limoges", "France", 133000),"brico",5.0);
 		persons[2] = new Employee("Musk","Elon",49,"habitant a  palo alto", new City("Pretoria", "Afrique du Sud", 800000),"Tesla",150000);
 		
 		for(int i=0;i<persons.length;i++) {
 			System.out.println(persons[i]);
 		}
 		System.out.println("-----------------");	
 		for(Person p : persons)
 			System.out.println(p);
 		ArrayList<Object> listePersons = new ArrayList<Object>();
 		listePersons.add(persons[0]);
 		listePersons.add(persons[1]);
 		listePersons.add(persons[2]);
 		System.out.println("-----------------");
 		for(Object o : listePersons) {
 			System.out.println("Salaire mensuel de " + ((Person)o).getName() + ((Person)o).getFirstName() + ((Person)o).remuneration() );
 		} 		
	}
}
