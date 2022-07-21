import java.util.*;
import java.lang.*;
public class Sanket {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int i = 1;
		while(t>0) {
			String str1 = scan.next();
			String str2 = scan.next();
			if(strContains(str1,str2) == true) {
				System.out.println("Case #"+i+": "+(str2.length() - str1.length()));				
			}else {
				System.out.printf("Case #%d: IMPOSSIBLE\n",i);
			}
			i++;
			t-=1;
		}
		
		
	}
	
	public static boolean strContains(String str1,String str2) {
		char[] ch1 = str1.toCharArray(); 
		char[] ch2 = str2.toCharArray();
		int p = 0; 
		int q = 0;
		int count = 0;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		while(p < ch1.length && q < ch2.length) {
			if(ch1[p] == ch2[q]) {
				count++;
			}else if(ch1[p] > ch2[q]) {
				q++;
			}else {
				p++;
			}
		}
		if(count == ch1.length) {
			return true;
		}else {
			return false;			
		}
	}
}
