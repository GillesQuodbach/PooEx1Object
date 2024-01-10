package fr.fms.entities;

import fr.fms.base.City;

public class Capital extends City{
	// attributs
	public String monument;
	
	public Capital(String cityName, String countryName, int cityResident, String monument) {
		super(cityName, countryName, cityResident);
		this.monument = monument;

	}

	// accesseurs
	
	public String getMonument() {
		return monument;
	}
	
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	// méthodes
	@Override
	public String toString() {
		return this.getCountryName() + " , " + this.getCityName() + " , " + + this.getCityResident() + " d'habitants monument : " + getMonument() ;
	}

}
