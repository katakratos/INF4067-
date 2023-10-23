package constructeur.builder;

public class MonteurPizzaReine extends MonteurPizza{
	protected Pizza pizza = new Pizza();
	public Pizza getPizza() {return pizza;}
	
	public void monterPate() {pizza.setPate(" croisée");}
	public void monterSauce() {pizza.setSauce(" douce");}
	public void monterGarniture() {pizza.setGarniture(" jambon + champignon");}
	

	
	

}
