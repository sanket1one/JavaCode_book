//String methods --> refrence data type
public class StringMethod {
	public static void main(String[] args)
	{
		//String = a refrence data type that can store one or more characters
		// refrence data types have access to useful methods
		
		String name = "sanket  ";
//		boolean result = name.equals("sanket"); //it is case sensitive
//		boolean result2 = name.equalsIgnoreCase("Sanket");
		
//		int result = name.length();
//		char result = name.charAt(4);
//		int result = name.indexOf("k");
//		boolean result = name.isEmpty();
//		String result = name.toUpperCase();
//		String result = name.toLowerCase();
//		String result  = name.trim(); //remove the empty space
		String result = name.replace('s','a');
		
		System.out.println(result);

	}
}	
