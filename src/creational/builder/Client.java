package creational.builder;

public class Client {

	public static void main(String[] args) {
		
		Waiter waiter = new Waiter();
		
		PizzaBuilder salamiPizzaBuilder = new SalamiPizzaBuilder();
		PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();
		
		waiter.setPizzaBuilder(salamiPizzaBuilder);
		waiter.ConstructPizza();		
		Pizza newPizza = waiter.getPizza();
		
		System.out.println(newPizza.getSauce() + ", " + newPizza.getDough() + ", " + newPizza.getTopping());

		
	}

}
