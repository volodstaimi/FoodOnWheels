package Setup;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
public class Res_GUI  {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void GUI(String resName) {
		controller c= new controller();
		FoodDetails_GUI2 f= new FoodDetails_GUI2();
	JFrame frame= new JFrame("FOOD ON WHEELS");
	frame.setBounds(10, 10, 1250, 700);
	frame.getContentPane().setLayout(null);
	JButton btnFoodDetails = new JButton("Food Details");
	btnFoodDetails.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
			JFrame frame2= new JFrame("Food Details");
			frame2.setVisible(true);
			frame2.setBounds(10, 10, 568, 648);
			frame2.getContentPane().setLayout(null);
			JTextPane txtpnFoodList = new JTextPane();
			txtpnFoodList.setEditable(false);
			txtpnFoodList.setFont(new Font("Tahoma", Font.PLAIN, 25));
			txtpnFoodList.setText("Food List");
			txtpnFoodList.setBounds(228, 84, 120, 37);
			frame2.getContentPane().add(txtpnFoodList);
			
			JTextPane txtpnFoodDetails = new JTextPane();
			txtpnFoodDetails.setText("Food Details");
			txtpnFoodDetails.setFont(new Font("Tahoma", Font.PLAIN, 35));
			txtpnFoodDetails.setEditable(false);
			txtpnFoodDetails.setBounds(188, 11, 200, 57);
			frame2.getContentPane().add(txtpnFoodDetails);
			
			JTextArea txtrFood = new JTextArea();
			txtrFood.setEditable(false);
			txtrFood.setBackground(Color.RED);
			txtrFood.setForeground(Color.WHITE);
			txtrFood.setFont(new Font("Myanmar Text", Font.PLAIN, 22));
			txtrFood.setText(c.getfoodTxt());
			frame2.validate();
			frame2.repaint();
			txtrFood.setBounds(10, 123, 533, 439);
			frame2.getContentPane().add(txtrFood);
			
			JButton btnNewButton = new JButton("Delete Item");
			btnNewButton.setBounds(374, 573, 122, 27);
			frame2.getContentPane().add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int id=Integer.parseInt(JOptionPane.showInputDialog(frame2,"Enter Food ID"));
					c.delete(id);
					frame2.repaint();
					txtrFood.setText(c.getfoodTxt());
					frame2.validate();
					frame2.repaint();
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JButton btnNewButton_1 = new JButton("Add new Item");
			btnNewButton_1.setBounds(210, 573, 138, 27);
			frame2.getContentPane().add(btnNewButton_1);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name=JOptionPane.showInputDialog(frame2,"Enter Name");
					double price=Double.parseDouble(JOptionPane.showInputDialog(frame2,"Enter Price"));
					c.addnew(0, name, price);
					txtrFood.setText(c.getfoodTxt());
					frame2.validate();
					frame2.repaint();	
				}
			});
			
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JButton btnNewButton_3 = new JButton("Back");
			btnNewButton_3.setBounds(92, 574, 81, 27);
			frame2.getContentPane().add(btnNewButton_3);
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame2.dispose();
				}
			});
			btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}	
		
	});
	btnFoodDetails.setForeground(new Color(255, 255, 255));
	btnFoodDetails.setBackground(new Color(255, 51, 0));
	btnFoodDetails.setFont(new Font("Tahoma", Font.PLAIN, 25));
	btnFoodDetails.setBounds(115, 252, 190, 71);
	frame.getContentPane().add(btnFoodDetails);
	JButton btnOrderStatus = new JButton("Order Status");
	btnOrderStatus.setBackground(new Color(255, 51, 0));
	btnOrderStatus.setFont(new Font("Tahoma", Font.PLAIN, 25));
	btnOrderStatus.setForeground(new Color(255, 255, 255));
	btnOrderStatus.setBounds(115, 387, 190, 71);
	frame.getContentPane().add(btnOrderStatus);
	JButton btnNewButton_2 = new JButton("New button");
	btnNewButton_2.setForeground(new Color(255, 255, 255));
	btnNewButton_2.setBackground(new Color(255, 51, 0));
	btnNewButton_2.setBounds(115, 527, 190, 71);
	frame.getContentPane().add(btnNewButton_2);
	JTextArea feedBacktxt = new JTextArea();
	feedBacktxt.setText("Feedback");
	feedBacktxt.setEditable(false);
	feedBacktxt.setFont(new Font("HP Simplified Hans", Font.PLAIN, 15));
	feedBacktxt.setBounds(468, 263, 298, 335);
	frame.getContentPane().add(feedBacktxt);
	JTextArea orderstxt = new JTextArea();
	orderstxt.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
	orderstxt.setText("orders come here");
	orderstxt.setBounds(867, 264, 323, 335);
	frame.getContentPane().add(orderstxt);
	
	JTextPane txtpnResname = new JTextPane();
	txtpnResname.setForeground(new Color(255, 255, 255));
	txtpnResname.setBackground(new Color(255, 51, 0));
	txtpnResname.setFont(new Font("Tahoma", Font.PLAIN, 35));
	txtpnResname.setEditable(false);
	txtpnResname.setText(resName);
	txtpnResname.setBounds(536, 101, 147, 49);
	frame.getContentPane().add(txtpnResname);
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setIcon(new ImageIcon(Res_GUI.class.getResource("/Images/resturant.jpg")));
	lblNewLabel.setBounds(0, 0, 1236, 663);
	frame.getContentPane().add(lblNewLabel);
	frame.setVisible(true);		
	}
}
