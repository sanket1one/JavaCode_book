import java.util.*;

/*
 * Segregate 0s and 1s in a array
 * 
 * write a code to segregate 0's on left side and 1's on right side of the array
 * 
 * 
 * input arr = [0,1,0,1,0,0,1]
 * output arr = [0,0,0,0,1,1,1]
 * */
public class problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,1,0,0,1};
		int p = 0;
		int q = arr.length -1;
		
		System.out.println(Arrays.toString(arr));
		while(p<q) {
			if(arr[p]> arr[q]) {
				swap(arr,p,q);
				p++;
				q--;
			}else if(arr[p] < arr[q]) {
				p++;
				q--;
			}else if(arr[p] == arr[q]) {
				if(arr[p] == 1) {
					q--;
				}else {
					p++;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arr,int p, int q) {
		int temp;
		temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
	}

}
