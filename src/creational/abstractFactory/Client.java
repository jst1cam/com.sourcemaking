package creational.abstractFactory;


public class Client {

	public static void main(String[] args) {
		
		AbstractFactory factory = AbstractFactory.getToolset(architecture.INTEL);

		System.out.println(factory.createProductCpu());
		System.out.println(factory.createProductMmu());

	}

}
