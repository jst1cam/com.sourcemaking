package creational.abstractFactory;

public class AmdPlatform extends AbstractFactory{

	@Override
	public Cpu createProductCpu() {
		return new IntelCpu();
	}

	@Override
	public Mmu createProductMmu() {
		return new IntelMmu();
	}

}
