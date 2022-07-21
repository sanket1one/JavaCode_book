import java.util.Arrays;

public class AllOperation {
	public static void main(String args[]) {
//		String name = "Sanket";
//		System.out.println("String length:" + name.length());
//		char[] ch = name.toCharArray();
//		System.out.println("char array length:  " + ch.length);
//		System.out.println(name.substring(2));
//		int[] arr = {1,2,8,3};
//		String myName = "aniket patil";
//		System.out.println(myName.contains("anik"));
//		String replace = myName.replace("aniket", "");
//		System.out.println(replace);
		String name = "sanket";
		char[] ch =  name.toCharArray();
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		name = new String(ch);
		System.out.println(name);
//		name = name.replace("s", "");
		int pos = 2;
		name = name.substring(0,pos) + name.substring(pos+1);
		System.out.println(name);
		name = name.substring(name.length() -1);
		System.out.println(name);
		System.out.println("end");
		int x = 2;
		String y = String.valueOf(x);
		System.out.println(x -1);
		
	}
}
