package construction_carre_adapter;

public class Carre implements ICarre {


	
   //clacul le périmetre
	@Override
	public float perimetre(float cote) {
		float p= cote*4;
		System.out.println("Le périmetre est de " + p);
		return  p ;
		
	}
	// calcul l'aire
	@Override
	public float aire(float cote) {
		float A = cote*cote;
		System.out.println("L'aire est de " + A);
		return cote;
	}


	
}
