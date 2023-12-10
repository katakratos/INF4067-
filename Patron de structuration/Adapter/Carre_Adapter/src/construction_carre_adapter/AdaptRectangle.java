package construction_carre_adapter;

import construction_adapter_rectangle.Rectangle;


public class AdaptRectangle   implements ICarre {
	
	// l'adaptateur
    //instancie un object rectangle de type Rectangle
	private Rectangle rectangle = new Rectangle() ;
	
	
	//calcul le perimtre	
	public float perimetre( float cote) {
		Rectangle monRect = rectangle;
		monRect.setLong(cote);
		monRect.setlarg(cote);
		
		
		return monRect.perimetre();
	}
	
	//calcul l'aire
	public float aire(float cote  ) {
		Rectangle monRect = rectangle;
		monRect.setLong(cote);
		monRect.setlarg(cote);
		
		return monRect.aire();
	}
 
	
	
 
}
