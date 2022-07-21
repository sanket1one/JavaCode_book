import java.io.File;
public class Main {
	public static void main(String[] args)
	{
		//file = An abstract representation of file and directory pathnames
		
		// '/' will work to
//		File file = new File("C:\\Users\\ASUS\\Desktop\\secret_message.txt");
		File file = new File("secret_message.txt");
		
		if(file.exists())
		{
			System.out.println("That file exists! :))");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile()); //to check whether the file is file or a folder
			file.delete();
		}else {
			System.out.println("That file doesn't exist!!");
		}
	}

}
