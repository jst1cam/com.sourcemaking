package creational.singleton;

public class Singleton {
	
	private static class SingletonHolder{
		private final static Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return Singleton.SingletonHolder.INSTANCE;
	}

}
