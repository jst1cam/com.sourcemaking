package creational.factory;

public class JpegReader extends ImageReader{
	
	private DecodedImage decodedImage;

	public JpegReader(String image) {
		this.decodedImage = new DecodedImage(image);
	}

	@Override
	protected DecodedImage getDecodedImage() {
		// TODO Auto-generated method stub
		return decodedImage;
	}


}
