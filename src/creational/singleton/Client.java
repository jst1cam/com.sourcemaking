package creational.singleton;

public class Client {

	public static void main(String[] args) {
		
		//non singleton
		Singleton s1  = new Singleton();
		Singleton s2  = new Singleton();
		Singleton s3  = new Singleton();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		//singleton
		Singleton ss1  = Singleton.getInstance();
		Singleton ss2  = Singleton.getInstance();
		Singleton ss3  = Singleton.getInstance();
		
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		
		

	}

}
