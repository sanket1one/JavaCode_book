package leetcode;
import java.util.HashMap;

public class Problem3 {
	public static void main(String[] args) {
		String str  = "MCMXCIV";
		HashMap<String,Integer> romanToInt = new HashMap<>();
		romanToInt.put("I",1);
		romanToInt.put("V",5);
		romanToInt.put("X",10);
		romanToInt.put("L",50);
		romanToInt.put("C",100);
		romanToInt.put("D",500);
		romanToInt.put("M",1000);
		char[] ch = str.toCharArray();
		int total = 0;
		int prev = 0,current =0;
		for(int i=0; i< ch.length;i++) {
			if(i==0) {
				prev= romanToInt.get(Character.toString(ch[i]));
				total = prev;				
			}else {
				current = romanToInt.get(Character.toString(ch[i]));
				if(current <= prev) {
					total = total + current;
				}else {
					total += current - 2*prev;
				}
				prev = current;
			}
			
		}
		System.out.println(total);
	}
	
}
