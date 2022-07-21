import java.util.Scanner;
import java.lang.Math.*;

public class Tester {
	
	public static void main(String args[])
	{
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Square square = new Square();
		Shape[] shapes = {triangle,circle,square}; //all of this object identifies as vehicle object
		for(Shape x: shapes)
		{
			x.getInput();
			x.setArea();
		}
	}
}


class Shape {
	int area;
	public void getInput()
	{}	
	public void setArea()
	{}
}

class Triangle extends Shape{
	Scanner scan = new Scanner(System.in);
	
	int Height,Base;
	@Override
	public void getInput()
	{
		System.out.println("1.Triangle");
		System.out.print("Enter the Height:");
		Height = scan.nextInt();
		System.out.print("Base:");
		Base = scan.nextInt();
	}
	@Override
	public void setArea()
	{
		area = (Base*Height)/2;
		System.out.println("Area of triangle is :" + area);
	}	
}

class Circle extends Shape{
	Scanner scan = new Scanner(System.in);
	double radius;
	double area;
	@Override
	public void getInput()
	{
		System.out.println("2.Circle");
		System.out.print("Enter the radius:");
		radius = scan.nextDouble();
	}
	@Override
	public void setArea()
	{
		area  = Math.PI*(Math.pow(radius, 2));
		System.out.println("Area of Circle is :" + area);
	}
}
class Square extends Shape{
	Scanner scan = new Scanner(System.in);
	int Side;
	@Override
	public void getInput()
	{
		System.out.println("3.Square");
		System.out.print("Enter the Side of a Square:");
		Side = scan.nextInt();
	}
	@Override
	public void setArea()
	{
		area = (Side*Side);
		System.out.println("Area of Square is:" + area);
	}
}
