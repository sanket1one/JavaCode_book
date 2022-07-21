import java.util.*;


//Check whether two string are ANagram or not
//Anagrams? -> Two strings are said to be anagram of each other if it contains the same characters,
// only the order of characters in both the string is different.
//Str:car Str2: rac ==> Anagrams
//Str1:code, Str2: dock ==> Not an Anagram


/*
 * SOLUTION 1
 * USE SORTING: Easiest approach is to sort both the string and compare
 * 
 *  SOLUTION 2
 *  Check Character count for both the strings is same;
 * */
public class problem5 {
	public static void main(String[] agrs) {
		boolean flag;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("first element:");
		String str1 = scan.nextLine();
		
		System.out.print("Second element:");
		String str2 = scan.nextLine();

//		flag = compareString(str1,str2);
//		if(flag){
//			System.out.println("string are same");
//		}else {
//			System.out.println("String are not same");
//		}
		Anagram(str1,str2);
		
	}
	
	public static void Anagram(String str1,String str2) {
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		/*for direct sorting */
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Converting char array to string 
		String sortedChar1 = new String(arr1);
		String sortedChar2 = new String(arr2);
		
		//comparing the string is equal or not
		if(sortedChar1.equals(sortedChar2)) {
			System.out.println("anagram");
		}else {
			System.out.println("not Anagram");
		}
		
	}
	
	public static boolean compareString(String str1,String str2) {
		Set<String> hashSet1 = new HashSet<>();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		boolean counter = true;
		for(int i = 0; i< ch1.length; i++)
		{
			hashSet1.add(Character.toString(ch1[i]));						
		}
		
		for(int j =0; j < ch2.length; j++) {
			if(!hashSet1.contains(Character.toString(ch2[j]))) {
				return false;
			}else {
				continue;
			}
		}
		
		return counter;
	}
	

}
