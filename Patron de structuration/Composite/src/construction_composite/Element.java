package construction_composite;

public abstract class Element {
	  protected String name;
	    protected String type;
	  protected int niv;

	  //constructeur de l'element
	    public Element(String name, String type) {
	        this.name = name;
	        this.type = type;
	    }

	    // permet de decrire l'élement en spécifiant son nom et son type
	    public void decrire() {
	    	String tab="";
			for(int i=0;i<niv;i++) tab+="----"; // pour afficher les tabulations
	        System.out.println(tab+"Nom : " + name);
	        System.out.println(tab+"Type : " + type);
	    }

	    public abstract void ajouter(Element element);
	    public abstract void supprimer(Element element);
	    public abstract Element getElement(int index);
	
}
