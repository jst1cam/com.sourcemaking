package creational.singleton;

public class Client {

	public static void main(String[] args) {
		
		System.out.println(Singleton.SingletonHolder.getInstance());
		System.out.println(Singleton.SingletonHolder.getInstance());
		System.out.println(Singleton.SingletonHolder.getInstance());
		
		Singleton s1 = Singleton.SingletonHolder.getInstance();
		Singleton s2 = Singleton.SingletonHolder.getInstance();
		Singleton s3 = Singleton.SingletonHolder.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	

		

	}

}
