
public class Main {
	public static void main(String[] args)
	{
		//abstract = abstract classes cannot be instantiated , but they can have a subclass
		//			 abstract methods are declared without an implementation.
		
		//It adds a level of security to the program
		
//		Vehicle vehicle = new Vehicle();
//		we cannot declare the vehicle class
		Car car = new Car();
		car.go();

	}
}
