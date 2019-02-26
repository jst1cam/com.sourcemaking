package creational.abstractFactory;

public class AmdFactory extends AbstractFactory{

	@Override
	public Cpu CreateCpuProduct() {
		// TODO Auto-generated method stub
		System.out.println("create new amd cpu.");
		return new AmdCpu();
	}

	@Override
	public Mmu CreateMmuProduct() {
		// TODO Auto-generated method stub
		System.out.println("create new intel cpu.");
		return new AmdMmu();
	}

}
