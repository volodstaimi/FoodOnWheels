import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class My_GUIs {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					My_GUIs window = new My_GUIs();
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
	public My_GUIs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 51, 0));
		frame.setBounds(100, 100, 1250, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 51, 0));
		panel.setBounds(10, 11, 250, 250);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(My_GUIs.class.getResource("/Images/250x250 logo.jpg")));
		panel.add(lblNewLabel);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setForeground(new Color(0, 0, 0));
		txtpnLogin.setEditable(false);
		txtpnLogin.setBackground(new Color(255, 51, 0));
		txtpnLogin.setFont(new Font("Times New Roman", Font.BOLD, 72));
		txtpnLogin.setText("LOGIN");
		txtpnLogin.setBounds(650, 100, 250, 82);
		frame.getContentPane().add(txtpnLogin);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setForeground(new Color(0, 0, 0));
		txtpnUsername.setEditable(false);
		txtpnUsername.setBackground(new Color(255, 51, 0));
		txtpnUsername.setText("USERNAME");
		txtpnUsername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnUsername.setBounds(711, 240, 118, 36);
		frame.getContentPane().add(txtpnUsername);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setForeground(new Color(0, 0, 0));
		txtpnPassword.setEditable(false);
		txtpnPassword.setText("PASSWORD");
		txtpnPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnPassword.setBackground(new Color(255, 51, 0));
		txtpnPassword.setBounds(711, 364, 118, 36);
		frame.getContentPane().add(txtpnPassword);
		
		textField = new JTextField();
		textField.setBounds(650, 288, 250, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(650, 500, 250, 41);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane txtpnDontHaveAn = new JTextPane();
		txtpnDontHaveAn.setForeground(new Color(0, 0, 0));
		txtpnDontHaveAn.setBackground(new Color(255, 51, 0));
		txtpnDontHaveAn.setText("Not a Customer? Register Now!");
		txtpnDontHaveAn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnDontHaveAn.setBounds(34, 450, 284, 38);
		frame.getContentPane().add(txtpnDontHaveAn);
		
		JButton btnNewButton_1 = new JButton("SIGNUP");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(34, 499, 284, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextPane txtpnCustomer = new JTextPane();
		txtpnCustomer.setForeground(new Color(0, 0, 0));
		txtpnCustomer.setBackground(new Color(255, 51, 0));
		txtpnCustomer.setText("Customer");
		txtpnCustomer.setFont(new Font("Times New Roman", Font.BOLD, 36));
		txtpnCustomer.setBounds(483, 121, 157, 48);
		frame.getContentPane().add(txtpnCustomer);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(650, 416, 250, 48);
		frame.getContentPane().add(passwordField);
	}
}
