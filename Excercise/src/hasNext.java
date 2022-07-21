import java.util.*;
import java.util.regex.Pattern;  

public class hasNext {
	//hasNext() is a method of Java Scanner class which return true if
	//scanner has another token in its input.
	//Three different type of Java Scanner hasNext()
	//1. Java Scanner hasNext() Method
	//2. hasNext(String pattern) Method
	//3. hasNext(Pattern pattern) Method
	
	public static  void main(String[] args)
	{
//	    public boolean hasNext(); 
//	    public boolean hasNext(String pattern);  
//	    public boolean hasNext(Pattern pattern);
		
//		Scanner scan = new Scanner("Hello World!");
//		System.out.println("Delimiter" + scan.delimiter());
		
//		while(scan.hasNext())
//		{
//			System.out.println(scan.next());
//		}
//		
//		scan.close();
		
		
		/* hasNext() .nextLine()*/
//		 String s = "Hello, This is JavaTpoint.";  
//         //Create scanner Object and pass string in it  
//         Scanner scan = new Scanner(s);  
//         //Check if the scanner has a token  
//         System.out.println("Result: " + scan.hasNext());  
//         //Print the string  
//         System.out.println("String: " +scan.nextLine());  
//         //Check if the scanner has a token after printing the line  
//         System.out.println("Final Result: " + scan.hasNext());  
//         //Close the scanner  
//         scan.close();
		
		
		/*scan.hasNext(pattern)*/
//        //Create Scanner object  
//        Scanner scan = new Scanner("Program:Java;Python;Android");  
//        //Initialize the String pattern  
//        String pattern = "Program:.*";  
//        //Check if pattern satisfies the String content  
//        if(scan.hasNext(pattern)){  
//          System.out.println("Pattern found");  
//        }  
//        else{  
//          System.out.println("Pattern not found");  
//        }  
//        scan.close();
//	}    
		
		
//		 String str = "JavaTpoint.com 15 + 15 = 18.0";  
//         Scanner scanner = new Scanner(str);  
//         //Checking scanner's next token matches "c"  
//         System.out.println("Result: "+scanner.hasNext("JavaTpoint.com"));  
//         //Checking scanner's next token matches "="  
//         System.out.println("Result: "+scanner.hasNext("="));  
//         //Print the rest of the string  
//         System.out.println("Rest of String: "+scanner.nextLine());  
//         scanner.close();  
         
		
		/*Regex*/
	    //Create Scanner object  
        Scanner scan = new Scanner("Names:Raju1;Pawan;Suresh");  
        //Declare the delimiter  
        scan.useDelimiter(";");  
        /*Initialize the String pattern which signifies that the String 
        token contains characters of the alphabet only*/  
        Pattern pattern = Pattern.compile("[A-Za-z]*");  
        while(scan.hasNext()){  
            //Check if the token consists of declared pattern  
            if(scan.hasNext(pattern)){  
                System.out.println(scan.next());  
            }  
            else  
                scan.next();  
            }  
            scan.close();  
    	}    
}
