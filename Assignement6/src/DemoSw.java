import java.awt.*;

import javax.swing.*;
import javax.swing.table.*;

import java.sql.*;
import java.awt.event.*;  

public class DemoSw {

	private JFrame frame;
	private JTextField text_1;
	private JTextField text_2;
	private JTextField text_3;
	private JTextField text_4;
	private JTextField text_5;

	/**
	 * Launch the application.
	 */
	String driverName = "com.mysql.jdbc.Driver";
	 static final String DB_URL="jdbc:mysql://localhost:3306/it";
	 static final String USER = "root";
	 static final String PASS = "Root";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoSw window = new DemoSw();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoSw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Label_1 = new JLabel("Roll No.:");
		Label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		Label_1.setBounds(34, 11, 92, 30);
		frame.getContentPane().add(Label_1);
		
		JLabel Label_2 = new JLabel("Name:");
		Label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		Label_2.setBounds(34, 52, 92, 30);
		frame.getContentPane().add(Label_2);
		
		JLabel Label_3 = new JLabel("Class:");
		Label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		Label_3.setBounds(34, 93, 92, 30);
		frame.getContentPane().add(Label_3);
		
		JLabel Label_4 = new JLabel("Division:");
		Label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		Label_4.setBounds(34, 139, 92, 30);
		frame.getContentPane().add(Label_4);
		
		JLabel Label_5 = new JLabel("Semester:");
		Label_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		Label_5.setBounds(34, 180, 92, 30);
		frame.getContentPane().add(Label_5);
		
		text_1 = new JTextField();
		text_1.setBounds(175, 17, 119, 23);
		frame.getContentPane().add(text_1);
		text_1.setColumns(10);
		
		text_2 = new JTextField();
		text_2.setColumns(10);
		text_2.setBounds(175, 59, 119, 23);
		frame.getContentPane().add(text_2);
		
		text_3 = new JTextField();
		text_3.setColumns(10);
		text_3.setBounds(175, 100, 119, 23);
		frame.getContentPane().add(text_3);
		
		text_4 = new JTextField();
		text_4.setColumns(10);
		text_4.setBounds(175, 146, 119, 23);
		frame.getContentPane().add(text_4);
		
		text_5 = new JTextField();
		text_5.setColumns(10);
		text_5.setBounds(175, 187, 119, 23);
		frame.getContentPane().add(text_5);
		
		JButton btn_1 = new JButton("INSERT");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    String rollno = text_1.getText();
	                String name = text_2.getText();
	                String class1 = text_3.getText();
	                String division = text_4.getText();
	                String sem = text_5.getText();
    try {
	                   Class.forName("com.mysql.jdbc.Driver");
	                   Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
	                   String query = "INSERT INTO stud_info values('" + rollno + "','" + name + "','" + class1 + "','"+ division +"','"+sem+"')";
	                   Statement sta = connection.createStatement();
	                   sta.executeUpdate(query);
	                    
	                   JOptionPane.showMessageDialog(btn_1,"Data for "+ name + " added sucessfully ");
	                    
	                    connection.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
				
			}
		});
		
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_1.setBounds(10, 229, 89, 23);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("UPDATE");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rollno = text_1.getText();
                String name = text_2.getText();
                String class1 = text_3.getText();
                String division = text_4.getText();
                String sem = text_5.getText();
                
	       try {
		                   Class.forName("com.mysql.jdbc.Driver");
		                   Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
		                   String query = "UPDATE stud_info set name="+"'"+name+"'"+"where rollno=" + rollno;
		                   Statement sta = connection.createStatement();
		                   int x = sta.executeUpdate(query);
		                   String query1 = "UPDATE stud_info set class1="+"'"+class1+"'"+"where rollno=" + rollno;
		                   Statement sta1 = connection.createStatement();
		                   int x1 = sta1.executeUpdate(query1); 
		                   String query2 = "UPDATE stud_info set division="+"'"+division+"'"+"where rollno=" + rollno;
		                   Statement sta2 = connection.createStatement();
		                   int x2 = sta2.executeUpdate(query2); 
		                   String query3 = "UPDATE stud_info set sem="+"'"+sem+"'"+"where rollno=" + rollno;
		                   Statement sta3 = connection.createStatement();
		                   int x3 = sta3.executeUpdate(query3); 
		                   JOptionPane.showMessageDialog(btn_2,"Data for "+ name + "','"+ class1 +"','"+division+" and "+sem+" updated sucessfully ");
		                    
		                    connection.close();
		                } catch (Exception exception) {
		                    exception.printStackTrace();
		                }
		            }
			});	
		
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_2.setBounds(109, 230, 89, 23);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("DELETE");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rollno = text_1.getText();
                String name = text_2.getText();
                String class1 = text_3.getText();
                String division = text_4.getText();
                String sem = text_5.getText();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            String query = "DELETE from stud_info where rollno=" + rollno;
            Statement sta = connection.createStatement();
            sta.executeUpdate(query);
             
            JOptionPane.showMessageDialog(btn_3,"Data for "+ name + " deleted sucessfully ");
             
             connection.close();
         } catch (Exception exception) {
             exception.printStackTrace();
         }
     }
});

		btn_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_3.setBounds(208, 230, 89, 23);
		frame.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("DISPLAY");
		//setting the properties of second JFrame
        JFrame frame2 = new JFrame("Database Results");
        frame2.getContentPane().setLayout(new FlowLayout());
        frame2.setSize(400, 400);
      
 
        //Setting the properties of JTable and DefaultTableModel
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        JTable table = new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(300, 100));
        table.setFillsViewportHeight(true);
        frame2.getContentPane().add(new JScrollPane(table));
        defaultTableModel.addColumn("Roll No:");
        defaultTableModel.addColumn("Username:");
        defaultTableModel.addColumn("Class:");
        defaultTableModel.addColumn("Division:");
        defaultTableModel.addColumn("Semester:");
        
        
		btn_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int flag=0;
			
			
       try {
	                   Class.forName("com.mysql.jdbc.Driver");
	                   Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
	                   String query = "SELECT * from stud_info ";
	                   Statement sta = connection.createStatement();
	                   ResultSet rs= sta.executeQuery(query);
	                  
	                  
	                   while(rs.next()) 
	                   {
	                	   	                	   
	    				 String rollno=rs.getString(1);
	    				 String name =rs.getString(2);
	    				 String class1=rs.getString(3);
	    				 String division=rs.getString(4);
	    				 String sem=rs.getString(5);

	    				 if (name.equalsIgnoreCase(rs.getString(2))) {
	    	                    flag = 1;
	    	                    defaultTableModel.addRow(new Object[]{rollno,name, class1,division,sem});//Adding row in Table
	    	                    frame2.setVisible(true);//Setting the visibility of second Frame
	    	                    frame2.validate();
	    	                    break;
	    	                }
	    		            if (flag == 0) {
	    		                JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
	    		            }
	                                       
	                  JOptionPane.showMessageDialog(btn_4,"Data for "+ name + " displayed successfully ");
	                   }
	                    connection.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
	            }
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_4.setBounds(307, 230, 89, 23);
		frame.getContentPane().add(btn_4);
	}
}
