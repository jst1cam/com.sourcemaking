package creational.prototype;

import java.util.ArrayList;
import java.util.Collection;

public class Client {

	public static void main(String[] args) {
		
		String[] myArgs = new String[] {"tom", "dick", "harry", "victoria"};
				
		for (String type : myArgs) {
			Person person = Prototype.getPerson(type);
			if (person != null) {
				System.out.println(person);		
			}		
		}
	
	}

}
