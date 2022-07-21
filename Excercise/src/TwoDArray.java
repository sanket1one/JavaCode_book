
public class TwoDArray {
	public static void main(String[] args)
	{
		//2D array
		String[][] cars = new String[3][3];
		cars[0][0] = "a";
		cars[0][1] = "b";
		cars[0][2] = "c";

		cars[1][0] = "z";
		cars[1][1] = "y";
		cars[1][2] = "x";
		
		cars[2][0] = "r";
		cars[2][1] = "q";
		cars[2][2] = "p";
		
		for(String[] arrayCar : cars)
		{
			for(String singleCar: arrayCar)
			{
				System.out.println(singleCar);
			}
		}

	}
}
