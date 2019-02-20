package creational.abstractFactory;

public class AmdToolSet extends AbstractFactory{

	@Override
	public Cpu GetCpuProduct() {
		// TODO Auto-generated method stub
		return new AmdCpu();
	}

	@Override
	public Mmu GetMmuProduct() {
		// TODO Auto-generated method stub
		return new AmdMmu();
	}

}
