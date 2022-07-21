import java.util.*;

public class problem12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase =  scan.nextInt();
		int prev  =0; 
		int current = 0;
		for(int i =0; i < testCase; i++){
		    int frameSize = scan.nextInt();
		    int count =0;
		    for(int j =0; j < frameSize;j++) {
		    	prev = current;
		    	current = scan.nextInt();
		    	if(!(prev == current)) {
		    		count++;
		    	}
		    }
		    current = 0;
		    prev = 0;
		    System.out.println(count);
		    
		}
	}
}
