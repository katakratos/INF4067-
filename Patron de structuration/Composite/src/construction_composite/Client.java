package construction_composite;

public class Client {



	public static void main(String[] args) {
		
		//crée un dossier et les fichiers qu'on substitut  au dossier 
		Dossier dossier = new Dossier("Dossier Principal");
		dossier.ajouter(new FichierTxt("Texte1.Txt"));
		dossier.ajouter(new FichierPdf("PDF1.Pdf"));
		
		System.out.println("Contenu du dossier :");
		
		Dossier sousDossier = new  Dossier("Sous-dossier");//crée un sous-dossier du dossier
		sousDossier.ajouter(new FichierTxt("Texte2.Txt"));//on crée et on ajoute un fichier au sous dossier
		
		dossier.ajouter(sousDossier);//on ajoute le sosu-dossier au dossier
		dossier.decrire();  // decrire le dossier
		
		Dossier dossier1 = new Dossier("Dossier1 du sous-dossier principal");//on crée un dossier1
		
		dossier1.ajouter(new FichierPdf("PDF2.Pdf"));//on crée et ajoute un fichier pdf2 au dossier 1
		dossier1.ajouter(new FichierPdf("PDF3.Pdf"));//on crée et ajoute un fichier pdf3 au dossier1
		sousDossier.ajouter(dossier1); //on ajoute le dossier1 au sous-dossier;
		dossier1.decrire();//decrire le dossier1
		
		
		System.out.println("Contenu du dossier obtenu après spécification de l'élement souhaité :");
		
		Element premierElement = dossier.getElement(2);//on recupere er affiche l'élement 3 du dossier
		System.out.println( "Element n°"+ premierElement +" du dossier principal :");
		
		 if(premierElement != null) {
			 premierElement.decrire();
		 }  //Si l'element récupérer n'est pas vide on le decrit

	}

}
