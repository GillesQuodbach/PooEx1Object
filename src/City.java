
public class City {
	// attributs
	public String cityName;
	public String countryName;
	private int cityResident;

	// constructeurs
	public City(String cityName, String countryName, int cityResident) {
		this.cityName = cityName;
		this.countryName = countryName;
		this.cityResident = cityResident;
	}

	// méthodes
	public void displayCity() {
		System.out.println(this.cityName + " " + this.countryName + " " + this.cityResident);
	}

	// accesseurs

	// City name
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	// Country name
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	// City resident
	public int getCityResident() {
		return cityResident;
	}

	public void setCityResident(int cityResident) {
		if (cityResident < 0) {
			System.out.println("La population ne peut pas décroître, merci d'entrer un nombre d'habitant valide !");
			return;
		} else {
			this.cityResident += cityResident;
		}
	}
	
	// Partie 1.3
	public City(String cityName, int cityResident) {
		this.cityName = cityName;
		this.countryName = "unknown";
		this.cityResident = cityResident;
	}

	public String toString() {

		return "[ville : " + getCityName() + "]"  +
				"[pays : " + getCountryName() + "]"  +
				"[nombre d'habitant : " + getCityResident()  + "]";
	}
	
	

}
