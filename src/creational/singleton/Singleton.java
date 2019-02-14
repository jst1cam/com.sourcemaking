package creational.singleton;

public class Singleton {
	
	public static class SingletonHolder{
		private final static Singleton INSTANCE = new Singleton();	
		
		public static Singleton getInstance() {
			return INSTANCE;
		}
	}
	
	

}
