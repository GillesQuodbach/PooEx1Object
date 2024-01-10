package fr.fms.base;
public class Person {
	
	// attribut
	public String lastName;
	public String firstName;
	public int age;
	public String address;
	public City bornCity;
	
	
	// constructeur
	public Person(String lastName, String firstName, int age, String address, City bornCity) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		this.bornCity = bornCity;
	}
	
	public Person(String lastName, String firstName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = "unknown";
	}
	
	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = 0;
		this.address = "unknown";
	}
	

	
	// accesseur
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public City getBornCity() {
		return bornCity;
	}
	

	public String toString() {
		return this.lastName 
		+ "," + this.firstName + " ," + this.age + " ans, habitants " 
				+ this.address + " , " + " Ville de naissance : " + this.bornCity;
	}

}