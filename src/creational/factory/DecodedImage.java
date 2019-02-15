package creational.factory;

public class DecodedImage {
	
	protected String image;

	public DecodedImage(String img) {
		this.image = img;
	}

	@Override
	public String toString() {
		return image + " is decoded.";
	}
	
	

}
