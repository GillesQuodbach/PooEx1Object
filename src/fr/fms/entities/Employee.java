package fr.fms.entities;
import fr.fms.base.City;
import fr.fms.base.Person;

public class Employee extends Person{
	
	//attributs
	public String compagny;
	public int salary;

	public Employee(String lastName, String firstName, int age, String address, City bornCity, String compagny, int salary) {
		super(lastName, firstName, age, address, bornCity);
		this.compagny = compagny;
		this.salary = salary;
	}
	
	//accesseurs
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getCompagny() {
		return compagny;
	}
	
	public void setCompagny(String compagny) {
		this.compagny = compagny;
	}
	
	public String toString() {
		return "Entreprise " + this.compagny + " , " + this.salary;
	}
	
}
