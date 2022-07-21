import java.util.*;
//find Common element in three Sorted Arrays

public class problem3 {
	public static void main(String args[]) {
		int arr1[] = {1,5,10,20,40,80};
		int arr2[] = {6,7,20,80,100};
		int arr3[] = {3,4,15,20,30, 70,80,120};
		//Beginner approach brut force
		
//		
//		for(int i = 0; i < arr1.length; i++) {
//			for(int j = 0; j< arr2.length; j++) {
//				for(int k = 0; k < arr3.length; k++) {
//					if(arr1[i] == arr2[j] && arr2[j] == arr3[k] )
//					{
//						System.out.println(arr3[k]);
//					}
//				}
//			}
//		}
		
		commonElements(arr1,arr2,arr3);
	}
//	public static void commonElements(int arr[],int arr2[],int arr3[]) {
//		int  x= 0,y =0, z = 0;
//		Set<Integer> uniqueValue1 = new HashSet<>();
//		Set<Integer> uniqueValue2 = new HashSet<>();
//		Set<Integer> uniqueValue3 = new HashSet<>();
//		boolean isContain = false;
//		
//		for(int element: arr) {
//			uniqueValue1.add(element);
//		}
//		
//		
//		for(int i = 0; i < arr.length-1; i++) {
//			if(uniqueValue1.contains(arr2[i])) {
//				uniqueValue1.add(arr2[i]);
//			}else {
//				isContain = false;
//			}
//		}
//		
//		for(int i = 0; i< arr3.length-1; i++) {
//			if(uniqueValue1.contains(arr3[i])) {
//				System.out.println(arr3[i]);
//			}else {
//				isContain = true;
//			}
//		}
//	}
	
	
	public static void commonElements(int arr1[],int arr2[],int arr3[]) {
		int x =0,y = 0,z=0;
//		int arr1[] = {1,5,10,20,40,80};
//		int arr2[] = {6,7,20,80,100};
//		int arr3[] = {3,4,15,20,30, 70,80,120};


		while(x < arr1.length && y < arr2.length && z< arr3.length)
		{
			if(arr1[x] == arr2[y] && arr2[y] == arr3[z])
			{
				System.out.println(arr1[x]);
				x++;
				y++;
				z++;
			}
			else if(arr1[x] > arr2[y]) {
				y++;
			}else if(arr2[y] > arr3[z])
			{
				z++;
			}else {
				x++;
			}
			
		}


	}
		
		
}
