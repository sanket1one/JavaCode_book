package leetcode;
// 35 search insert position (array problem)
public class problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 5;
        int low =0;
        int high = nums.length-1;
        while(low <= high){
        	int mid = low + (high - low)/2;
//        	int mid = (low + high)/2;
        	if(nums[mid] == target) {
        		System.out.println(mid);
        		break;
        	}else if(nums[mid] < target) {
        		low = mid +1; 
        	}else if (nums[mid] > target) {
        		high = mid -1;
        	}else {
        		mid = mid +1;
        	}
        }
        System.out.println(low);
}

}
