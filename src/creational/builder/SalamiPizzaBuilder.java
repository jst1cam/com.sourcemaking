package creational.builder;

public class SalamiPizzaBuilder extends PizzaBuilder {

	@Override
	protected void setTopping() {
		this.pizza.setTopping("salami top");
		
	}

	@Override
	protected void setDough() {
		this.pizza.setDough("salami dough");
		
	}

	@Override
	protected void setSauce() {
		this.pizza.setSauce("salami sauce");
		
	}

}
