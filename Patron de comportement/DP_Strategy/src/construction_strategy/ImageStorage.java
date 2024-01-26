package construction_strategy;

public class ImageStorage {
	
	static Compressor compressor ;
	static      Filter  filter ;
	
	public static void store(String image) {
		System.out.println("sauvegarde de l'image \t"+ image);
		
	}
	public static void main (String[] args) {
		System.out.println("-----------------");
		store("Aigle.png");
		compressor= new PngCompressor();
		compressor.compressor();
		filter = new BlackAndWhiteFilter();
		filter.apply();
		
		
		System.out.println("\n--------------- ");
		store("Orange.jpeg");
		 compressor = new JpegCompressor(); 
		 compressor.compressor();
		 filter = new HighContrastFilter();
	     filter.apply();
		
	     System.out.println("\n--------------- ");
			store("Aigle.png");
			 compressor = new PngCompressor(); 
			 compressor.compressor();
			 filter = new HighContrastFilter();
		     filter.apply();
		     
		     System.out.println("\n--------------- ");
				store("Orange.jpeg");
				 compressor = new JpegCompressor(); 
				 compressor.compressor();
				 filter = new BlackAndWhiteFilter();
			     filter.apply();
		
	}

}
