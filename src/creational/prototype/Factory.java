package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	
	
	private static final Map<String, Person> protoypes = new HashMap<String, Person>();
	
	static {
		protoypes.put("tom", new Tom());
		protoypes.put("harry", new Harry());	
	}
	
	
	public static Person getPrototypes(String type) {	
		try {
			 return protoypes.get(type).MyClone();
		} catch (Exception e) {
			System.out.println("person with " + type + " does not exist.");
			return null;
		}
	}
	
	
	

}
