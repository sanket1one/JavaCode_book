//hash set
import java.util.*;

//set is a colection that cannot contain duplicate elements.
//add() -> add an object to the collection
//clear() -> Removes all object from the collection
//contains() -> Returns tru if a specified object is an element within the collection
//isEmpty()
//Brute Force
//set data structure
//hash map

//iterator()
//remove()
//size()

/* Set: Interface
 *  HashSet: Implementation
 * TreeSet: Implementation[sorted]
 * 
 * 
 * Properties:
 * 		1.Unordered Collection
 * 		2. Cannot store duplicate elements
 * 		3. IT has more implementation such as HashSet, TreeHashSet and TreeSet
 * 
 * TreeSet  contains elements in sorted order
 * */

public class SetInterface {
	public static void main(String[] args) {
		
		//set demonstration using  HashSet
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(10);
		hashSet.add(45);
		hashSet.add(67);
		hashSet.add(22);
		hashSet.add(89);

		
		for(int element: hashSet) {
			System.out.println(element+ "");
		}
		
		System.out.println(hashSet.isEmpty());	 	//return true, if Set is Empty
		System.out.println(hashSet.contains(10));	//return true, if the element is found
		System.out.println(hashSet.remove(10));		//return true, if the element was deleted
		System.out.println(hashSet.size());
//		hashSet.clear();//Delete all the elements
		
		System.out.println();
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(23);
		treeSet.add(4);
		treeSet.add(4);
		treeSet.add(10);
		
		for(int element: treeSet) {
			System.out.println(element+ " ");
		}
		// printing the hashset
		System.out.println(hashSet);
		
		
		//printing the sorted tree set
		TreeSet sortedSet = new TreeSet<Integer>(hashSet);
		 System.out.println("The sorted list is:");
         System.out.println(sortedSet);
         System.out.println((Integer)sortedSet.first());
         
		
		//converting HashSet to Array
         Integer[] hashSetValue = (Integer[]) sortedSet.toArray(new Integer[sortedSet.size()]);
         System.out.println(hashSetValue[2]);
         
	}
	
		
		
}