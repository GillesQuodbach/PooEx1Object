package fr.fms.entities;

import fr.fms.base.*;

public class TestEmployee {

	public static void main(String[] args) {
		Employee gates = new Employee("Gates", "Bill", 65, "aux USA", new City("Washington","USA",7_600_000), "Foundation B&M", 100_000);

		System.out.println(gates);
		
	}

}


//public Employee(String lastName, String firstName, int age, String address, City bornCity, int salary) {
//	super(lastName, firstName, age, address, bornCity);
//	this.salary = salary;
//}