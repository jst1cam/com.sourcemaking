package creational.prototype;

public class Dick implements Person{
	
	private final static String NAME = "Dick";

	@Override
	public Person MyClone() {
		// TODO Auto-generated method stub
		return new Dick();
	}
	
	@Override
	public String toString() {
		return NAME;
	}

}
