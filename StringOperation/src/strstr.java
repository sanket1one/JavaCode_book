import java.util.*;

public class strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		String x = scan.next();
//		String y = scan.next();
//		int index = x.indexOf(y);
//		System.out.println(index);
		Random rand = new Random();
		int num = 11;
		String str = String.valueOf(num);
		System.out.println(rand.nextInt(str.length()));
		System.out.println(palindrome(str));
	}
	
	public static boolean palindrome(String str) {
		int size = str.length();
		String f = str.substring(0,1);
		String l = str.substring(size -1);
		if(size == 0  || size == 1) {
			return true;
		}
		
		if(size == 2) {
			if(l.equals(f)) return true;
		}else if(l.equals(f)) {
			
			return palindrome(str.substring(1,size -1));
		}
		
		return false;
		
	}
	
	

}
