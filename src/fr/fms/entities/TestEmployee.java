package fr.fms.entities;

import fr.fms.base.*;

public class TestEmployee {
// LastName, FirstName, Age, Address
	public static void main(String[] args) {
		Employee gates = new Employee("Gates", "Bill", 65, "aux USA", new Capital("Washington","USA",7_600_000, "W-M"), "Foundation B&M", 100_000.0);
		Employee musk = new Employee("Musk", "Elon", 49, "a palo alto", new City("Pretoria","Afrique",800_000), "Tesla", 150_000.0);
		System.out.println(gates);
		System.out.println(musk);
		
	}

}


//public Employee(String lastName, String firstName, int age, String address, City bornCity, int salary) {
//	super(lastName, firstName, age, address, bornCity);
//	this.salary = salary;
//}