package construction.wrapper;

public class FenetreSimple extends Fenetre {
	private String content;
	
	public FenetreSimple(String content) {
		this.content = content;
	}
	
	public void dessiner() {
		System.out.println("Dessiner une fenêtre :" + content);
	}
	
	public void decrire() {
		System.out.println("je suis une fenetre Simple" + content);
		
	}

	

}
