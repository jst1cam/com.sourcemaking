package creational.prototype;

public class Harry implements Person{ 
	
	private final static String NAME = "Harry";
	
	@Override
	public Person MyClone() {
		// TODO Auto-generated method stub
		return new Harry();
	}

	@Override
	public String toString() {
		return NAME;
	}
	
	



}


