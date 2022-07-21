import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class CollectionClassLearn {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(28);
		list.add(13);
		list.add(55);
		list.add(22);
		list.add(90);
		list.add(24);
		
		System.out.println(Collections.min(list));
		System.out.println(Collections.frequency(list, 90));
		
		Collections.sort(list,Comparator.reverseOrder());
		
		
		System.out.println(list);
		

		
	}
}
