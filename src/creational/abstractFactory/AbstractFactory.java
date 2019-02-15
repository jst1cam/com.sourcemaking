package creational.abstractFactory;

public abstract class AbstractFactory {
	
	private final static AbstractFactory AmdPlatformToolset = new AmdPlatform(); 
	private final static AbstractFactory IntelPlatformToolset = new IntelPlatform();
	
	public static AbstractFactory getToolset(architecture setup) {
		
		AbstractFactory factory = null;
		switch (setup) {
		
		case INTEL : {
			factory = IntelPlatformToolset;
		}
		
		case AMD : {
			factory = AmdPlatformToolset;
		}

		}	
		return factory;
	}
	
	
	public abstract Cpu createProductCpu();
	public abstract Mmu createProductMmu();

}
