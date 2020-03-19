package Uvsq21923164.exo32;

public class Manager extends Employe {
	

		private int nb_subal;
		
		public Manager(String nom, int annee) {
			super(nom,annee);
			
		}
		
		public double calculSalaire() {
			return super.calculSalaire()+nb_subal*100;
		}
		
		public void setNbSubalternes(int nb) {
			this.nb_subal=nb;
		}

	}

