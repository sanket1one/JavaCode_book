package leetcode;

import java.lang.Math;

//Input: height = [1,8,6,2,5,4,8,3,7]
//Input: height = [1,8,6]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
//In this case, the max area of water (blue section) the container can contain is 49.

public class problem5 {
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int area = 0;
		int p = 0;
		int q = height.length -1;
		//two pointer approach
		while(p<q) {
			int l = q-p;
			int h = Math.min(height[p], height[q]);
			area = Math.max(area, h*l);
			
			if(height[p] < height[q]) p++;
			else q--;
		}
		System.out.println(area);
		
		
		
		
		//Naive approach
//		Arrays.sort(copyHeight);
//		System.out.println(Arrays.toString(copyHeight));
		
//		for(int i =0; i< height.length; i++){
//				for(int j =0;j< height.length;j++) {
//						prevArea = currentArea;
//						if(height[j] >= height[i]) {
//							currentArea = height[i]*(Math.abs(j -i));
//							if(prevArea < currentArea) {
//								totalArea = currentArea;
//							}
//						}
////						System.out.println(prevArea+ " " + currentArea + " " + totalArea);
//				}
//				if(x < totalArea ) {
//					
//					x = totalArea;
//					currentArea = 0;
//				}
//			}
//		
//		System.out.println("OUTPUT: "+x);
		
		
		
	}
	
}