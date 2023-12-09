package construction.adapter;

public class DocumentHtml implements Document{
	 protected String contenu;
	 
	public void setContenu (String contenu) {
		this.contenu = contenu ;
	}
	
	public void dessine() {
		System.out.println("Dessine un document Html : " +this.contenu);
		
	}

	@Override
	public void imprime() {
		System.out.println("Imprime un document Html : " +this.contenu);
		
	}
	

}
