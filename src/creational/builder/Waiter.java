package creational.builder;

public class Waiter {
	
	PizzaBuilder pizzaBuilder;

	public void setPizza(PizzaBuilder builder) {
		this.pizzaBuilder = builder;		
	}

	public void constructPizza() {
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.setDough();
		pizzaBuilder.setSauce();
		pizzaBuilder.setTopping();
	}

	public Pizza getPizza() {
		// TODO Auto-generated method stub
		return pizzaBuilder.getPizza();
	}

}
