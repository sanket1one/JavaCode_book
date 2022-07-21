package package2;

public class C {
	public String publicMessage  = "THis is public";
	protected String protectedMessage = "This is protected";
		   String defualtMessage = "This is the default";
    private String privateMessage = "This is the private";		   
   // protected is accessible to the different class of different package as long as it is 
   // sub class of whatever it contain in the class
    
   // private message is visible to class that's it contain itself not even in the same package itself
    
		   
}
