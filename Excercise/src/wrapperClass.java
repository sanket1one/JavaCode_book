
public class wrapperClass {
	
	public static void main(String[] args)
	{
	//Wrapper class = provides a way to use primitive data types as refrence data types
	//				  refrence data types contain useful methods
	//				  can be used with collections(ex. ArrayList)
	
	//primitve	//wrapper
	//---------------------
	//boolean	 Boolean
	//char		 Character
	//int 		 Integer
	//double	 Double
	
	//autoboxing = the automatic conversion that the Java Compiler makes between the primitive type and their corresponding  object wrapper class 
	//unboxing = the reverse of autoboxing .Automatic Conversion of wrapper class to primitive
	
	Boolean a = true;
	Character b = '@';
	Integer c = 123;
	Double d = 3.14;
	String e = "sanket";
	
	//unboxing
	if(a == true)
	{
		System.out.println("This is true");
	}
}
	

}
