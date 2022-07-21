package leetcode;

import java.util.Arrays;

public class problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int p = 0;
        int q = 0;
         int prev = 0;
         int sum = 0;
         for(int i =0 ; i < nums.length; i++) {
        	 if(nums[i] >= 1 || (nums[i] + prev) >= 1) {
        		 p = i;
        		 q = i;
        	 }else {
        		 int returnValue = add(nums,q,p);
        		 sum = Math.max(returnValue,sum);
        		 if(sum  < returnValue) {        			 
        			 p = q;
        		 }
        	 }
        	 prev = nums[i];
         }
         
         System.out.println(sum);
	}
	
	public static int add(int[] nums,int i, int p) {
		int sum =0;
		for(int j = p; j <i; j++) {
			sum += nums[j];
		}
		return sum;
	}

}
