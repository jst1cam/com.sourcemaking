package creational.singleton;

public class Client {

	public static void main(String[] args) {
		
		Singleton i1 = Singleton.getInstance();
		Singleton i2 = Singleton.getInstance();
		Singleton i3 = Singleton.getInstance();
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);


	}

}
