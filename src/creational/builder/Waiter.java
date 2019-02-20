package creational.builder;

public class Waiter {
	
	private PizzaBuilder builder;
	
	public void ConstructPizza() {
		builder.createNewPizza();
		builder.setDough();
		builder.setSauce();
		builder.setTopping();
	}
	
	Pizza getPizza() {
		return builder.getPizza();
	}

	public void setPizzaBuilder(PizzaBuilder salamiPizzaBuilder) {
		this.builder = salamiPizzaBuilder;
		
	}

}
