import java.util.Scanner;

public class Square extends Shape{
	Scanner scan = new Scanner(System.in);
	
	int Side;
	static double area;
	@Override
	public void getInput()
	{
		System.out.print("Enter the Length of Side:");
		Side = scan.nextInt();
	}
	
	@Override
	public void setArea()
	{
		area = (Side*Side);
		System.out.println(area);
	}
	

}


