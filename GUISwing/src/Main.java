import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main {

	public static void main(String[] args) {
//		JFrame - a GUI window to add components to
		/*
		JFrame frame = new JFrame();
		frame.setTitle("JFrame title goes here"); //set the title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of  application
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // exit out of  application
		frame.setResizable(false); // prevent frame from being resize
		
		
		 frame.setSize(420,420); // sets the x-direction, y-dimension of frame
		 frame.setVisible(true); // make frame visible
		 
		 ImageIcon image = new ImageIcon("OOpsLogo.png"); // create an ImageIcon
		 frame.setIconImage(image.getImage()); // change icon image
//		 frame.getContentPane().setBackground(Color.green);
		 frame.getContentPane().setBackground(new Color(123,50,250)); //Color(0x123456)
		 */
//		MyFrame myframe =  new MyFrame();
		ImageIcon image = new ImageIcon("backgroundLayer.png");
		JLabel label = new JLabel();	// Create a label
		label.setText("garigar sangathan"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP);
		
		JFrame frame =  new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(label);
		
		
		
	}

}
