import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyFrame extends JFrame{
	MyFrame(){
		
		this.setTitle("JFrame title goes here"); //set the title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of  application
//		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // exit out of  application
		this.setResizable(false); // prevent this from being resize
		
		
		 this.setSize(420,420); // sets the x-direction, y-dimension of this
		 this.setVisible(true); // make this visible
		 
		 ImageIcon image = new ImageIcon("OOpsLogo.png"); // create an ImageIcon
		 this.setIconImage(image.getImage()); // change icon image
//		 this.getContentPane().setBackground(Color.green);
		 this.getContentPane().setBackground(new Color(123,50,250)); //Color(0x123456)
		  
	}
}
