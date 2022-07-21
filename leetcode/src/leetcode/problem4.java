package leetcode;

import java.util.Arrays;

// find the total element after remove of the value that is passed
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
public class problem4 {
	public static void main(String[] args) {
		int[] nums= {2,3,3,2,4,5,3};
		int val = 3;
//		int count =0;
//        int[] anotherArray = new int[nums.length];
//	        for(int i = 0,k =0; i< nums.length;i++){
//	            if( nums[i] == val){
//	                count++;
//	            }else{
//	                anotherArray[k++] = nums[i];
//	            }
//	        }
//        nums = anotherArray;    
//		System.out.println(nums.length - count);
//		System.out.println(Arrays.toString(nums));
		
		int i = 0;
		for(int j =0; j< nums.length; j++) {
			if(nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		System.out.println(i);
		System.out.println(Arrays.toString(nums));
		
	}
}
