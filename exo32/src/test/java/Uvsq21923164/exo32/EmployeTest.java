package Uvsq21923164.exo32;

import org.junit.Test;

import junit.framework.TestCase;

public class EmployeTest extends TestCase {
	@Test
	public void CalculSalaireEmployeTest() {
		Employe E= new Employe("youcef",2018);
		double expected=1600;
		assert (E.calculSalaire()==expected);
	}
}
