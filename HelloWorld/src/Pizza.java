//overloaded constructor => multiple constructor within a class  with same name,
//							but have different parameters
//							name + parameer  = signature


public class Pizza {
	
	String bread;
	String suace;
	String cheese;
	String topping;
	
	Pizza(){
		
	}
	
	Pizza(String bread, String suace){
		this.bread = bread;
		this.suace = suace;
	}
	
	Pizza(String bread, String suace, String cheese){
			this.bread = bread;
			this.suace = suace;
			this.cheese = cheese;
	}
	
	Pizza(String bread, String suace, String cheese,String topping){
		this.bread = bread;
		this.suace = suace;
		this.cheese = cheese;
		this.topping = topping;
	}
	
	
	
}