import java.util.Scanner;

public class Triangle extends Shape{
	Scanner scan = new Scanner(System.in);
	
	int Height,Base;
	static double area;
	@Override
	public void getInput()
	{	
		System.out.print("Enter the Height:");
		Height = scan.nextInt();
		System.out.print("Base:");
		Base = scan.nextInt();
	}
	
	@Override
	public void setArea()
	{
		area = (Base*Height)/2;
		System.out.println(area);
	}
	
}
