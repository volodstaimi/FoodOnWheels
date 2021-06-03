import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.TextField;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField txtDontHaveAn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 287);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(5, 5, 299, 245);
		contentPane.add(panel);
		
		TextField textField = new TextField();
		textField.setEditable(false);
		textField.setBackground(new Color(255, 0, 0));
		textField.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 12));
		textField.setForeground(new Color(255, 255, 255));
		textField.setText("FOOD ON DELIVERY");
		panel.add(textField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/images/pic1.jpg")));
		panel.add(lblNewLabel);
		
		Button button = new Button("Admin");
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBackground(new Color(250, 128, 114));
		button.setBounds(322, 127, 152, 33);
		contentPane.add(button);
		
		Button button_1 = new Button("Rider");
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBackground(new Color(250, 128, 114));
		button_1.setBounds(322, 88, 152, 33);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Restaurant");
		button_2.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2.setBackground(new Color(250, 128, 114));
		button_2.setBounds(322, 49, 152, 33);
		contentPane.add(button_2);
		
		Button button_3 = new Button("Customer");
		button_3.setFont(new Font("Dialog", Font.BOLD, 12));
		button_3.setBackground(new Color(250, 128, 114));
		button_3.setBounds(322, 10, 152, 33);
		contentPane.add(button_3);
		
		Button button_4 = new Button("Sign up!");
		button_4.setForeground(new Color(255, 255, 255));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setFont(new Font("Courier New", Font.BOLD, 14));
		button_4.setBackground(new Color(250, 128, 114));
		button_4.setBounds(322, 210, 152, 40);
		contentPane.add(button_4);
		
		txtDontHaveAn = new JTextField();
		txtDontHaveAn.setEditable(false);
		txtDontHaveAn.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		txtDontHaveAn.setText("Don't have an account?");
		txtDontHaveAn.setBounds(322, 184, 152, 20);
		contentPane.add(txtDontHaveAn);
		txtDontHaveAn.setColumns(10);
	}
}
