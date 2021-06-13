import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;

public class screenLoading {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					screenLoading window = new screenLoading();
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
	public screenLoading() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 99, 71));
		frame.setBounds(100, 100, 1250, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(screenLoading.class.getResource("/Images/FINAL LOADING LOGO.gif")));
		lblNewLabel.setBounds(500, 60, 487, 342);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(screenLoading.class.getResource("/Images/ezgif.com-gif-maker (3).gif")));
		lblNewLabel_1.setBounds(594, 395, 54, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextPane txtpnDesignedInFast = new JTextPane();
		txtpnDesignedInFast.setEditable(false);
		txtpnDesignedInFast.setBackground(new Color(255, 99, 71));
		txtpnDesignedInFast.setText("Designed in FAST NUCES with \uD83D\uDC9B");
		txtpnDesignedInFast.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtpnDesignedInFast.setBounds(986, 623, 238, 27);
		frame.getContentPane().add(txtpnDesignedInFast);
		
		JTextPane txtpnWelcome = new JTextPane();
		txtpnWelcome.setEditable(false);
		txtpnWelcome.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 72));
		txtpnWelcome.setText("Food On Wheels");
		txtpnWelcome.setBackground(new Color(255, 99, 71));
		txtpnWelcome.setBounds(325, 473, 703, 124);
		frame.getContentPane().add(txtpnWelcome);
	}
}
