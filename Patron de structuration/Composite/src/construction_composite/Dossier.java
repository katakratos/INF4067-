package construction_composite;
import java.util.ArrayList;
import java.util.List;

public class Dossier extends Element {

	private List<Element> elements;
	
	//constructeur du dossier
	public Dossier(String name) {
		super(name, "dossier");
		
		elements = new ArrayList<>();
	}
	
	//Fonction qui permet de décrire le dossier et tout ses élements
	public void decrire() {
		
		String tab="";
		for(int i=0;i<niv;i++) tab+="----"; // pour afficher les tabulations
		super.decrire();
		System.out.println(tab+ "Contenu du dossier :");
		for( Element element : elements) {
		   element.decrire(); // decrire tou
		}
	}
	
	// Fonction pour ajouter un élement
	public void ajouter(Element element) {
		element.niv = this.niv+1;
		elements.add(element);
	}
	
	// fonction pour supprimer un element
	public void supprimer(Element element) {
		elements.remove(element);
	}
	
	//fonction qui permet d'obtenir un elément à la position index
	public Element getElement(int index) {
		if(index>=0 && index < elements.size()) {
			return elements.get(index);
		}
		return null;
	}

	
			
	
}
