
public class overloadedMethod {
	public static void main(String[] args)
	{
		//overloaded methods = methods that  share the same name but have different parameters
//							   method name + parameters = method signature
		int x = add(1,2);
		double  z = add(2.0,6.5);
		System.out.println(x);
		System.out.println(z);
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c) {
			return a+b+c;
	}
	static int add(int a,int b,int c, int d)
	{
		return a+ b+ c+d;
	}
	static double add(double a,double b)
	{
		return a+ b;
	}
}
