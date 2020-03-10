package Uvsq21923164.exo32;

public class Vendeur extends Employe {
private double commission;
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + commission;
	}
	
}
