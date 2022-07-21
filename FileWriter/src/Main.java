import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args)
	{
		//creating  an instance of filewriter
		try {
			FileWriter writer = new FileWriter("poem.txt");	
			writer.write("Roses are red \n Violets are blue \nBooty booty booty \nRockin everywhere");
			writer.append("\n(A Poem by bro)");
			writer.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
