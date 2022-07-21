package leetcode;
import java.util.*;

public class Problem {
	public static void main(String[] args) {
		String str  = "MCMXCIV";
		ArrayList<String> roman= new ArrayList<String>();
		ArrayList<Integer> returnValue = new ArrayList<Integer>();
		roman.add("I");
		roman.add("V");
		roman.add("X");
		roman.add("L");
		roman.add("C");
		roman.add("D");
		roman.add("M");
		int value[] = 	{1,5,10,50,100,500,1000};
		char[] ch = str.toCharArray();
		int sum = 0;
		int current = 0;
		int prev = 0;
		
		current = value[roman.indexOf(Character.toString(ch[0]))];
		sum = current;
		if(ch.length >=2)
		{
			for(int i =1; i< ch.length ; i++) {
				prev = current;
				
				current = value[roman.indexOf(Character.toString(ch[i]))];    
				
				if(current <=prev) {
					sum = sum + current;
				}else {
					sum = sum - current;
				}
			
			}
			System.out.println(sum);
		}
		else {
			System.out.println(current);
		}
		


//		int finalValue = (returnValue.get(1) > returnValue.get(0)) ? returnValue.get(1) - returnValue.get(0): returnValue.get(1) + returnValue.get(0);
//		System.out.println(finalValue);
//		
	}
}
