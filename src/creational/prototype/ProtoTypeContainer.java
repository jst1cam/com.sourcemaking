package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ProtoTypeContainer {
	
	private static final Map<String, Person> protoypes = new HashMap<String, Person>();
	
	static {
		protoypes.put("Tom", new Tom());
		protoypes.put("Dick", new Dick());
		protoypes.put("Harry", new Harry());
	}
	
	
	public static Person getPrototype(String key) {
		
		try {		
			return protoypes.get(key).myClone();
			
		} catch (Exception e) {
			System.out.println("there is not person witn name: " + key);
			return null;
		}
	
	}
	
	

}
