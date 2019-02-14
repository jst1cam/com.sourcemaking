package creational.builder;

public class Pizza {
	
	private String sauce = "";
	private String topping = "";
	private String dough = "";
	
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	
	public String getSauce() {
		return sauce;
	}
	
	public String getTopping() {
		return topping;
	}
	
	public String getDough() {
		return dough;
	}
	
	
	
	
	

}
