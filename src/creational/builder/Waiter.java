package creational.builder;

public class Waiter {

	PizzaBuilder pizzaBuilder;
	
	
	public void setPizzaBuilder(PizzaBuilder pb) {
		pizzaBuilder = pb;
	}


	public void ConstructPizza() {
		this.pizzaBuilder.createPizza();
		this.pizzaBuilder.setDough();
		this.pizzaBuilder.setTopping();
		this.pizzaBuilder.setSauce();		
	}


	public Pizza GetPizza() {
		// TODO Auto-generated method stub
		return pizzaBuilder.getPizza();
	}
	
	

}
