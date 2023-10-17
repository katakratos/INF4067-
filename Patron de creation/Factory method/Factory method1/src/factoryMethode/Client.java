package factoryMethode;

public class Client {

	public static void main(String[] args) {
		
		// TODO Auto-generated method st3ub

		ProduitFactory produitFactory = new ProduitFactory();
	     
		
		ProduitA produitA = null;
		
		produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
		produitA.methodeA();
		
		produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
		produitA.methodeA();
		
		produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
		produitA.methodeA();
		
		produitA = produitFactory.getProduitA(4);
		produitA.methodeA();
		
	}

}
