import java.util.Arrays;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,2,4,1,-2};
		boolean contain = false;
		
		
		
//		for(int i =0; i < arr.length; i++) {
//			
//		}
		
		for(int i =0; i < arr.length -2; i++) {
			contain = isContain(arr,arr[i]);
			if(contain) {
				
			}
			
		}
		
	}
	
	public static boolean isContain(int[] arr,int sum) {
		Arrays.sort(arr);
		int q = arr.length -1;
		int p = 2;
		System.out.println(Arrays.toString(arr));
		
		for(int i =0; i < arr.length;i++) {
			if(arr[p] + arr[q] > sum) {
				q--;
			}else if(arr[p] + arr[q] < sum) {
				p++;
			}else {
//				System.out.println(arr[p] + " "+sum +" "+ arr[q]);
				return true;
			}			
		}
		return false;
	}
}
