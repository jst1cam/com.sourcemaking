package creational.abstractFactory;

public class IntelToolSet extends AbstractFactory{

	@Override
	public Cpu GetCpuProduct() {
		// TODO Auto-generated method stub
		return new IntelCpu();
	}

	@Override
	public Mmu GetMmuProduct() {
		// TODO Auto-generated method stub
		return new IntelMmu();
	}

}
