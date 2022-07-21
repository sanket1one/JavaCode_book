//Find pair with given sum in sorted Array
//given an array A of size N
//we need to find all pairs in the array that sum to a number equal  to k
//if no such pairs exists then output will be -1

//array elements are distinct and in a sorted order.



//output
//set(2,7)
//set(3,6)
//set(4,5)

public class problem1 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int high= arr.length -1;
		int sum = 9;
		int low = 0;
//				while(low<high)
//				{
//
//					if(arr[low]+arr[high] > sum) {
//						high--;						
//					}
//					else if(arr[low]+arr[high] < sum) {						
//						low++;
//					}
//					else if(arr[low]+arr[high] == sum) {
//						System.out.printf("set(%d,%d)\n",arr[low],arr[high]);
//								low++;
//								high--;
//					}
//				}
		
		
		while(low<high) {
			if(arr[low] + arr[high] < sum) {
				low++;
			}else if(arr[low] + arr[high] > sum) {
				high--;
			}else if(arr[low] + arr[high] == sum) {
				System.out.printf("%d,%d\n",arr[low],arr[high]);
					low++;
					high--;
			}
		}
	}		
}

