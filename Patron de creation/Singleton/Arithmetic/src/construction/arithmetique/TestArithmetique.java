package construction.arithmetique;

public class TestArithmetique {

	

	public TestArithmetique() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
     int som = Arithmetique.getInstance().somme(7,5);
     int soust = Arithmetique.getInstance().soustraction(2,5);
     int multip = Arithmetique.getInstance().multiplication(7,5);
     float moy = Arithmetique.getInstance().moyenne(7,5);
     
		
		System.out.printf("la somme est de %d",som);
		System.out.printf("\nla Soustraction est de %d",soust);
		System.out.printf(" \nla multiplication est de %d",multip);
		System.out.printf("\nla moyenne est de %f",moy);
		
		Arithmetique s1 = Arithmetique.getInstance(8,3);
		s1.affiche();
		
		
		Arithmetique s2 = Arithmetique.getInstance(5,9);
		s2.affiche();


	}

}
