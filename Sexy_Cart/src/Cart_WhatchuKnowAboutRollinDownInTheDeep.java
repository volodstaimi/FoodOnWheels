import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Cart_WhatchuKnowAboutRollinDownInTheDeep {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart_WhatchuKnowAboutRollinDownInTheDeep window = new Cart_WhatchuKnowAboutRollinDownInTheDeep();
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
	public Cart_WhatchuKnowAboutRollinDownInTheDeep() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 51, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(Cart_WhatchuKnowAboutRollinDownInTheDeep.class.getResource("/images/250x250 logo.jpg")));
		lblNewLabel.setBounds(0, 0, 250, 250);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setBackground(new Color(255, 51, 0));
		lblNewLabel_1.setIcon(new ImageIcon(Cart_WhatchuKnowAboutRollinDownInTheDeep.class.getResource("/images/cart BIG.jpg")));
		lblNewLabel_1.setBounds(984, 0, 250, 250);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextPane txtpnCart = new JTextPane();
		txtpnCart.setForeground(Color.BLACK);
		txtpnCart.setEditable(false);
		txtpnCart.setBackground(new Color(255, 51, 0));
		txtpnCart.setText("CART");
		txtpnCart.setFont(new Font("Times New Roman", Font.BOLD, 72));
		txtpnCart.setBounds(500, 130, 224, 90);
		frame.getContentPane().add(txtpnCart);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 261, 966, 389);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 32));
		btnNewButton.setBounds(984, 330, 240, 73);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REMOVE");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		btnNewButton_1.setBounds(984, 425, 238, 73);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CHECKOUT");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 32));
		btnNewButton_2.setBounds(984, 520, 240, 73);
		frame.getContentPane().add(btnNewButton_2);
		frame.setBounds(10, 10, 1250, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
