package creational.builder;

public abstract class PizzaBuilder {
	
	protected Pizza pizza;
	
	abstract void setTopping();
	abstract void setDough();
	abstract void setSauce();
	
	public Pizza createNewPizza() {
		return this.pizza = new Pizza();		
	}
	public Pizza getPizza() {
		return pizza;
	}

}
