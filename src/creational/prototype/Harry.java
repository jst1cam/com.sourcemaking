package creational.prototype;

public class Harry implements Person{
	
	private final String NAME = "Harry";

	@Override
	public Person myClone() {
		// TODO Auto-generated method stub
		return new Harry();
	}
	
	@Override
	public String toString() {
		return NAME;
	}

}
