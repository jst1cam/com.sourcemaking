package creational.abstractFactory;

public class IntelPlatform extends AbstractFactory{

	@Override
	public Cpu createProductCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu();
	}

	@Override
	public Mmu createProductMmu() {
		// TODO Auto-generated method stub
		return new AmdMmu();
	}

}
