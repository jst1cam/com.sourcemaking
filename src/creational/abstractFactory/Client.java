package creational.abstractFactory;


public class Client {

	public static void main(String[] args) {
		
		AbstractFactory factory = AbstractFactory.setPlatformTool(architecture.INTEL);
		Cpu cpuProduct = factory.GetCpuProduct();
		Mmu mmuProduct = factory.GetMmuProduct();
		
		System.out.println(cpuProduct);
		System.out.println(mmuProduct);
		

	}

}
