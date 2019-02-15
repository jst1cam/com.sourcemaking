package creational.builder;

public class Waiter {
	
	PizzaBuilder builder;

	public void setPizzaBuilder(PizzaBuilder salamiPizzaBuilder) {
		builder = salamiPizzaBuilder;
		
	}

	public void constructPizza() {
		builder.createNewPizzaProduct();
		builder.setTopping();
		builder.setDough();
		builder.setSauce();		
	}

	public Pizza getPizza() {
		// TODO Auto-generated method stub
		return builder.getPizza();
	}

}
