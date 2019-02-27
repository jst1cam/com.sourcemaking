package creational.builder;

public abstract class PizzaBuilder {
	
	Pizza pizza;

	public void createPizza() {
		this.pizza = new Pizza();
		
	}

	protected abstract void setDough();

	protected abstract void setTopping();

	protected abstract void setSauce();

	protected Pizza getPizza() {
		return pizza;
		
	}

}
