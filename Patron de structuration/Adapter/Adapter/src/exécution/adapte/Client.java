package exécution.adapte;
import construction.adapter.DocumentPdf;
import construction.adapter.DocumentHtml;
public class Client {

	public static void main(String[] args) {
		
		System.out.println("-------- Je suis un document HTML -------\n");
		ServeurWeb serveurWeb = new ServeurWeb();
		serveurWeb.setDocument(new DocumentHtml());
		serveurWeb.créerDocument("Document Html du site de Zero");
		serveurWeb.gérerDocument("Document Html du site de Zero");
		
		System.out.println("\n-------- Je suis un document PDF -------\n");
		ServeurWeb serveurWeb1 = new ServeurWeb();
		serveurWeb1.setDocument(new DocumentPdf());
		serveurWeb1.créerDocument("Document Pdf du site de Zero");
		serveurWeb1.gérerDocument("Document pdf du site de Zero");
		
		
	    
	   
	}

}
