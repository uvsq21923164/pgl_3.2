package Uvsq21923164.exo32;

import static org.junit.Assert.*;

import org.junit.Test;

public class ManagerTest {

	
		@Test
		public void CalculSalaireManagerTest() {
			Manager M= new Manager("John SMITH",2015);
			M.setNbSubalternes(2);
			double expected=1800;
			assertEquals(expected,M.calculSalaire(),0);
		}
}
