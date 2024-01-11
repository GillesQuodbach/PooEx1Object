package fr.fms.entities;

import fr.fms.base.*;

public class TestCommerciale {

	public static void main(String[] args) {

		Commerciale robert = new Commerciale("Dupont", "robert", 50, "rue des rosiers à Toulouse",
				new City("Limoge", "France", 133_000), "brico", -5.0);
		System.out.println(robert);
	}

}
//(String lastName, String firstName, int age, String address, City bornCity, String compagny, double percentage)