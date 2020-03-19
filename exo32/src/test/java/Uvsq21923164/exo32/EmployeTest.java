package Uvsq21923164.exo32;

import org.junit.Test;



public class EmployeTest  {
	@Test
	public void CalculSalaireEmployeTest() {
		Employe E= new Employe("youcef",2020);
		double expected=1500;
		assert (E.calculSalaire()==expected);
	}
}
