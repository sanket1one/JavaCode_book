
public class printf {
	public static void main(String[] args)
	{
		//printf() = an optional method  to control, format,and display text to the console window
//					 two arguments = format String + (object/variable/value)
//					 %[flags][precision][width][conversion-character]
		
		//format specifier %d decimal
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Sanket";
		int myInt = 50;
		double myDouble = 1100;
		
		//[conversion-character]
		System.out.printf("%b",myBoolean);
		System.out.printf("%c",myChar);
		System.out.printf("%s",myString);
		System.out.printf("%d",myInt);
		System.out.printf("%f",myDouble);
		
		//width
		//minimum number of character to be written as output
		System.out.printf("Hello %10s",myString);
		System.out.printf("Hello %-10s",myString); //left justified
//		
		//[precision]
		//sets number of digits of precision when outputting floating-point values
//		System.out.printf("You have this much money %.2f",myDouble);
		//0.2 represent no. of digits that are comming after the  decimal point
		
		//[flags]
		//add an effect to output based on the flag added to format specifier
		// - : left-justify
		//+  : output a plus (+) or minus (-) sign for a numeric value
		//0  : numeric values are zero-padded
		//,  : comma grouping separator if number > 1000
		
//		System.out.printf("You have this much money %20f",myDouble);
//		System.out.printf("You have this much money %020f",myDouble);
		System.out.printf("You have this much money %,f",myDouble);
	}
}
