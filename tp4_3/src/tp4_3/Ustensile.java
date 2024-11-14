package tp4_3;

public abstract class Ustensile {
	protected int annee;
	
	public Ustensile(int annee) {
		this.annee=annee;
	}
	
	public abstract double calculerValeur();
	

}
