package creational.factory;

public class Client {
	
	public static void main(String[] args) {
		 
		String image = "gi1f";
		
		//ImageReader reader = new GifReader(image);
		ImageReader reader = new JpgReader(image);
		
		DecodedImage decodedImage = reader.getDecodedImage();
		
		System.out.println(decodedImage);
		

	
	}


}
