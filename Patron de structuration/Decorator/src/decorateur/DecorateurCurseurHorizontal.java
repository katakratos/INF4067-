package decorateur;

import construction.wrapper.Fenetre;

public class DecorateurCurseurHorizontal  extends  DecorateurFenetre{
	
  

   public DecorateurCurseurHorizontal(Fenetre fenetre) {
	   super(fenetre) ;
   }

	public void dessiner() {
		//fenetre.dessiner();
		System.out.println(" Dessiner un decorateur de Curseur Horizontal");
		   
	}
	
	public void decrire() {
		//fenetre.decrire(); 
		System.out.println("Je suis une Decorateur de curseur horizontal");
	}
	
	public void dessinerCurseurHorizontal() {
		System.out.println("Affichage avec defilement Horizontal");
		System.out.println
		(" ------------------------------------ ");
		fenetre.dessiner();
		fenetre.decrire();  
		
	}

	
}
