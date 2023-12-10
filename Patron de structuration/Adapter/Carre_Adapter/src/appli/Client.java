package appli;

import construction_carre_adapter.AdaptRectangle;
import construction_carre_adapter.Carre;


public class Client {

	public static void main(String[] args) {
		
	   //Utilisation de l'implementation Carre via l'interface ICarre 
	    System.out.println(" ---- Je suis un carré -----");
		Programme programme = new Programme(); 
		programme.setICarre(new Carre());
		programme.gerer(9);
		
		 // Utilisation de l'implementation  AdaptRectangle via l'adaptateur AdaptRectangle sans modifie la classe Gestion
		 System.out.println(" \n ---- Je suis un Rectangle-----");
			Programme programme1 = new Programme();
			programme1.setICarre(new AdaptRectangle());
			programme1.gerer(9);
			
		
		
	}

}
