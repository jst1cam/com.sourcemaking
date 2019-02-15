package creational.factory;

public class GifReader extends ImageReader{
	
	protected DecodedImage decodedImage;

	public GifReader(String img) {
		this.decodedImage = new DecodedImage(img); 
	}

	/*
	public GifReader(String image) {
		super(image);
	}
	*/

	@Override
	DecodedImage getDecodedImage() {
		return decodedImage;
	}

}
