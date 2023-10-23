package constructeur.builder;

public class Client {

	public static void main(String[] args) {
		Directeur directeur = new Directeur();
        //construction de la pizza piquante
		System.out.println("-------------  Fabrication de la pizza Piquante  --------------------");
		directeur.construirePizzaPiquante().Print();
		
		//construction de la pizza piquante
		System.out.println("-------------  Fabrication de la pizza Reine  --------------------");
		directeur.construirePizzaReine().Print();
		
		
		//construction de la pizza piquante
		System.out.println("-------------  Fabrication de la pizza Local  --------------------");
		directeur.construirePizzaLocal().Print();
	}
	

}
