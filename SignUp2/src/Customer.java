
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Customer {
	JFrame frame= new JFrame();
	private JTextField userName;
	private JPasswordField passwordField;
	private JTextField textField;
	Customer()
	{
		frame.getContentPane().setLayout(null);
		frame.setBounds(10, 10, 500, 350);
		JLabel lblNewLabel = new JLabel("Customer");
		lblNewLabel.setFont(new Font("Century", Font.PLAIN, 20));
		lblNewLabel.setBounds(193, 0, 98, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(87, 139, 140, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("User Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(87, 98, 140, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		userName = new JTextField();
		userName.setBounds(221, 95, 96, 20);
		userName.setColumns(10);
		frame.getContentPane().add(userName);
		passwordField = new JPasswordField();
		passwordField.setDropMode(DropMode.INSERT);
		passwordField.setBounds(221, 144, 98, 20);
		frame.getContentPane().add(passwordField);
		
		JButton logined = new JButton("Login");
		
		JLabel lblNewLabel_2 = new JLabel("Login Successful");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(166, 238, 124, 14);
		JLabel lblNewLabel_3 = new JLabel("Login failed");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(166, 238, 124, 14);
		
		logined.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname=userName.getText();
				
				String pass=passwordField.getText();
				
				if((uname.equals("Harris"))&& (pass.equals("123"))||((uname.equals("Taimoor")&&pass.equals("123"))))
				{frame.getContentPane().add(lblNewLabel_2);
				customerLogin();
				frame.dispose();}
				else frame.getContentPane().add(lblNewLabel_3);
			}
		});
		frame.setBounds(10, 10, 500, 350);
		logined.setBounds(189, 187, 89, 23);
		frame.getContentPane().add(logined);
		frame.setVisible(true);
	}
	public void customerLogin()
	{
		JFrame jf = new JFrame();
		jf.getContentPane().setLayout(null);
		jf.setBounds(10, 10, 500, 550);
		JLabel lblNewLabel = new JLabel("Welcome Customer");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(173, 33, 153, 14);
		jf.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Food 1");
		rdbtnNewRadioButton.setBounds(25, 87, 111, 23);
		jf.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("food 2");
		rdbtnNewRadioButton_1.setBounds(25, 113, 111, 23);
		jf.getContentPane().add(rdbtnNewRadioButton_1);

		jf.setVisible(true);
	}
	
//public static void main(String[] args) {
//	Customer cClass= new Customer();
//	
//}
}
