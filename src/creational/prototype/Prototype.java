package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Prototype {
	
	private static final Map<String, Person> prototypeHolder = new HashMap<String, Person>();
	
	static {
		prototypeHolder.put("tom", new Tom());
		prototypeHolder.put("harry", new Harry());
		prototypeHolder.put("dick", new Dick());
	}
	
	public static Person getPerson(String type) {
		
		try {
			return prototypeHolder.get(type).MyClone();
		} catch (Exception e) {
			System.out.println("There is no person with name: " + type + " exist.");
			return null;
		}
		
	}

}
