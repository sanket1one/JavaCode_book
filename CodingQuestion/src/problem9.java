import java.util.*;

public class problem9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		for(int i = 0; i < num; i++) {
			String str = scan.next();
			String chr = scan.next();
			count += charCount(str,chr);
			System.out.println("Case #"+(i+1)+": " +count);
			count = 0;
		}
	}
	
	public static int charCount(String str, String chr) {
		int count = 0;
		int prev= 0;
		int diff = 0;
		char[] ch = str.toCharArray();
		char[] anyStr = chr.toCharArray();
		for(char x: ch) {
			for(char y: anyStr) {
				
				if(x < y){
					diff = Math.min(y- x, 26 - y + x);
				}else if( x> y) {
					diff = Math.min(x-y, 26-x + y);
				}else {
					diff = 0;
				}
				
				if(y == anyStr[0]) {
					prev= diff;
				}else if(prev < diff) {
					diff = prev;
				}else {
					prev = diff;
				}
			}
			count += diff;
		}
		return count;
	}
	
	
}
