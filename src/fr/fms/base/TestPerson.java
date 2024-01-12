package fr.fms.base;
import java.util.*;

public class TestPerson {

	public static void main(String[] args) {

//		Person manu = new Person("Macron", "Emmanuel", 43, "Elys�e à Paris", new City("Amien", "France"));
//		Person poutine = new Person("Poutine", "Vladimir", 68);
//		Person biden = new Person("Biden", "Joe");
//		
//	
//		System.out.println(manu);
//		System.out.println(poutine);
//		System.out.println(biden);

		// Cr�ation des porsonnalit�s

		List<Person> personnalites = new ArrayList<>();

//		personnalites.add(new Person("Macron", "Emmanuel", 43, "L'Elys�e à Paris", new City("Amien", "France")));
//		personnalites.add(new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000)));
//		personnalites
//				.add(new Person("Johnson", "Boris", 56, "Downing Street à London", new City("NewYork", "Etats-Unis")));
//		personnalites.add(new Person("Depardieu", "G�rard", 72, "Moscou", new City("Ch�teauroux", "France")));
//		personnalites.add(new Person("Kravitz", "Lenny", 56, "H�tel particulier � Paris", new City("NewYork", "USA")));
//		personnalites
//				.add(new Person("Lawrence", "Jennifer", 30, "Louiseville aux USA", new City("Indian Hills", "USA")));

		System.out.println("Liste des personnalit�s");
		for (Person allPersons : personnalites) {
			System.out.println(allPersons);
		}
		System.out.println("------------------------------");
		System.out.println("Liste apr�s notre filtre");
		for (Person personFr : personnalites) {
			if (personFr.getBornCity().countryName == "France")
				System.out.println(personFr);
		}
	}
}
