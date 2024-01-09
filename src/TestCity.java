
public class TestCity {

	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 498003);
		City marseille = new City("Marseille", "France", 870321);
		City lyon = new City("Lyon", "France", 522228);

		toulouse.displayCity();
		marseille.displayCity();
		lyon.displayCity();
		
		toulouse.cityResident += 20000;
		
		toulouse.displayCity();
	}

}
