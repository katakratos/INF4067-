package application;

import construction.stack.Stack;


public class Gestion {
	
	//Ne connait que l'interface Stack
	private Stack stackObj;
	
    //fonction qui manipule les piles 
	public  void manipulerPiles(Object o) {
		
		System.out.println("-----  Debut -----"); 
		//inserer des element dans la pile
		stackObj.push("Hello");
		stackObj.push("World");
		stackObj.push("How ");
		stackObj.push("are");
		stackObj.push("you");

		stackObj.push(o);
		
		System.out.println("LA tête de liste est " +stackObj.top());//affiche tête de liste
		System.out.println("l'élement suprimmer en queue de liste est " + stackObj.pop());//remove "Hello"
		
		/*System.out.println(stackObj.top()); // Affiche "You"
		System.out.println(stackObj.pop());// remove "world"*/
		
	    System.out.println("----- Fin -----");
		
	}
	//permet d'injecter l'implementation du choix à l'interface Stack
	public void setStack(Stack stackObj) {
		this.stackObj= stackObj;
	}

}
