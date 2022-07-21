import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMapLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student("sanket",2));
		list.add(new Student("aniket",4));
		list.add(new Student("suraj",5));
		list.add(new Student("manoj",3));
		list.add(new Student("rohit",8));
		
		Student s1 = new Student("ubed",2);
		Student s2 = new Student("Tejas", 3);
		
		System.out.println(s1.compareTo(s2));
		
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		
		Collections.sort(list, (o1,o2)-> o1.name.compareTo(o2.name));
		
		
		System.out.println(list);
	}

}
