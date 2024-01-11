package fr.fms.entities;

import fr.fms.base.City;
import fr.fms.base.Person;

public class Commerciale extends Person {
	
	//Attributs
public String compagny;
public double percentage;


public Commerciale(String lastName, String firstName, int age, String address, City bornCity, String compagny, double percentage) {
	super(lastName, firstName, age, address, bornCity);
	this.compagny = compagny;
	setPercentage(percentage);
	
	
}

public String getCompagny() {
	return compagny;
}


public void setCompagny(String compagny) {
	this.compagny = compagny;
}


public double getPercentage() {
	return percentage;
}


public void setPercentage(double percentage) {
	if (percentage < 0) {
		System.out.println("% du chiffre d'affaire inférieur à 0 impossible");
		this.percentage = 0.0;
		return;
	}
	this.percentage = percentage;
}

public String toString() {
	return lastName + " , " + firstName + " , " + age +"ans , habitants " + address + " , " + bornCity + " Entreprise : " + compagny + " , % CA : " + percentage;
}

}
