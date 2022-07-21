import java.util.Arrays;

public class swapnil {
	public static void main(String[] args) {
		int x =0,y = 0,z=0;
		int arr1[] = {1,5,10,20,40,80};
		int arr2[] = {6,7,20,80,100};
		int count =0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
//		int arr3[] = {3,4,15,20,30, 70,80,120};


		while(x < arr1.length && y < arr2.length)
		{
			if(arr1[x] == arr2[y] )
			{
				count += 1;
				x++;
				y++;
			}
			else if(arr1[x] > arr2[y]) {
				y++;
			}else {
				x++;
			}
		}
		System.out.println(count);
	}
}
