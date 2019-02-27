package creational.factory;

public class GifReader implements ImageReader {
	
	private DecodedImage DecodedImage;

	@Override
	public DecodedImage getDecodedImage() {
		return DecodedImage;
	}

	public GifReader(String image) {
		DecodedImage = new DecodedImage(image);
	}
	
	

}
