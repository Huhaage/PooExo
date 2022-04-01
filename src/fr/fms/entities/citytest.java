package fr.fms.entities;


public class citytest { 
	public static void main(String [] arg) {

		Capital paris = new Capital("Paris", "France", 2000000, "pyramide du louvre");
		Capital hometown = new Capital("Hometown", "Neverland", 320000, "puit de oublie");
		
		System.out.println(paris);
		System.out.println(hometown);
	}
}
