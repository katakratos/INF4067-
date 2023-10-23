package constructeur.builder;

public  class Directeur {
	// construction de la pizza piquante
	
	
	
	
	public Pizza construirePizzaPiquante() {
		MonteurPizza monteurPizzaP=new MonteurPizzaPiquante() ;
		//les methodes pour construire la pate, la sauce et la garniture
		monteurPizzaP.monterPate();
		monteurPizzaP.monterSauce();
		monteurPizzaP.monterGarniture();
		
		return monteurPizzaP.getPizza();
		
		
	}
	
	public Pizza construirePizzaReine() {
		MonteurPizza monteurPizzaR=new MonteurPizzaReine() ;
		//les methodes pour construire la pate, la sauce et la garniture
		monteurPizzaR.monterPate();
		monteurPizzaR.monterSauce();
		monteurPizzaR.monterGarniture();
		return monteurPizzaR.getPizza();
		
		
		
	}
	
	public Pizza construirePizzaLocal() {
		MonteurPizza monteurPizzaL=new MonteurPizzaLocal() ;
		//les methodes pour construire la pate, la sauce et la garniture
		monteurPizzaL.monterPate();
		monteurPizzaL.monterSauce();
		monteurPizzaL.monterGarniture();
		return monteurPizzaL.getPizza();
		
		
		
	}
	
	

	

}
