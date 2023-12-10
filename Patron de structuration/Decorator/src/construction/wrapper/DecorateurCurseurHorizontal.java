package construction.wrapper;

public class DecorateurCurseurHorizontal  implements Fenetre{
	
   private Fenetre fenetre;

   public DecorateurCurseurHorizontal(Fenetre fenetre) {
	   super() ;
   }

	public void dessiner() {
		
		System.out.println(" Dessiner un decorateur de Curseur Horizontal");
		   
	}
	
	public void decrire() {
		
		System.out.println("Je suis une Decorateur de curseur horizontal");
	}
	
	public void dessinerCurseurHorizontal() {
		System.out.println("Affichage avec defilement Horizontal");
		System.out.println
		(" ------------------------------------ ");
		fenetre.dessiner();
		
	}

	@Override
	public void dessinerCurseurVertical() {
		
		
	}
}
