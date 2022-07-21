import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		//polymorphism = many shapes/form
		//dynamic = after compilation(during runtime)
		
		//ex. A corvette is a: corvette,and a car, and a vehicle, and a object
		//declare an object and give some space in the memory and don't know what type of object you want yet
		
		Scanner scanner = new Scanner(System.in);
		
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.print("(1=dog) or (2=cat):");
		int choice  = scanner.nextInt();
		
		if(choice == 1)
		{
			animal = new Dog();
			animal.speak();
		}else if(choice == 2)
		{
			animal = new Cat();
			animal.speak();
		}else {
			animal = new Animal();
			animal.speak();
		}
		
		
		
	}
}
