package creational.abstractFactory;

public class IntelToolset extends AbstractFactory {

	@Override
	public Cpu CreateCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu();
	}

	@Override
	public Mmu CreateMmu() {
		// TODO Auto-generated method stub
		return new IntelMmu();
	}

}
