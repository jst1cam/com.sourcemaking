package creational.factory;

public class JpgReader extends ImageReader{
	
	protected DecodedImage decodedImage;
	
	public JpgReader(String img) {
		this.decodedImage = new DecodedImage(img); 
	}
	
	/*
	public JpgReader(String image) {
		super(image);
	}
	*/
	
	@Override
	DecodedImage getDecodedImage() {
		return decodedImage;
	}

}
