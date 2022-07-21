import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListLearn {
	public static void main(String[] args) {
		ArrayList<Integer> students = new ArrayList<>();
		students.add(1);
		students.add(2);
		students.add(3);
		students.add(4);
		students.add(2);
		
		System.out.println(students);
		students.remove(Integer.valueOf(2));
		System.out.println(students);
		
		
		
		//method overloading
//		students.add(1,50);
		
		//new list
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(20);
//		list.add(30);
		
		// adding all the elements in the new list
//		list.addAll(students);
//		
//		System.out.println(list);
		/*	add() -> add the element in ordered form
		 * 	add(index,value) -> add element at specific position // O(n)
		 * 	list.addAll("prevList") -> adding all the element of prevList into list
		 * 
		 * 	get(index) -> return value at specific position
		 * 
		 * 	remove(index) -> remove the element at that index // O(n) complexity
		 * 	remove(Integer.valueOf("value") -> if the value present in the list it will remove it 
		 * 
		 * 	clear() -> remove all the element in the list
		 * 
		 *  list.set(index,1000) -> change the element at index by 1000// O(n)
		 *  
		 *  list.contains(value) -> return boolean  if the contain value in the list
		 * */
		
		//Iterating through the list
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println("the element is "+ list.get(i));
//		}
//		
//		for(Integer element: list) {
//			System.out.println("forEach element is:" + element);
//		}
//		
//		//help to iterate thourgh the list
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println("iterator " + it.next());
//		}
		/*
		 * 
		 * */
		
		
				
	}
}
