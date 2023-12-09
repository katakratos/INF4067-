package application;


import construction.stack.DListImplStack;
import construction.stack.StackImpl;

public class Client {

	public static void main(String[] args) {
		
		// utilisation de l'implemetation SatckImpl via l'interface Stack
		  int cap = 7;
		   Gestion gestion = new Gestion();
		   gestion.setStack(new StackImpl(cap));
		   gestion.manipulerPiles("Welcome");
		
	
	  
	     // Utilisation de la classe DList via l'Adaptateur
		  
		   Gestion gestion1 = new Gestion();
		   gestion1.setStack(new DListImplStack());
		   gestion1.manipulerPiles("Welcome");
	 
	    

		  
		
	    

	}

}
