package construction.wrapper;

import decorateur.DecorateurCurseurHorizontal;
import decorateur.DecorateurCurseurVertical;

public class Client {

	public static void main(String[] args) {
		
		Fenetre fenetre;
		//affichage de la fentre simple
		String content = "  Je suis très capricieux et caline, "
			            	+ "j'aime manger bio et faire du sport"; 
		 fenetre = new FenetreSimple(content);
		
		fenetre.decrire();// description de la fenetre
		
		// ajout d'un defilement vertical
		fenetre  = new DecorateurCurseurVertical(fenetre);
		 fenetre.dessiner();
		fenetre.decrire();
		

		// ajout d'un defilement horizontal
		System.out.println
		(" \n------------------------------------ ");
		Fenetre decorateurCurseurHorizontal = new DecorateurCurseurHorizontal(fenetre);
		decorateurCurseurHorizontal.dessiner();
		DecorateurCurseurHorizontal dec = new DecorateurCurseurHorizontal(decorateurCurseurHorizontal);
		dec.dessinerCurseurHorizontal();
 
		System.out.println
		(" \n------------------------------------ ");
		Fenetre decorat = new DecorateurCurseurHorizontal(fenetre);
		//decorat.dessiner();
		DecorateurCurseurVertical dec1 = new DecorateurCurseurVertical(decorat);
		dec1.dessinerCurseurVertical();
		

	}

}
