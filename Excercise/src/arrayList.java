import java.util.ArrayList;
import java.util.List;
public class arrayList {
	public static void main(String[] args)
	{
		//ArrayList = a resizable array.
		//			  Element can be added and removed after compilation phase
		//			  Store reference data types
		
		//we need to use the wrapper class instead of primitive data type
		List<String> food  = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi");
		food.remove(2);
//		int place = food.indexOf("sushi");
//		String value = food.get(1);
//		System.out.println(place);
////		food.clear();
		
		
		for(int i = 0; i < food.size(); i++)
		{
			System.out.println(food.get(i));
		}
		
		
		
		
	}
}
