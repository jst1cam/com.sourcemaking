package creational.builder;

public class Pizza {
	
	protected String dough = "";
	
	protected String topping = "";
	
	protected String sauce = "";

	
	
	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getPizzaProperties() {
		return dough + ", " + topping + ", " + sauce; 
		
	}
	
	
	
	
	
	

}
