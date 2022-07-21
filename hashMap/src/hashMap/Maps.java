package hashMap;
import java.util.HashMap;


public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> empIds = new HashMap<>();
		empIds.put("sanket", 12345);
		empIds.put("aniket", 54321);
		empIds.put("suraj", 4567);
		
		System.out.println(empIds);
		
		System.out.println(empIds.get("sanket"));
		
		System.out.println(empIds.containsKey("suraj"));
		System.out.println(empIds.containsValue(12345));
		
		empIds.put("sanket", 98765); //if the value didn't exist it will add it to the map
		System.out.println(empIds);
		System.out.println(empIds.containsValue(12345));
		
		empIds.replace("sanket", 9876); // it will change the value if the key exist
		System.out.println(empIds);
		
		empIds.putIfAbsent("tejas",34562);
		System.out.println(empIds);
		
		empIds.remove("sanket");
		System.out.println(empIds);
		
	}

}
