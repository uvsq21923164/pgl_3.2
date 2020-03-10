package Uvsq21923164.exo32;

public class Vendeur extends Employe {
private double comm;
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + comm;
	}
	
}
