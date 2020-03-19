package Uvsq21923164.exo32;

public class Vendeur extends Employe {
	private double commission;
public Vendeur(String nom, int annee) {
		super(nom, annee);
		
		
	}

	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + commission;
	}
	public void setCommission(double commission) {
		this.commission=commission;
	}

	
}
