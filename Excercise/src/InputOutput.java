import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name");
		String name = scanner.nextLine();
		System.out.println("How old are you");
		int age = scanner.nextInt();
		scanner.nextLine(); // to clear the scanner because it will interact the \n
		System.out.println("What is your favourite food");
		String food = scanner.nextLine();
		
		
		System.out.println("Hello " + name);
		System.out.println("You are "+ age+ " year old");
		System.out.println("You like" + food);
		char x = scanner.next().charAt(0); //input char
		scanner.close();
	}
}
