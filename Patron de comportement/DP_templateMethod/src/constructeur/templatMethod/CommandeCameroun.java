package constructeur.templatMethod;



public class CommandeCameroun extends Commande {
     
	@Override
	protected void calculeTva() {
	
		montantTva = montantHt * 0.196;
		
	}
	
	

}
