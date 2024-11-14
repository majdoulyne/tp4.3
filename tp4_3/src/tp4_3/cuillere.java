package tp4_3;

public class cuillere extends Ustensile{
	protected double longeur;
	public cuillere(int annee,double longeur) {
		super(annee);
		this.longeur=longeur;
	}
	  public double calculerValeur() {
	        if ((2024 - annee) > 30) {
	            return (2024 - annee) * 0.5;
	        }
	        return 0;
	    }
	
}
