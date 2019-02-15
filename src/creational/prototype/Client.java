package creational.prototype;

public class Client {

	public static void main(String[] args) {
		
		
		String[] ar = new String[]{"tom", "dick", "harry", "victoria"};
	
		
		for (String type : ar) {			
			Person clonedPerson = Factory.getPrototypes(type);			
			if (clonedPerson != null) {
				System.out.println(clonedPerson);
					
			}			
		}
		


		

	}
}
