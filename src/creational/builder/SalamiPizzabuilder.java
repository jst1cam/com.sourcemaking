package creational.builder;

public class SalamiPizzabuilder extends PizzaBuilder {

	@Override
	protected void setDough() {
		pizza.setDough("salami dough");
		
	}

	@Override
	protected void setTopping() {
		pizza.setTopping("salami top");
		
	}

	@Override
	protected void setSauce() {
		pizza.setSauce("salami sauce");
		
	}

}
