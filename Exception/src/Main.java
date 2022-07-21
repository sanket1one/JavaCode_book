import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		//exception = an event that occurs during the execution of a program that,
		//					  disrupt the normal flow of instruction
		Scanner scanner = new Scanner(System.in);
		try {
			
			
			System.out.print("Enter a whole number to divide:");
			int x = scanner.nextInt();
			
			System.out.print("Enter  a whole number to divide by");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("result "+ z);
		}
		catch(ArithmeticException e) {
			System.out.println("you can't divide by zero! idiot");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please Enter a number you dumb idiot!!");
		}catch(Exception e) {
			//It catch all type of exception
			System.out.println("Something went wrong");
		}finally {
			//it  is used to close any scanner or file 
			scanner.close();
			System.out.println("This will always print");
		}
		//finally block execute weather we catch exception or not
		
		
	}
}
