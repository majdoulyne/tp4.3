package tp4_3;

public class assietteCarre  extends assiete {
	private double cote;
	public assietteCarre(int annee,double cote) {
		super(annee);
		this.cote=cote;
	}
	public double calculerSurf() {
		return cote*cote;
	}
	public double calculerValeur() {
		 double valeurAssietteRonde = new assietteRonde(annee, cote).calculerValeur();
	     return valeurAssietteRonde * 2;	
	}
}
