package creational.builder;

public class Client {

	public static void main(String[] args) {
		
		Pizza readyPizza;
		
		Waiter waiter = new Waiter();
		
		PizzaBuilder salamiPizzaBuilder = new SalamiPizzaBuilder();
		PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();

		waiter.setPizzaBuilder(salamiPizzaBuilder);
		
		waiter.constructPizza();
		
		readyPizza = waiter.getPizza();
		
		System.out.println(readyPizza);
		
	}

}
