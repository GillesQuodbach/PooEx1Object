package fr.fms.entities;
import fr.fms.base.City;
import fr.fms.base.Person;

public class Employee extends Person{
	
	//attributs
	public int salary;

	public Employee(String lastName, String firstName, int age, String address, City bornCity, int salary) {
		super(lastName, firstName, age, address, bornCity);
		this.salary = salary;
	}
	
	//accesseurs
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return this.lastName + " , " + this.firstName + " , " + this.age+"ans , " + " habitant " + this.address +
				" , " + this.bornCity + " salaires : " + this.salary;
	}

}
