package construction_adapter_rectangle;

public class Rectangle {
	private float L;
	private float l;
	
	
	//constructeur par default
	public Rectangle() {
		
	}
	//constructeur qui prend udeux parametre
	public Rectangle(float L, float l) {
		this.setLong(L);
		this.l = l;
	}


   //getteur pour obtenir la longueur
	public float getLong() {
		return L;
	}


    //setteur pour actualiser la longueuer
	public void setLong(float L) {
		this.L = L;
	}
	
	//getteur pour obtenir la largeur
	public float getlarg() {
		return l;
	}


	//setteur pour obtenir la largeur
	public void setlarg(float l) {
		this.l = l;
	}
	
	//calcul le perimetre du rectangle
	public float perimetre() {
		float p =(L+l)*2;
		System.out.println("Le perimetre est de " + p);
		return p ;
	}
	
	//calcul l'aire du rectangle
    public float aire() {
    	float A = L*l;
    	System.out.println("L'aire est de " + A);
    	return A ;
    }

	
}
