
public class City {
	//attributs
	public String cityName;
	public String countryName;
	public int cityResident;
	
	//constructeurs
	public City(String cityName, String countryName, int cityResident ) {
		this.cityName = cityName;
		this.countryName = countryName;
		this.cityResident = cityResident;
	}
	
	//méthodes
	public void displayCity() {
		System.out.println(this.cityName + " " + this.countryName + " " + this.cityResident);
	}
}
