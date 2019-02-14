package creational.factory;

public class DecodedImage {
	
	private String image;

	public DecodedImage(String image2) {
		this.image = image2;
	}

	@Override
	public String toString() {
		return image + " is decoded";
	}
	
	

}
