package decorateur;

import construction.wrapper.Fenetre;

public abstract class DecorateurFenetre extends Fenetre {
	
      protected Fenetre fenetre;
      
	public DecorateurFenetre(Fenetre fenetre) {
		this.fenetre = fenetre;
	}

	
	
	

}
