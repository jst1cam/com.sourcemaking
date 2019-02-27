package creational.factory;

public class Client {
	
	public static void main(String[] args) {
		
		DecodedImage decodedImage = null;
		
		ImageReader reader = null;
		
		String type = "Jpg";
		
		switch (type) {
		
		case "Gif" : {
			reader = new GifReader(type);
			break;
		}
		case "Jpg" : {
			reader = new JpgReader(type);
			break;
		}
		}
		
		System.out.println(reader.getDecodedImage());
	

	}


}
