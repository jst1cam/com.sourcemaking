package creational.prototype;

public class Client {

	public static void main(String[] args) {
		
		String[] arg = new String[] {"tom", "tom", "tom", "harry", "victoria"};
		

		for (String type : arg) {
			
			Person prototype;
			
			prototype = Factory.getPrototypes(type);
			
			System.out.println(prototype);
		
		}

		

	}
}
