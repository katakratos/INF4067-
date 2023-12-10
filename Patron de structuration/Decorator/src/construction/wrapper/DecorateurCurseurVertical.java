package construction.wrapper;

public class DecorateurCurseurVertical  implements Fenetre {
	
	private Fenetre fenetre;
	
	public DecorateurCurseurVertical(Fenetre fenetre) {
		super( );
	}
	
	public void dessiner() {
		System.out.println(" Je suis un Decorteur de curseur Vertical");
	}
	
	public void decrire() {
			
			System.out.println("Je suis une Decorateur de curseur vertical");
		}
	
	public void dessinerCurseurVertical() {
		System.out.println("Affichage avec defilement vertical");
		System.out.println
		("-------------------------------");
		fenetre.decrire();
		
	}

	
	

	

}
