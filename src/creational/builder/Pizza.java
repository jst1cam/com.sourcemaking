package creational.builder;

public class Pizza {
	
	private String Topping = "";
	private String Dough = "";
	private String Sauce = "";
	
	
	public void setTopping(String topping) {
		Topping = topping;
	}
	public void setDough(String dough) {
		Dough = dough;
	}
	public void setSauce(String sauce) {
		Sauce = sauce;
	}
	
	
	public String getTopping() {
		return Topping;
	}
	public String getDough() {
		return Dough;
	}
	public String getSauce() {
		return Sauce;
	}
	
	
	
	

}
