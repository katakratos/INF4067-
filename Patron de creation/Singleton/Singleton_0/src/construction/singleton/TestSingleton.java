package construction.singleton;

public class TestSingleton {

	public TestSingleton() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int som = Singleton.getInstance().somme(78,5);
		
		System.out.printf("la somme est de %d",som);
		
		Singleton s1 = Singleton.getInstance(8,3);
		s1.affiche();
		
		Singleton s2 = Singleton.getInstance(5,9);
		s2.affiche();

	}

}
