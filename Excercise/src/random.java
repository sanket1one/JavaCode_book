import java.util.Random;

public class random {
	public static void main(String[] args)
	{
		Random random = new Random();
		
		int x = random.nextInt(6)+1; //Limit the size of integer from 1 to 6
		double y = random.nextDouble(6);
		boolean z = random.nextBoolean();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
