package creational.abstractFactory;

public class AmdToolset extends AbstractFactory {

	@Override
	public Cpu CreateCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu();
	}

	@Override
	public Mmu CreateMmu() {
		// TODO Auto-generated method stub
		return new AmdMmu();
	}

}
