//Map keys value pair
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapLearn {
	
	public static void main(String args[]) {
//		Map<String, Integer> numbers = new HashMap<>();
		Map<String, Integer> numbers = new TreeMap<>();
		
//		sort the list according to the keys
		
		
		
		
		//Key should be unique and value become override
		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("Three",3);
		
//		if(!numbers.containsKey("two")) {
//			numbers.put("Two",23);
//		}
		
		numbers.putIfAbsent("Two", 23);
		numbers.containsKey("two");
		numbers.containsValue(3);
		System.out.println(numbers.isEmpty());
		
		numbers.remove("Three");
		
		
		System.out.println(numbers);
		
		for(Map.Entry<String, Integer> e: numbers.entrySet()) {
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());	
		}
		
		for(String key:numbers.keySet()) { //keySet only return the key set
			System.out.println(key);
		}
		
		for(Integer value: numbers.values()) {
			System.out.println(value);
		}
		
	}

}
