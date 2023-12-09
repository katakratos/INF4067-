package construction.adapter;
import construct.adaptee.ComposantPdf;

public class DocumentPdf   implements Document{
	protected ComposantPdf outilPdf = new ComposantPdf();

	@Override
	public void setContenu(String contenu) {
		outilPdf.pdfFixeContenu(contenu);
		
		
	}

	@Override
	public void dessine() {
		System.out.println("\n Dessine un document Pdf :" );
		outilPdf.pdfPrepareAffiche();
		outilPdf.pdfRafraichir();
		outilPdf.pdfTerminerAffichage();
	
	}

	@Override
	public void imprime() {
		 System.out.println("\n Imprime  le document Pdf  :" );
	     outilPdf.pdfEnvoieImprimante();
	    
	}
	
	

}
