package creational.builder;

public abstract class PizzaBuilder {
	
	Pizza pizza;

	public void createNewPizzaProduct() {
		pizza = new Pizza();		
	}

	public Pizza getPizza() {
		return pizza;
	}
	
	protected abstract void setTopping();
	protected abstract void setDough();
	protected abstract void setSauce();

}
