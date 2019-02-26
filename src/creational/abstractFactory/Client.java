package creational.abstractFactory;


public class Client {

	public static void main(String[] args) {
		
		AbstractFactory factory =  AbstractFactory.getFactory(architecture.AMD);
		
		factory.CreateCpuProduct();
		factory.CreateMmuProduct();

	}

}
