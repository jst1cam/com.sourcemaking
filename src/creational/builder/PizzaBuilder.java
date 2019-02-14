package creational.builder;

public abstract class PizzaBuilder {
	
	Pizza pizza;
	
	/*
	public PizzaBuilder() {
		super();
		this.pizza = new Pizza();
	}
	*/
	
	public abstract void setDough();
	public abstract void setTopping();
	public abstract void setSauce();


	public void createNewPizzaProduct() {
		this.pizza = new Pizza();
		
	}
	public Pizza getPizza() {
		// TODO Auto-generated method stub
		return pizza;
	}
	

}
