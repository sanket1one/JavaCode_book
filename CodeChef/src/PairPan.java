//	Pair Pain
import java.util.ArrayList;
import java.util.Scanner;
public class PairPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int testCase = scan.nextInt();
		for(int i =0; i < testCase ; i++) {
			int length = scan.nextInt();
			int first = 0;
			int second = 0;
			for(int  j = 0; j < length; j++) {
				int value = scan.nextInt();
//				if(value == 1) {
//					first++;
//				}else if(value == 2) {
//					second++;
//				}				
			}
//			int ans=first*(length-first)+first*(first-1)/2+second*(second-1)/2;
//			System.out.println(ans);
			
			
			if(!list.contains(2) && list.contains(1)) {
				System.out.println(length -1);
			}else if(list.contains(2) && list.contains(1)) {
				for(Integer element: list) {
					if(element == 2) second +=1;
				}
				System.out.println(length -1 + second -1);
			}else if(list.contains(2) && !list.contains(1)) {
				for(Integer element: list) {
					if(element == 2) second +=1;
				}
				
				System.out.println(second -1);
			}
			list.clear();
		}
	}

}
