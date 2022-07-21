import java.util.*;
import java.lang.*;

public class Codechef {
	public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int size,value;
        int count;
        
        int arr[];
        int arr2[];
        
        //taking  no. of  input array
        for(int i = 0; i <input; i++)
        {
            size = scan.nextInt(); //size of array
            arr = new int[size]; 
            arr2 = new int[size]; 
            	
            for(int j  =0; j<size; j++) {
            	arr[j] = scan.nextInt();
            }
            
            for(int j = 0; j < size; j++) {
            	arr2[j] = scan.nextInt();
            } 
        }
		// your code goes here
	}

	
}

