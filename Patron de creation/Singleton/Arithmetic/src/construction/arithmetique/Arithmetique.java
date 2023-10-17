package construction.arithmetique;

public final class Arithmetique {
		
		private static Arithmetique instance = null;
		
		private int x;
		private int y;
		private  String nom; 
		
		//constructeur  de l'objet
	    private Arithmetique() {
	    	super();
	    } 
		
		// un autre constructeur ayant des parametres
		private Arithmetique(int x, int y)
		{
			this.x=x;
			this.y=y;
		}
		// un autre constructeur ayant 03 parametres
		private Arithmetique(int x, int y , String nom)
		{
			this.x=x;
			this.y=y;
			this.nom=nom;
		}

		  public static Arithmetique getInstance() {
			  if(instance == null)
			  {
				  instance = new Arithmetique();
			  }
			  return instance;
		  }
		  
		  public static Arithmetique getInstance(int x, int y)
		  {
			  if(instance == null)
			  {
				  instance = new Arithmetique(x,y);
			  }
			  return instance;
		  } 
		  
		  public static Arithmetique getInstance(int x, int y, String nom )
		  {
			  if(instance == null)
			  {
				  instance = new Arithmetique(x,y,nom);
			  }
			  return instance;
		  } 
		  
		  public int somme(int x, int y )
		  {
			  return x+y;
		  }
		  
		  public int soustraction(int x, int y)
		  {
			  if(x>y) { return x-y ;} 
			  return y-x;
		  }
		  
		  public int multiplication(int x, int y )
		  {
			  return x*y;
		  }
		  
		  public float moyenne(int x,int y) {
			  return somme(x,y)/2;
		  }
		  
		  public void affiche() {
			  System.out.println("\nJe suis une instance mes valeurs sont : x = "+this.x +"et y ="+ this.y + "et nom ="+this.nom);
		  }
		  
		  @Override
		  
		  public Object clone() throws CloneNotSupportedException{
			  throw new CloneNotSupportedException();
		  }
	}


