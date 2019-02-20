package creational.factory;

public class GifReader extends ImageReader{
	
	private DecodedImage decodedImage;

	@Override
	protected DecodedImage getDecodedImage() {
		// TODO Auto-generated method stub
		return decodedImage;
	}

	public GifReader(String image) {
		this.decodedImage = new DecodedImage(image);
	}

}
