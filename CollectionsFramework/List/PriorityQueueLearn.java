import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Iterator;

public class PriorityQueueLearn {
	public static void main(String args[]) {
//		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		//Adding items to the pQueue using add()
//		pQueue.add(10);
//		pQueue.add(20);
//		pQueue.add(15);
//		
//		//Printing the top element of PriorityQueue
//		System.out.println(pQueue.peek());
//		
//		
//		// Printing the top element and removing it 
//		// from the PriorityQueue container
//		System.out.println(pQueue.poll());
//		
//		System.out.println(pQueue);
//		//Printing the top element again
//		System.out.println(pQueue.peek());
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
    
        System.out.println(pq);
        
        // using the method
//        pq.remove("Geeks");
//  
//        System.out.println("After Remove - " + pq);
//  
//        System.out.println("Poll Method - " + pq.poll());
//  
//        System.out.println("Final PriorityQueue - " + pq);
        
        //using the peek() method
//        String element = pq.peek();
//        System.out.println("Accessed Element: " + element);
//        
        
        Iterator iterator = pq.iterator();
        
        while(iterator.hasNext()) {
        	System.out.print(iterator.next() + " ");
        }
        
        Object[] arr = pq.toArray();
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr)); // convert multidimensional array to string
	}
}
