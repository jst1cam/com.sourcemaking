package creational.factory;

public class JpgReader implements ImageReader {

	private DecodedImage DecodedImage;

	@Override
	public DecodedImage getDecodedImage() {
		return DecodedImage;
	}
	
	public JpgReader(String image) {
		DecodedImage = new DecodedImage(image);
	}
	
	
}
