package exécution.adapte;

import construction.adapter.Document;

public class ServeurWeb {
   private Document document;
   
   public void créerDocument(String str) {
	   System.out.println("##############");
	   System.out.println("*************");
	   document.setContenu(str);
	   document.dessine();
	 
	   
   }
   
   public void gérerDocument(String str) {
	  
	   document.imprime();
	   
	   System.out.println("##############\n");
   }
   
   public void setDocument(Document document) {
	   this.document = document;
   }
}
