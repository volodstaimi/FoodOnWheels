import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;

public class customer_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_GUI window = new customer_GUI();
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
	public customer_GUI() {
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
		lblNewLabel.setIcon(new ImageIcon(customer_GUI.class.getResource("/images/250x250 logo.jpg")));
		lblNewLabel.setBounds(0, 0, 250, 250);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnCustomer = new JTextPane();
		txtpnCustomer.setEditable(false);
		txtpnCustomer.setText("CUSTOMER");
		txtpnCustomer.setFont(new Font("Times New Roman", Font.BOLD, 86));
		txtpnCustomer.setBackground(new Color(255, 51, 0));
		txtpnCustomer.setBounds(365, 80, 525, 127);
		frame.getContentPane().add(txtpnCustomer);
		
		JTextPane txtpnWelcome = new JTextPane();
		txtpnWelcome.setText("Welcome,    <Customer Name>");
		txtpnWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		txtpnWelcome.setBackground(new Color(255, 51, 0));
		txtpnWelcome.setBounds(375, 218, 515, 65);
		frame.getContentPane().add(txtpnWelcome);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 315, 1214, 335);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(customer_GUI.class.getResource("/images/images.jpg")));
		lblNewLabel_1.setBounds(984, 0, 250, 250);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.setBounds(984, 261, 240, 43);
		frame.getContentPane().add(btnNewButton);
		
		
		//For Date To be displayed on Customer Screen
		Date date=new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
       
        //Date Text Field
		JTextPane txtpnDay = new JTextPane();
		txtpnDay.setEditable(false);
		txtpnDay.setFont(new Font("Times New Roman", Font.BOLD, 24));
		txtpnDay.setBackground(SystemColor.menu);
		txtpnDay.setText("             "+dayWeekText);
		txtpnDay.setBounds(10, 261, 240, 43);
		frame.getContentPane().add(txtpnDay);
		frame.setBounds(15, 15, 1250, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
