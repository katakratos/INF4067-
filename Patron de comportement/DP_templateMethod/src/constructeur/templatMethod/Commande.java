package constructeur.templatMethod;

public abstract class Commande {
     
	protected  double montantHt ;
	protected double montantTva;
	protected double montantTtc;
	 
	protected  abstract void calculeTva(); 
	
	public void calculeMontantTtc() {
		this.calculeTva();
		montantTtc = montantHt + montantTva;
	}
	
	public void setMontantHt(double montantHt) {
		this.montantHt = montantHt;
	}
	
	public void affiche() {
		System.out.println("Commande ");
		System.out.println("Le montant Ht  est de " + montantHt);
  
		System.out.println("Le montant Ttc  est de " + montantTtc);
	}
}
