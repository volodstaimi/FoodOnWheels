import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
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
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 51, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Signup.class.getResource("/images/250x250 logo.jpg")));
		lblNewLabel.setBounds(0, 0, 250, 250);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnSignup = new JTextPane();
		txtpnSignup.setEditable(false);
		txtpnSignup.setForeground(Color.BLACK);
		txtpnSignup.setBackground(new Color(255, 51, 0));
		txtpnSignup.setText("SIGNUP");
		txtpnSignup.setFont(new Font("Times New Roman", Font.BOLD, 72));
		txtpnSignup.setBounds(731, 130, 285, 97);
		frame.getContentPane().add(txtpnSignup);
		
		JTextPane txtpnCustomer = new JTextPane();
		txtpnCustomer.setEditable(false);
		txtpnCustomer.setFont(new Font("Times New Roman", Font.BOLD, 36));
		txtpnCustomer.setForeground(new Color(0, 0, 0));
		txtpnCustomer.setBackground(new Color(255, 51, 0));
		txtpnCustomer.setText("Customer");
		txtpnCustomer.setBounds(561, 149, 171, 49);
		frame.getContentPane().add(txtpnCustomer);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setEditable(false);
		txtpnName.setForeground(Color.BLACK);
		txtpnName.setBackground(new Color(255, 51, 0));
		txtpnName.setText("Name");
		txtpnName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnName.setBounds(741, 238, 56, 30);
		frame.getContentPane().add(txtpnName);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setEditable(false);
		txtpnEmail.setForeground(Color.BLACK);
		txtpnEmail.setText("Email");
		txtpnEmail.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnEmail.setBackground(new Color(255, 51, 0));
		txtpnEmail.setBounds(741, 279, 56, 30);
		frame.getContentPane().add(txtpnEmail);
		
		JTextPane txtpnPhoneNumber = new JTextPane();
		txtpnPhoneNumber.setEditable(false);
		txtpnPhoneNumber.setForeground(Color.BLACK);
		txtpnPhoneNumber.setText("Phone Number");
		txtpnPhoneNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnPhoneNumber.setBackground(new Color(255, 51, 0));
		txtpnPhoneNumber.setBounds(741, 320, 131, 30);
		frame.getContentPane().add(txtpnPhoneNumber);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setEditable(false);
		txtpnUsername.setForeground(Color.BLACK);
		txtpnUsername.setText("Username\r\n");
		txtpnUsername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnUsername.setBackground(new Color(255, 51, 0));
		txtpnUsername.setBounds(739, 396, 118, 30);
		frame.getContentPane().add(txtpnUsername);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setEditable(false);
		txtpnPassword.setForeground(Color.BLACK);
		txtpnPassword.setText("Password");
		txtpnPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnPassword.setBackground(new Color(255, 51, 0));
		txtpnPassword.setBounds(739, 426, 87, 30);
		frame.getContentPane().add(txtpnPassword);
		
		textField = new JTextField();
		textField.setBounds(882, 238, 154, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(882, 279, 154, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(882, 320, 154, 30);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(882, 396, 154, 30);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(882, 437, 154, 30);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Signup");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(882, 504, 154, 39);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane txtpnAlreadyACustomer = new JTextPane();
		txtpnAlreadyACustomer.setForeground(Color.BLACK);
		txtpnAlreadyACustomer.setText("Already a Customer? Login Instead!");
		txtpnAlreadyACustomer.setBackground(new Color(255, 51, 0));
		txtpnAlreadyACustomer.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnAlreadyACustomer.setEditable(false);
		txtpnAlreadyACustomer.setBounds(30, 463, 336, 30);
		frame.getContentPane().add(txtpnAlreadyACustomer);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(48, 504, 269, 39);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 1250, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
