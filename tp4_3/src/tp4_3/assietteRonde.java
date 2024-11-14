package tp4_3;

public class assietteRonde extends assiete{
	private double rayon;
	
	public assietteRonde(int annee, double rayon) {
		super(annee);
		this.rayon=rayon;
	}
	public  double calculerSurf() {
		return 3.14*rayon*rayon;
	}
	
	  public double calculerValeur() {
	        if (2024 -annee > 50) {
	            return (2024- annee - 50) * 1;
	        }
	        return 0;
	    }


}