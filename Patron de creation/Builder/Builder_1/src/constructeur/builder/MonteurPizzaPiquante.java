package constructeur.builder;

public class MonteurPizzaPiquante extends MonteurPizza{
	
	protected Pizza pizza = new Pizza();
	public Pizza getPizza() {return pizza;}
	
	
	
		
	public void monterPate() {pizza.setPate(" feuilletée");}
	public void monterSauce() {pizza.setSauce(" piquante");}
	public void monterGarniture() {pizza.setGarniture(" pepperoni+salami");}
}
	
	
	
    

	

