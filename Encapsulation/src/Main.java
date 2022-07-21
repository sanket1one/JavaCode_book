
public class Main {

	public static void main(String[] args) {
	//		Encapsulation = attributes of a class will be hidden or private.
	//						can be accessed only through methods(getters & setters)
	//						you should make attributes private if you don't hav a reason to make them public/protected
		
		Car car = new Car("Chevrolet","camero",2021);
		
//		System.out.println(car.model); //-> this is not accessible because it is private
//		car.year = 2022;
		
		//setting the values
		car.setYear(2022);
		
		//Getting the values
		System.out.println(car.getModel());
		System.out.println(car.getMake());
		System.out.println(car.getYear());
		
	
	}

}
