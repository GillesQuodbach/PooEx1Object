package fr.fms.entities;

import fr.fms.base.City;

public class TestEmployee {

	public static void main(String[] args) {
		Employee gates = new Employee("Gates", "Bill", 65, "aux USA", new City("amam","jjrj",800000), 70000);

		System.out.println(gates);
		
	}

}


//public Employee(String lastName, String firstName, int age, String address, City bornCity, int salary) {
//	super(lastName, firstName, age, address, bornCity);
//	this.salary = salary;
//}