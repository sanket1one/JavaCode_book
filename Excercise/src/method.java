
public class method {
	public static void main(String[] args)
	{
		//method - a block of code that is executed whenever it is called upon
		String name = "sanket";
		int  x = 2;
		int y = 3;
		
		//arguments are passed while calling the function
		hello(name);
		int result = sum(x,y);
		System.out.println("Sum of two number is"+ result);
	}
	
	//first letter is lowerCase
	//parameter are  variable which are passed
	static void hello(String name)
	{
		System.out.println("Hello" + name);
	}
	static int sum(int x,int y)
	{
		int z = x+y;
		return z; 
	}
}
