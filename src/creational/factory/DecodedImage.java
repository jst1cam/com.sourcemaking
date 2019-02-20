package creational.factory;

public class DecodedImage {
	
	String image;
	
	public DecodedImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return image + " is decoded.";
	}
	
	


}
