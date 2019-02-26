package creational.abstractFactory;

public class IntelFactory extends AbstractFactory{

	@Override
	public Cpu CreateCpuProduct() {
		// TODO Auto-generated method stub
		return new IntelCpu();
	}

	@Override
	public Mmu CreateMmuProduct() {
		// TODO Auto-generated method stub
		return new IntelMmu();
	}

}
