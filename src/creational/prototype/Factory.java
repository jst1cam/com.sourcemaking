package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	
	private static final Map<String, Person> prototypes = new HashMap<String, Person>();
	
	static {
		prototypes.put("tom", new Tom());
		prototypes.put("dick", new Dick());
		prototypes.put("harry", new Harry());
	}

	public static Person getPrototypes(String type) {
		
		try {
			return prototypes.get(type).MyClone();
			
		} catch (Exception e) {
			System.out.println("person with name " + type + " does not exist.");
			return null;
		}
	}
	
	

}
