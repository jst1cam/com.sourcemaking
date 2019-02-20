package creational.abstractFactory;

public abstract class AbstractFactory {
	
	private static final AbstractFactory INTELTOOLSET = new IntelToolSet();
	private static final AbstractFactory AMDTOOLSET = new AmdToolSet();
	
	public static AbstractFactory setPlatformTool(architecture type) {
		
		AbstractFactory factory = null;
		
		switch (type) {
		case INTEL:
			factory = INTELTOOLSET;
			break;
			
		case AMD:
			factory = AMDTOOLSET;
			break;
			}
		
		return factory;
	}
	
	
	public abstract Cpu GetCpuProduct();
	public abstract Mmu GetMmuProduct();
	
}
