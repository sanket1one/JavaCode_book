package leetcode;

import java.util.*;

//[2,3,11,9,1,14,12]
//value = 8
//outPut: 3 total value less than 8
public class problem6 {
	public static void main(String[] args) {
		int[] arr = {2,3,11,9,2,1,14,5,12};
		int value = 3;
		Arrays.sort(arr);
		
		int first = arr[0];
		int last = arr.length-1;
		int mid = (first + last)/2;  
		   do{  
		      if ( arr[mid] < value ){  
		        first = mid + 1;     
		      }else if( arr[mid] == value)
		      {    
		        break;
		      }else if(arr[mid] > value) {  
		         last = mid - 1;  
		      }else if(first > last) {
		    	  mid = mid +1;
		    	  break;
		      }
		      mid = (first + last)/2;  
		   }while( first <= last );
		   
		   
//		for(int i=0; i< arr.length;i++) {
//			if(arr[i]>value) {
//				break;				
//			}else {
//				count++;
//			}
//		}
		   
		System.out.println(Arrays.toString(arr));
		System.out.println(mid);
	}
}
