package creational.singleton;

public class Singleton {
	
	private static final class SingletonHolder{

		public static final Singleton INSTANCE = new Singleton();
		
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
