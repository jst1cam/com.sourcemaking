package creational.builder;

public class Client {

	public static void main(String[] args) {
		
		Pizza readyPizza = null;
		
		PizzaBuilder salamiPizzaBuilder = new SalamiPizzabuilder();
		PizzaBuilder hawaiPizzaBuilder = new SalamiPizzabuilder();
		
		Waiter waiter = new Waiter();
		
		waiter.setPizzaBuilder(salamiPizzaBuilder);
		
		waiter.ConstructPizza();
		
		readyPizza = waiter.GetPizza();
		
		System.out.println(readyPizza.getPizzaProperties());
		
		
		
		

		
	}

}
