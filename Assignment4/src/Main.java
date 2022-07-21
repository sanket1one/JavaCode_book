import java.util.Scanner;

public class Main {


	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		try {	
			System.out.print("Enter a whole number to divide:");
			int x = scanner.nextInt();
			System.out.print("Enter  a whole number to divide by");
			int y = scanner.nextInt();
			int z = x/y;
			System.out.println("result "+ z);;
		}
		catch(ArithmeticException e) {
			System.out.println("you Shouldn't divide a number by zero");
		}
		
		
		int[] array = {1,2,3};
		System.out.println("Enter the array index value :");
		int index  = scanner.nextInt();
		try {
			System.out.println("array value:"+array[index]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.printf("OOPs!! Array Index %d out of bound for length %d\n",index,array.length-1);
		}


		try {
			String myString = null;
			System.out.println(myString.length());
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception arises!!");
		}
	}
}
