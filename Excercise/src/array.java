//array = used to store multiple values in a single variable
import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		String cars[] = {"Camaro","Corvette","Tesla"};		
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		
		String[] newCars = new String[3];
		newCars[0] = "a";
		newCars[1] = "b";
		newCars[2] = "c";
		
//		for(int i = 0; i < newCars.length; i++) {
//			
//			System.out.println(newCars[i]);
//		}
		
//		for(String car: newCars)
//		{
//			System.out.println(car);
//		}
		
		
		int[] newNO = new int[20];
		int y = 0;
		int totalNO = 0;

		Scanner scan = new Scanner(System.in);
		totalNO = scan.nextInt();
		
		 for(int i =0; i< totalNO; i++){
			 newNO[i] = scan.nextInt();
		}
		 
		 for(int x: newNO) {
			 System.out.println(x);
		 }
		
		
		
	}
}
