import java.util.Random;
//local -> declared inside a method visible only to that method
//global -> declared outside a method, but within a class visible to all parts of a class

public class DiceRoller {
//	DiceRoller(){
//		Random random = new Random();
//		int number =0;
//		roll(random,number);
//	}
//	
//	void roll(Random random,int number)
//	{
//		number = random.nextInt(6) + 1;
//		System.out.println(number);
//	}
	
	Random random;
	int number;
	
	DiceRoller() {
		random = new Random();
		roll();
	}
	
	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}
}
