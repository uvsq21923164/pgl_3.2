package Uvsq21923164.exo32;

import static org.junit.Assert.*;

import org.junit.Test;

public class EntrepriseTest {

	@Test
	public void test() {
		Entreprise E=new Entreprise();
		Employe e= new Employe("youcef",2015);
		Vendeur v=new Vendeur("bachir",2015);
		v.setCommission(200);
		E.addEmploye(e);
		E.addEmploye(v);
		double expected;
		expected=3400;
		
		assertEquals(expected,E.getSommeTotaleSalaires(),0);
	}

}
