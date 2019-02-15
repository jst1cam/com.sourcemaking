package creational.builder;

public class HawaiPizzaBuilder extends PizzaBuilder {

	@Override
	protected void setTopping() {
		this.pizza.setTopping("hawai top");
		
	}

	@Override
	protected void setDough() {
		this.pizza.setDough("hawai dough");
		
	}

	@Override
	protected void setSauce() {
		this.pizza.setSauce("hawai sauce");
		
	}

}
