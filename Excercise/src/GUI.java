import javax.swing.JOptionPane;
public class GUI {
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"Hello"+ name);
		
		//Converting it into integer because it look for String -> using parseInt method
		int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null,"You are "+ age + " year old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null,"You are "+ height + " feet tall");

		
		
	}
}
