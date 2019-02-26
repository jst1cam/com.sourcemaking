package creational.singleton;

public class Singleton {
	
	public static class SingletonHolder{		
		private static final Singleton INSTANCE = new Singleton();		
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
