import java.util.Scanner;

public class Tester {
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		Shape shape;
		
		System.out.println("What Shapes area you want to calculate");
		System.out.printf("(1=Triangle) \n (2=Circle) \n(3=Square)\n choice:");
		int choice  = scanner.nextInt();
		
		if(choice == 1)
		{
			shape = new Triangle();
		}else if(choice == 2)
		{
			shape = new Circle();
		}else if(choice == 3) {
			shape = new Square();
		}else {
			System.out.println("Enter the correct option");
		}
		
		scanner.close();
	}
}
