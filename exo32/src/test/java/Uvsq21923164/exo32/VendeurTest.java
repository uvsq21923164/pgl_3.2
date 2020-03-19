package Uvsq21923164.exo32;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendeurTest {

	@Test
	public void test() {
		
		Vendeur V= new Vendeur("youcef",2015);
		V.setCommission(200);
		double expected=1800;
		assertEquals(expected,V.calculSalaire(),0);
	}
	}



	