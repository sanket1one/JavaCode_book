package package1;
import package2.*;

public class A {

//	protected String protectedMessage = "This is protected";
    private String privateMessage = "This is the private";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 C c = new C();
		 //Any thing that uses the public keyword is visible in any package in the folder 
		 System.out.println(c.publicMessage);
		 
		 B b = new B();
//		 System.out.println(b.privateMessage);
	}

}
