package tp4_3;

public class collection {
	public static void main(String[] args) {
		Ustensile[] us = new Ustensile[5];
		us[0] = new assietteRonde(1926, 8.4);
		us[1] = new cuillere(1881, 7.3);
		us[2] = new assietteCarre(1935, 5.6);
		us[3] = new cuillere(1917, 8.8);
		us[4] = new assietteRonde(1837, 5.4);
		/*afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);*/		}

		
		public static void afficherCuillere(Ustensile[] us) {
			int cmpt=0;
			for(Ustensile n: us) {
				if(n instanceof cuillere) {
					cmpt++;
				}
			}
			System.out.println("Il y a " + cmpt + " cuillères.");	
		}
		
		
		public  void afficherSurfaceAssiettes(Ustensile[] us) {
			double surftotal=0.0;
			for(Ustensile n: us) {
				if(n instanceof assiete) {
					surftotal+=((assiete) n).calculerSurf();
				}
			}
			System.out.println("Surface totale des assiettes " + surftotal );	
		}
		
		public  void afficherValeurTotale(Ustensile[] us) {
			double valTot=0.0;
			for(Ustensile n: us) {
				valTot+=n.calculerValeur();
			}
			System.out.println("Valeur totale des ustensiles :" + valTot );	
		}
			
			
		
}