package creational.abstractFactory;

public abstract class AbstractFactory {
	
	private static final AbstractFactory AMD_FACTORY = new AmdFactory();
	private static final AbstractFactory INTEL_FACTORY = new IntelFactory();
	
	public static AbstractFactory getFactory(architecture ar) {
		
		AbstractFactory abstractFactory = null;
		
		switch(ar) {
		
		case INTEL : {
			abstractFactory = INTEL_FACTORY;
			break;
		}
		
		case AMD : {
			abstractFactory = AMD_FACTORY;
			break;
		}
		}
		return abstractFactory;
	
	}


	protected abstract Cpu CreateCpuProduct();
	protected abstract Mmu CreateMmuProduct();
	
}
