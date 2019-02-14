package creational.builder;

public class SalamiPizzaBuilder extends PizzaBuilder{


	@Override
	public void setDough() {
		pizza.setDough("salami dough");
	}

	@Override
	public void setTopping() {
		pizza.setTopping("salami topping");
	}

	@Override
	public void setSauce() {
		pizza.setSauce("salami sauce");
	}
	
	
	

}
