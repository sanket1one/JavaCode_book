//leetcode problem palindrome removing the non character elementes in 
import java.util.*;
public class problem10 {
	public static void main(String[] args) {
		String str = "Marge, let's \"[went].\" I await {news} telegram.";
//		str = str.replace(" ", "");
		String formatted = "";
		for(int i=0; i < str.length(); i++) {
			if(Character.isLetterOrDigit(str.charAt(i))) {
//				str = str.replace(String.valueOf(str.charAt(i)), "");
				formatted += str.charAt(i);
			}
		}
		str = formatted;
		str = str.toLowerCase();
		if(str.equals(""))System.out.println(true);;	
		System.out.println(str);
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
