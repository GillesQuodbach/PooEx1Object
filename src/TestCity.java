
public class TestCity {

	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 500000);
		City marseille = new City("Marseille", "France", 870321);
		City lyon = new City("Lyon", "France", 522228);

		// Sans accesseurs
//		toulouse.displayCity();
//		marseille.displayCity();
//		lyon.displayCity();
//		
//		toulouse.cityResident += 20000;
//		
//		toulouse.displayCity();
		
		// Avec accesseurs
//		toulouse.getCityName();
//		marseille.getCityName();
//		lyon.getCityName();
//		
//		toulouse.getCountryName();
//		marseille.getCountryName();
//		lyon.getCountryName();
//		
//		toulouse.getCityResident();
//		marseille.getCityResident();
//		lyon.getCityResident();
		
//		toulouse.cityResident = -20000;
		
//		System.out.println("La ville de " + toulouse.getCityName() + " a " + toulouse.getCityResident() + " habitants");

		toulouse.setCityResident(-2000);
//		

	}

}
