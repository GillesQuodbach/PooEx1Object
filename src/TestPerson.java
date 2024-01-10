
public class TestPerson {

	public static void main(String[] args) {
		
		Person manu = new Person("Macron", "Emmanuel", 43, "Elysée à Paris", new City("Amien", "France"));
		Person poutine = new Person("Poutine", "Vladimir", 68);
		Person biden = new Person("Biden", "Joe");
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);

	}

}
