package constructeur.templatMethod;

public class CommandeGabon extends Commande{
    public float montantPrestationHt;
    public float montantMaterielHt;
    
    @Override
    // je reduis le calcul de la Tva du Gabon à 15% pour simplifier les calcule car on aucune information sur les montants de prestations
	protected void calculeTva() {
	   montantTva = montantHt * 0.15;
	}
}
