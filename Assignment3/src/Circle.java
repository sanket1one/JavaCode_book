import java.util.Scanner;
import java.lang.Math.*;

public class Circle extends Shape{
	Scanner scan = new Scanner(System.in);
	
	double radius;
	static double area;
	@Override
	public void getInput()
	{
		System.out.print("Enter the radius:");
		radius = scan.nextDouble();
	}
	
	@Override
	public void setArea()
	{
		area  = Math.PI*(Math.pow(radius, 2));
		System.out.println(area);
	}
		

}
