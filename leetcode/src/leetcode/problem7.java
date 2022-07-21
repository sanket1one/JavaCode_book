package leetcode;
import java.util.ArrayList;
public class problem7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		int p = 0, q = height.length-1;
		ArrayList<Integer> arr = new ArrayList<>();
		while(p<q)
		{
			arr.add(((height[q]*height[p])*(q-p)));
			System.out.println(((height[q]*height[p])*(q-p)));
			p++;
			q--;
			
			
		}
		
		int max = arr.get(0);
		for(int x: arr) {
			if(max > x) {
				max = x;
			}
		}
		System.out.println(max);
		
	
		
	}

}
