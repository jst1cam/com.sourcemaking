package creational.builder;

public class HawaiPizzaBuilder extends PizzaBuilder{
	
	@Override
	void setTopping() {
		this.pizza.setTopping("hawai top");	
	}

	@Override
	void setDough() {
		this.pizza.setDough("hawai dough");	
	}

	@Override
	void setSauce() {
		this.pizza.setSauce("hawai sauce");
	}

}
