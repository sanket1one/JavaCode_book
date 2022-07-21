import java.util.Arrays;

// Helps to work on primitive arrays

public class ArrayClassLearn {
	public static void main(String[] args) {
		// for binary search
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//		int index = Arrays.binarySearch(numbers, 4);
//		
//		System.out.println(index);
		
		Integer[] numbers = {10,2, 32, 12, 15, 76,17,  48, 79, 9};
//		Arrays.sort(numbers); // uses quick sort
		
		//parallel sort -> if number is greater that 8192 then only it use
		// multiple processor or else it use quick sort
		
//		Arrays.sort(numbers);
		
//		Arrays.fill(numbers, 12);
		
		for(int i : numbers) {
			System.out.print(i + " ");
		}
	}
}
