package creational.factory;

public class Client {
	
	public static void main(String[] args) {
		
		String image = "gif";
		
		ImageReader imageReader = null;
		DecodedImage decodedImage;
		
		imageReader = new GifReader(image);
		
		decodedImage = imageReader.getDecodedImage();
		
		System.out.println(decodedImage);
	

	
	}


}
