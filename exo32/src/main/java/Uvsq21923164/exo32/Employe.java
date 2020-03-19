package Uvsq21923164.exo32;

import java.util.Calendar;

public class Employe {

	private final String nom ;
	private final int annee_arrivee;
	
	public Employe(String nom,int annee) {
		this.nom = nom;
		this.annee_arrivee=annee;
	}
	
	public double calculSalaire() {
		Calendar cl = Calendar.getInstance();
		int annee_courante = cl.get(Calendar.YEAR);
		return 1500+20*(annee_courante-annee_arrivee);
	}
	
	
	
}
