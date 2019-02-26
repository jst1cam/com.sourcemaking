package creational.prototype;

public class Tom implements Person{
	
	private final String NAME = "Tom";

	@Override
	public Person myClone() {
		// TODO Auto-generated method stub
		return new Tom();
	}

	@Override
	public String toString() {
		return NAME;
	}
	
	
	
	

}
