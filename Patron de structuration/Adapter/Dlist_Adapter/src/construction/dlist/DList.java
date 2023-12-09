package construction.dlist;
import construction.stack.DNode;
public class DList {
	DNode head;
	DNode tail;
	
	//nsérer un nouvel objet o après un nœud existant post
	public void insert(DNode post,Object o) {
		DNode newNode = new DNode(o);
	    newNode.next = post.next;
	    if (post.next != null) {
	        post.next.prev = newNode;
	    }
	    post.next = newNode;
	    newNode.prev = post;

	    if (post == tail) {
	        tail = newNode;
	    }
		
	}
	
	//fonction permettant de verifier l'element est present dans la liste
	public boolean contains(DNode post) {
	    DNode current = head;
	    while (current != null) {
	        if (current == post) {
	            return true;
	        }
	        current = current.next;
	    }
	    return false;
	}
	
	//supprimer un element
	public void remove (DNode post) {
		
		 if (!contains(post)) {
		        System.out.println("Le nœud n'est pas dans la liste.");
		        return;
		    }
		  if (post.prev != null) {
		        post.prev.next = post.next;
		    } else {
		        head = post.next;
		    }

		    if (post.next != null) {
		        post.next.prev = post.prev;
		    } else {
		        tail = post.prev;
		    }
	}
	
	//inserer un entete
	public void insertHead(Object o) {
		 DNode newNode = new DNode(o);
		    newNode.next = head;
		    if (head != null) {
		        head.prev = newNode;
		    }
		    head = newNode;
		    if (tail == null) {
		        tail = newNode;
		    }
		
	}
	
	//ajoute un nouvel objet à la fin de la liste
	public void insertTail(Object o) {
	    DNode newNode = new DNode(o);
	    if (tail != null) {
	        tail.next = newNode;
	        newNode.prev = tail;
	    }
	    tail = newNode;
	    if (head == null) {
	        head = newNode;
	    }
	}
	
	//supprime et renvoie l’objet au début de la liste
	public Object removeHead() {
	    if (head == null) {
	        return null;
	    }
	    Object object = head.object;
	    head = head.next;
	    if (head != null) {
	        head.prev = null;
	    } else {
	        tail = null;
	    }
	    return object;
	}

	//supprime et renvoie l’objet à la fin de la liste
	public Object removeTail() {
	    if (tail == null) {
	        return null;
	    }
	    Object object = tail.object;
	    tail = tail.prev;
	    if (tail != null) {
	        tail.next = null;
	    } else {
	        head = null;
	    }
	    return object;
	}

	//renvoie l’objet au début de la liste sans le supprimer
	public Object getHead() {
	    if (head == null) {
	        return null;
	    }
	    return head.object;
	}

	//renvoie l’objet à la fin de la liste sans le supprimer
	public Object getTail() {
	    if (tail == null) {
	        return null;
	    }
	    return tail.object;
	}
}
