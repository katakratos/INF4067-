package constructeur.builder;

public abstract class MonteurPizza {

	protected Pizza pizza = new Pizza();
	public Pizza getPizza() {return pizza;}
	
	
	public abstract void monterPate();
	public abstract void monterSauce();
	public abstract void monterGarniture();
	
	
}
