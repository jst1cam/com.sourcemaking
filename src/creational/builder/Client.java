package creational.builder;

public class Client {

	public static void main(String[] args) {
		
		Waiter waiter = new Waiter();
		
		PizzaBuilder salamiBuilder = new SalamiPizzaBuilder();
		//PizzaBuilder hawaiBuilder = new HawaiPizzabuilder();
		
		waiter.setPizza(salamiBuilder);
		
		waiter.constructPizza();
		
		Pizza readyPizza = waiter.getPizza();
		
		System.out.println(readyPizza);
		
		System.out.println(
				readyPizza.getDough() + ", " +
				readyPizza.getSauce() + ", " +
				readyPizza.getTopping());
		

		
		
	}

}
