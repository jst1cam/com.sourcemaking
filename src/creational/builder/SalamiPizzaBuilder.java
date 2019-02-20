package creational.builder;

public class SalamiPizzaBuilder extends PizzaBuilder{

	@Override
	void setTopping() {
		this.pizza.setTopping("salami top");	
	}

	@Override
	void setDough() {
		this.pizza.setDough("salami dough");	
	}

	@Override
	void setSauce() {
		this.pizza.setSauce("salami sauce");
	}

}
