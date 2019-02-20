package creational.factory;

public class Client {
	
	public static void main(String[] args) {
		
		DecodedImage image;
		ImageReader reader = null;
		
		String picType = "gif";
		
		switch (picType) {
		case "gif":
			reader = new GifReader(picType);		
			break;

		case "jpeg":
			reader = new JpegReader(picType);	
			break;
		}
		
		image = reader.getDecodedImage();
		
		System.out.println(image);

	}


}
