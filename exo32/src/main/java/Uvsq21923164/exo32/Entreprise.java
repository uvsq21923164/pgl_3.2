package Uvsq21923164.exo32;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

	private List<Employe> salarieList;
	
	public Entreprise() {
		salarieList = new ArrayList<Employe>();
	}
	public void addEmploye(Employe E) {
		this.salarieList.add(E);
	}
	
	public double getSommeTotaleSalaires() {
		double sum = 0;
		for (Employe s : salarieList) {
			sum += s.calculSalaire();
		}
		return sum;
	}
}
