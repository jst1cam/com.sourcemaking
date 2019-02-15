package creational.builder;

public class Pizza {
	
	private String topping = "";
	private String sauce = "";
	private String dough = "";
	
	
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	
	
	@Override
	public String toString() {
		return "Pizza [topping=" + topping + ", sauce=" + sauce + ", dough=" + dough + "]";
	}
	
	
	
	

}
