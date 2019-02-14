package creational.builder;

public class HawaiPizzabuilder extends PizzaBuilder{
	

	@Override
	public void setDough() {
		pizza.setDough("hawai dough");
	}

	@Override
	public void setTopping() {
		pizza.setTopping("hawai topping");
	}

	@Override
	public void setSauce() {
		pizza.setSauce("hawai sauce");
	}

}
