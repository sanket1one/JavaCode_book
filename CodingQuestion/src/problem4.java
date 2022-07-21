import java.util.*;
//sum of once place digit
public class problem4 {
	public static void main(String[] args) {
		//no. of test cases
		//no. of element in that list
		//no. of space seperated list
		//3
		
		/*INPUT*/
//		4
//		5 15 25 3
//		3
//		13 2 1
//		2
//		5 3
		
		/*OUTPUT*/
//36
		Scanner scan = new Scanner(System.in);
		System.out.println("no.of TestCases: ");
		int testCases = scan.nextInt();
		int n;
		int totalValue = 0;
		for(int i=0; i<testCases; i++) {
			System.out.println("no. of elements in the list");
			n = scan.nextInt();
			int value[] = new int[n];
			for(int j= 0; j< n; j++) {
				value[j] = scan.nextInt();
			}
			totalValue += addValue(value);
		}		
		System.out.println(totalValue);
	}
	
	public static int addValue(int arr[]) {
		int sum = 0;
		for(int x: arr) {
			if(x/10 == 0) {
				sum += x;
			}else {
					sum+= (x/10) + (x%10); 
			}
		}
		return sum;
	}
}
