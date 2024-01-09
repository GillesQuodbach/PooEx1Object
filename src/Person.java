
public class Person {
	
	// attribut
	public String lastName;
	public String firstName;
	public int age;
	public String address;
	
	
	// constructeur
	public Person(String lastName, String firstName, int age, String address) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
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
	
//	public City(String cityName, int cityResident) {
//		this.cityName = cityName;
//		this.countryName = "unknown";
//		this.cityResident = cityResident;
//	}
	
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
	
	public String toString() {
		return "Person " + "[lastname=" + getLastName() 
		+ ", firstname=" + getFirstName() + ", age=" + getAge() + ", adresse=" + getAddress() + "]";
	}

}
