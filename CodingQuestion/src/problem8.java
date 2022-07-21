import java.util.Arrays;

public class problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,2,3,1,1,3,2,1,2,2,3,3};
		int[] arr = {1,2,3,2,1,1};
		int p = 0;
		int q = 0;
		int[] count = {0,0,0};
		for( int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) count[0]+=1;
			else if(arr[i] == 2) count[1] += 1;
			else if(arr[i] == 3) count[2] += 1;
		}
		for(int i =0; i< arr.length; i++) {
			if(i <count[0]) arr[i] = 1;
			else if(i >= count[0] && i< count[1] + count[0]) arr[i] = 2;
			else arr[i] = 3;
		}
		System.out.println(Arrays.toString(arr));
	}

}
