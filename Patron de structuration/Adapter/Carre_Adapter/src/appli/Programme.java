package appli;

import construction_carre_adapter.ICarre;

public class Programme {
	
	//Ne connait que l'interface ICarre
	private ICarre icarre ;
	
	
	//gere uniquement  tous les operation sur les   carrés via l'interface ICarre
	public void gerer(float c) {
		System.out.println("**************");
		
		
		icarre.perimetre(c);
		icarre.aire(c);
		System.out.println("\n**************");
		
		
	}
	// permet d'injecter l'implementation souhaité à l'interface ICarre
	public void setICarre(ICarre icarre) {
		this.icarre= icarre;
	}
	

}
