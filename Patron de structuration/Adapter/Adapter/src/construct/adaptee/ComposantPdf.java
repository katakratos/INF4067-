package construct.adaptee;

public class ComposantPdf {
  protected String contenu;
 
 public void  pdfFixeContenu(String contenu) {
	 this.contenu = contenu;
	 
 }
 
 public void pdfPrepareAffiche() {
	 System.out.println(" Prépare l'affichage du document Pdf :"+contenu);
 }
 
 public void pdfRafraichir() {
	 System.out.println("Raffraichit l'affichage du documentPdf :"+contenu);
	 
 }
 
 public void pdfTerminerAffichage() {
	 System.out.println("Terminé l'affichage un document Pdf :"+contenu);
 }
 
 public void pdfEnvoieImprimante() {
	 System.out.println("Envoie le documentPdf à l'imprimante:"+this.contenu);
 }
}
