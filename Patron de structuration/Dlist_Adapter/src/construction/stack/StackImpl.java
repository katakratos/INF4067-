package construction.stack;

public class StackImpl implements Stack{
	
	    private Object[] elements;
	    private int topIndex;
	

	    //constructeur de l'objet Stack
	    public  StackImpl(int capacity) {
	        elements = new Object[capacity];
	        topIndex = -1;
	    }
      
		// fonction permettant d'inserer un object dans la pile
 	    public void push(Object o) {
	        if (topIndex == elements.length - 1) {
	            throw new IllegalStateException("La pile est pleine");
	        }
	        topIndex++;
	        elements[topIndex] = o;
	    }
 
 	    //fonction permetttant de supprimer la queue de la pile
	    public Object pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("La pile est vide");
	        }
	        topIndex--;
	        elements[topIndex] = null;
	        Object o = elements[topIndex];
	        
	       
	        return o;
	    }

	    // fonction permettant de retourner la tete de la pile
	    public Object top() {
	        if (isEmpty()) {
	            throw new IllegalStateException("La pile est vide");
	        }
	        return elements[topIndex];
	    }
 
	    //fonction permettant de verifier si la pile est vide
	    public boolean isEmpty() {
	        return topIndex == -1;
	    }

	    //fonction qui retourne la taille de la pile
	    public int size() {
	        return topIndex + 1;
	    }

		

		
	}

