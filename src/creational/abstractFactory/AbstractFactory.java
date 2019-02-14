package creational.abstractFactory;

public abstract class AbstractFactory {
	
	protected static final IntelToolset intelToolset = new IntelToolset();
	protected static final AmdToolset amdToolset = new AmdToolset();

	protected static AbstractFactory SetTool(architecture setup) {
		
		AbstractFactory factory = null;
		
		switch(setup) {
		
		case INTEL : {
			factory = intelToolset;
			break;
		}
		
		case AMD : {
			factory = amdToolset;
			break;
		}
			
		}
		return factory;
	}
	
	public abstract Cpu CreateCpu();
	public abstract Mmu CreateMmu();

}
