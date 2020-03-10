package Uvsq21923164.exo32;

public class Vendeur extends Employe {
	private double commission;
public Vendeur(String nom, int annee) {
		super(nom, annee);
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + commission;
	}
}
