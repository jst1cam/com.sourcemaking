package creational.factory;

public class JpgReader extends ImageReader{
	
	private DecodedImage decodedImage;
	
	public JpgReader(String image) {
		this.decodedImage = new DecodedImage(image);
	}

	@Override
	public DecodedImage getDecodedImage() {
		// TODO Auto-generated method stub
		return decodedImage;
	}
	


}
