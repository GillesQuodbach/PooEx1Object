package fr.fms.entities;

import java.util.ArrayList;

import fr.fms.base.City;

public class TestEntities {

	public static void main(String[] args) {
		
		ArrayList<Object> EntitiesArray= new ArrayList<>();
		Employee gates = new Employee("Gates", "Bill", 65, "aux USA", new Capital("Washington","USA",7_600_000, "W-M"), "Foundation B&M", 100_000.0);
		Employee musk = new Employee("Musk", "Elon", 49, "a palo alto", new City("Pretoria","Afrique du Sud",800_000), "Tesla", 150_000.0);
		Commerciale robert = new Commerciale("Dupont", "robert", 50, "rue des rosiers à Toulouse",
				new City("Limoge", "France", 133_000), "brico", 5.0);
		
		EntitiesArray.add(gates);
		EntitiesArray.add(musk);
		EntitiesArray.add(robert);
		
		for (Object entitie :  EntitiesArray) {
			System.out.println(entitie);
		}
		
	}

}
