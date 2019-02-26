package creational.prototype;

public class Dick implements Person{
	
	private final String NAME = "Dick";

	@Override
	public Person myClone() {
		// TODO Auto-generated method stub
		return new Dick();
	}
	
	@Override
	public String toString() {
		return NAME;
	}

}
