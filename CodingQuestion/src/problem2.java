import java.util.*;

// print Duplicate element in array
/*Input : {1,5,4,2,1,4,7}
 * output: {1,4}
 * */

public class problem2 {
	public static void main(String[] args) {
		int arr[] = {1,5,4,2,1,4,7};
		Set<Integer> hashString = new HashSet<>();
		boolean isUnique = false;
		
		for(int i = 0; i <arr.length-1; i++) {
				if(hashString.contains(arr[i])) {
					isUnique = true;
					System.out.println(arr[i]);
				}else {
					hashString.add(arr[i]);
				}
		}
	}
}

