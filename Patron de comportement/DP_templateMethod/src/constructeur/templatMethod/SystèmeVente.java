package constructeur.templatMethod;

public class SystèmeVente {

	public static void main(String[] args) {
	
		// Systeme de vente d'une voiture au cameroun	
		Commande c1 = new CommandeCameroun();
		c1.setMontantHt(100000);
		c1.calculeMontantTtc();
		System.out.println("Commande  du Cameroun");
		c1.affiche();
		
		
		// Systeme de vente d'une voiture au Gabon	
				Commande c2 = new CommandeCameroun();
				c2.setMontantHt(200000);
				c2.calculeMontantTtc();
				System.out.println("Commande  du Gabon");
				c2.affiche();
	
	}

}
