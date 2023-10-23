package constructeur.builder;

public abstract class MonteurPizza {

	protected Pizza pizza;
	
	public void creerNouvellePizza() { pizza = new Pizza();}
	public abstract void monterPate();
	public abstract void monterSauce();
	public abstract void monterGarniture();
	

	public abstract Pizza getPizza(); 
}
