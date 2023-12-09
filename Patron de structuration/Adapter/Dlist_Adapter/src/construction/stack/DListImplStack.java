package construction.stack;
import construction.dlist.DList;

public class DListImplStack extends DList implements Stack  {
   
	//fonction permettant d'inserer un element de la pile avec push() et dans la LDC d'inserer a la queue avec insertTail()
   public void push(Object o) {
	  insertHead(o);
	  insertTail(o);
	   
	
   }


    //fonction permettant de supprimer le dernier element de la pile et avec removeTail() de la liste chainée
	public Object pop() {
		   Object m = removeTail();
		  System.out.println(" L'element  de queue supprimé est " + m);
		   
		   Object m1 = removeHead();
		   System.out.println("L'element  de tête supprimé est " + m1);
		   
			return	m ;
		   
	   }
	  
	//fonction permetttant de retourner la queue de la pile et celle de la liste doublement chainée avec getTail()
	   public Object top() {
		   Object n = getTail();
		   System.out.println(" L'element obtenu en queue de liste est " + n);
		   Object n1 = getHead();
		   System.out.println(" L'element obtenu en tête  de liste est " + n1);
		           
		   return n;
	   }








   
   
}
