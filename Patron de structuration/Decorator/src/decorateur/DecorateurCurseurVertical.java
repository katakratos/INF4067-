package decorateur;

import construction.wrapper.Fenetre;

public class DecorateurCurseurVertical  extends DecorateurFenetre {
	
	
	
	public DecorateurCurseurVertical(Fenetre fenetre) {
		super( fenetre);
	}
	
	public void dessiner() {
		System.out.println(" Dessiner un Decorateur de curseur Vertical");
	}
	
	public void decrire() {
			
			System.out.println("Je suis une Decorateur de curseur vertical");
		}
	
	public void dessinerCurseurVertical() {
		System.out.println("Affichage avec defilement vertical");
		System.out.println
		("\n-------------------------------");
	    fenetre.dessiner();
		fenetre.decrire();
		
	}

	
	

	

}
