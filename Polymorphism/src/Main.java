public class Main {

	public static void main(String[] args) {
//		polymorphism = greek word for ply-"many",morph-"form"
//					   The ability of an object to identify as more than one type
		
		// ability of an object to identify as more than one types mean For Example:
		// car identify as Car object as well as Vehicle Object
		//car is also an Object of class Object
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
//		Car[] racers = {car,bicycle,boat};//we can store only the car object 
//		Bicycle[] racers = {car,bicycle,boat}; //we can only store Bicycle object 
//		Boat[] racers = {car,bicycle,boat}; 	//we can only store Boat object
		
		//To resolve this issue we have concept called polymorphism
		
		Vehicle[] racers = {car,bicycle,boat}; //all of this object identifies as vehicle object
		for(Vehicle x: racers)
		{
			x.go();
		}
		
//		Object[] racers2 = {car,bicycle,boat};
//		for(Object y: racers2)
//		{
//			y.go();
//		}
		
		
	}

}
