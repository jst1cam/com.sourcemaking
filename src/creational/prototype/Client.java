package creational.prototype;

import java.util.ArrayList;
import java.util.Collection;

public class Client {

	public static void main(String[] args) {
		
		String[] ar = new String[] {"Tom", "Dick", "Victoria"};
		
		for (String item : ar) {
			
			Person person = ProtoTypeContainer.getPrototype(item);
			
			if (person != null) {
				person.toString();
			}
			
		}
		

	}

}
