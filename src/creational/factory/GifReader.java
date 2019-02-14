package creational.factory;

public class GifReader extends ImageReader{
	
	private DecodedImage decodedImage;

	public GifReader(String image) {
		this.decodedImage = new DecodedImage(image);
	}

	@Override
	public DecodedImage getDecodedImage() {
		// TODO Auto-generated method stub
		return decodedImage;
	}

}
