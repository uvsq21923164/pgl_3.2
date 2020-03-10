package Uvsq21923164.exo32;

public class Employe {

	private int nbAnnees;
	private Coordonnees coordonnees;

	public String getCoordonnees() {
		return coordonnees.toString();
	}
	public double calculSalaire() {
		return 1500 + nbAnnees * 20;
	}
	
	
	
}
