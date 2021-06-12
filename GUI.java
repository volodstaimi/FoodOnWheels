
package Setup;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GUI {
	int  FoodID=1;	
	String  FoodName;
	double FoodPrice;
	String FoodList;
	
	

	/**
	 * @wbp.parser.entryPoint
	 */
	
	public void homePage()
	{ 	
		JFrame frame = new JFrame("Food on Wheels");
		frame.getContentPane().setBackground(new Color(255, 51, 51));
		frame.setVisible(true);
		frame.setBounds( 10,10,1250,700);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Customer");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton.setBounds(838, 60, 264, 84);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnResturant = new JButton("Restaurant");
		btnResturant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Res_GUI();
			}
		});
		btnResturant.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnResturant.setBounds(838, 227, 264, 84);
		frame.getContentPane().add(btnResturant);
		
		JButton btnRider = new JButton("Rider");
		btnRider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				rider_GUI();
			}
		});
		btnRider.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnRider.setBounds(838, 395, 264, 84);
		frame.getContentPane().add(btnRider);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnAdmin.setBounds(838, 558, 264, 84);
		frame.getContentPane().add(btnAdmin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GUI.class.getResource("/Images/logo 700.png")));
		lblNewLabel.setBounds(10, 11, 705, 641);
		frame.getContentPane().add(lblNewLabel);
		
	}
	
	
	public void  Res_GUI()
		{ 
		JFrame frame= new JFrame("FOOD ON WHEELS");
		frame.setBounds(10, 10, 1250, 700);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 51, 51));
		panel.setBounds(0, 0, 1226, 663);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JButton btnOrderStatus = new JButton("Update Order Status");
		btnOrderStatus.setBounds(868, 549, 263, 42);
		panel.add(btnOrderStatus);
		btnOrderStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int orderID=Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Order ID"));
				while(orderID<0)
				{
					orderID=Integer.parseInt(JOptionPane.showInputDialog(frame, "Incorrect Order ID, enter again"));
				}
			}
		});
		btnOrderStatus.setBackground(new Color(255, 51, 0));
		btnOrderStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOrderStatus.setForeground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 120, 120);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(GUI.class.getResource("/Images/logo200.png")));
		lblNewLabel_2.setBounds(0, 0, 120, 120);
		panel_1.add(lblNewLabel_2);
		
		JTextArea txtrFood = new JTextArea();
		txtrFood.setBounds(50, 256, 388, 335);
		panel.add(txtrFood);
		JButton btnNewButton = new JButton("Delete Item");
		btnNewButton.setBounds(298, 605, 122, 28);
		panel.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Add new Item");
		btnNewButton_1.setBounds(166, 605, 122, 28);
		panel.add(btnNewButton_1);
		JButton btnNewButton_3 = new JButton("Edit");
		btnNewButton_3.setBounds(75, 605, 81, 28);
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fID=Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter food ID"));
				String newName= JOptionPane.showInputDialog(frame,"Enter new food name");
				String newPrice=JOptionPane.showInputDialog(frame,"Enter new food price");
				while(fID<0 || newName.isBlank() || newPrice.isBlank() )
				{
					JOptionPane.showMessageDialog(frame, "Incomplete details",
				               "Error",JOptionPane.DEFAULT_OPTION );
					newName= JOptionPane.showInputDialog(frame,"Enter new food name");
					newPrice=JOptionPane.showInputDialog(frame,"Enter new food price");
					
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JTextPane txtpnFoodListHeading = new JTextPane();
		txtpnFoodListHeading.setForeground(new Color(255, 255, 255));
		txtpnFoodListHeading.setBackground(new Color(255, 51, 51));
		txtpnFoodListHeading.setEditable(false);
		txtpnFoodListHeading.setBounds(171, 209, 169, 42);
		panel.add(txtpnFoodListHeading);
		txtpnFoodListHeading.setFont(new Font("SansSerif", Font.BOLD, 33));
		txtpnFoodListHeading.setText("Food List");
		
		JTextPane txtpnFeedbackHeading = new JTextPane();
		txtpnFeedbackHeading.setText("Feedback");
		txtpnFeedbackHeading.setForeground(Color.WHITE);
		txtpnFeedbackHeading.setFont(new Font("SansSerif", Font.BOLD, 33));
		txtpnFeedbackHeading.setEditable(false);
		txtpnFeedbackHeading.setBackground(new Color(255, 51, 51));
		txtpnFeedbackHeading.setBounds(551, 209, 169, 42);
		panel.add(txtpnFeedbackHeading);
		
		JTextPane txtpnOrdersHeading = new JTextPane();
		txtpnOrdersHeading.setText("Orders");
		txtpnOrdersHeading.setForeground(Color.WHITE);
		txtpnOrdersHeading.setFont(new Font("SansSerif", Font.BOLD, 33));
		txtpnOrdersHeading.setEditable(false);
		txtpnOrdersHeading.setBackground(new Color(255, 51, 51));
		txtpnOrdersHeading.setBounds(942, 209, 120, 42);
		panel.add(txtpnOrdersHeading);
		
		JTextArea orders = new JTextArea();
		orders.setText("orders");
		orders.setFont(new Font("HP Simplified Hans", Font.PLAIN, 15));
		orders.setEditable(false);
		orders.setBounds(835, 261, 339, 335);
		panel.add(orders);
		JTextArea feedBacktxt = new JTextArea();
		feedBacktxt.setBounds(481, 261, 307, 335);
		panel.add(feedBacktxt);
		feedBacktxt.setText("Feedback");
		feedBacktxt.setEditable(false);
		feedBacktxt.setFont(new Font("HP Simplified Hans", Font.PLAIN, 15));
		
		JTextPane txtpnFoodList_1_3 = new JTextPane();
		txtpnFoodList_1_3.setText("Restuarant ");
		txtpnFoodList_1_3.setForeground(Color.WHITE);
		txtpnFoodList_1_3.setFont(new Font("SansSerif", Font.BOLD, 40));
		txtpnFoodList_1_3.setEditable(false);
		txtpnFoodList_1_3.setBackground(new Color(255, 51, 51));
		txtpnFoodList_1_3.setBounds(502, 34, 218, 63);
		panel.add(txtpnFoodList_1_3);
		
		JButton btnNewButton_4 = new JButton("Log out");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				homePage();
				
			}
		});
		btnNewButton_4.setBounds(1116, 624, 100, 28);
		panel.add(btnNewButton_4);
		
		JTextPane txtpnResname = new JTextPane();
		txtpnResname.setBounds(512, 107, 210, 49);
		panel.add(txtpnResname);
		txtpnResname.setForeground(new Color(255, 255, 255));
		txtpnResname.setBackground(new Color(255, 51, 51));
		txtpnResname.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtpnResname.setEditable(false);
		txtpnResname.setText("<<Name here>>");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String name=JOptionPane.showInputDialog(frame,"Enter Name");
				String price=JOptionPane.showInputDialog(frame,"Enter Price");
				
				while((name.isBlank() && price.isBlank()))
				{
					JOptionPane.showMessageDialog(frame, "Incorrect options",
						      "Error", JOptionPane.ERROR_MESSAGE);
					name=JOptionPane.showInputDialog(frame,"Enter Name");
					price=JOptionPane.showInputDialog(frame,"Enter Name");
				}
				
				txtrFood.append("Food ID= "+String.valueOf(FoodID)+ " | Name= " +name+" | Price= "+price+"\n");
				FoodName=name;
				FoodPrice=Double.parseDouble(price);
				frame.validate();
				frame.repaint();
				FoodList=("Food ID= "+String.valueOf(FoodID)+ " | Name= " +name+" | Price= "+price+"\n");
				FoodID++;
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fID=Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter Food ID"));
			}
		});
		frame.setVisible(true);	
	}
	
	
	
	public void rider_GUI()
	{
		JFrame frame= new JFrame("FOOD ON WHEELS");
		frame.setBounds(10, 10, 1250, 700);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 51, 0));
		panel.setBounds(0, 0, 1236, 663);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(GUI.class.getResource("/Images/logo200.png")));
		lblNewLabel_1.setBounds(10, 11, 120, 120);
		panel.add(lblNewLabel_1);
		
		JTextPane txtpnRiders = new JTextPane();
		txtpnRiders.setBackground(new Color(255, 51, 51));
		txtpnRiders.setForeground(new Color(255, 255, 255));
		txtpnRiders.setFont(new Font("Tahoma", Font.PLAIN, 44));
		txtpnRiders.setText("RIDERS");
		txtpnRiders.setBounds(526, 34, 158, 60);
		panel.add(txtpnRiders);
		
		JTextPane txtpnWelcome = new JTextPane();
		txtpnWelcome.setText("Welcome <ridername>");
		txtpnWelcome.setForeground(Color.WHITE);
		txtpnWelcome.setFont(new Font("Tahoma", Font.PLAIN, 44));
		txtpnWelcome.setBackground(new Color(255, 51, 51));
		txtpnWelcome.setBounds(386, 118, 440, 60);
		panel.add(txtpnWelcome);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(632, 189, 594, 463);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnOrdersWaiting = new JTextPane();
		txtpnOrdersWaiting.setText("Orders Waiting");
		txtpnOrdersWaiting.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnOrdersWaiting.setBounds(238, 11, 140, 31);
		panel_1.add(txtpnOrdersWaiting);
		
		JTextPane txtpnAllOrdersWaiting = new JTextPane();
		txtpnAllOrdersWaiting.setText("ALL ORDERS WAITING WILL COME HERE");
		txtpnAllOrdersWaiting.setBounds(10, 54, 574, 334);
		panel_1.add(txtpnAllOrdersWaiting);
		
		JButton btnNewButton_2 = new JButton("Approve ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_2.setBounds(238, 402, 157, 39);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 189, 594, 463);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JTextPane txtpnCurrentOrders = new JTextPane();
		txtpnCurrentOrders.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnCurrentOrders.setText("Current Orders");
		txtpnCurrentOrders.setBounds(204, 11, 139, 31);
		panel_1_1.add(txtpnCurrentOrders);
		
		JTextPane txtpnAllCurrentOrders = new JTextPane();
		txtpnAllCurrentOrders.setText("All current orders of rider come here ");
		txtpnAllCurrentOrders.setBounds(10, 56, 574, 334);
		panel_1_1.add(txtpnAllCurrentOrders);
		
		JButton btnNewButton_2_1 = new JButton("Update Status");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_2_1.setBounds(63, 401, 157, 39);
		panel_1_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Cash Collected ");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_2_2.setBounds(338, 401, 174, 39);
		panel_1_1.add(btnNewButton_2_2);
		frame.setVisible(true);
	}
	
	
	
	
	public void Res_signup()
	{			
				JTextField resUsername;
				JTextField resPhone;
				JButton btnNewButton;
				JTextField resName;
				JTextField resAddress;
				JTextField resEmail;
				JPasswordField resPass;
				
				JFrame frame= new JFrame();
				frame.getContentPane().setBackground(new Color(255, 51, 51));
				frame.setBounds(20, 20, 420, 450);
				frame.getContentPane().setLayout(null);
				resPass = new JPasswordField();
					resPass.setBounds(183, 305, 180, 32);
					frame.getContentPane().add(resPass);
					
					resEmail = new JTextField();
					resEmail.setColumns(10);
					resEmail.setBounds(183, 212, 180, 34);
					frame.getContentPane().add(resEmail);
					
					resAddress = new JTextField();
					resAddress.setColumns(10);
					resAddress.setBounds(183, 121, 180, 34);
					frame.getContentPane().add(resAddress);
					
					resName = new JTextField();
					resName.setColumns(10);
					resName.setBounds(183, 77, 180, 34);
					frame.getContentPane().add(resName);
					
					resUsername = new JTextField();
					resUsername.setColumns(10);
					resUsername.setBounds(183, 257, 180, 34);
					frame.getContentPane().add(resUsername);
					
					resPhone = new JTextField();
					resPhone.setColumns(10);
					resPhone.setBounds(183, 166, 180, 34);
					frame.getContentPane().add(resPhone);
					
					btnNewButton = new JButton("Sign Up");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String name,address,contnum,email,password,username;
							name=resName.getText();
							address=resAddress.getText();
							contnum=resEmail.getText();
							email=resAddress.getText();
							username=resUsername.getText();
							password=resPass.getText();
							if (name.isBlank()||email.isBlank()||password.isBlank()||address.isBlank()||contnum.isBlank()||username.isBlank())
								{	JOptionPane.showMessageDialog(frame, "Enter complete details",
							               "Error",JOptionPane.ERROR_MESSAGE );}

								else if (!(email.contains("@")))
										{
									JOptionPane.showMessageDialog(frame, "Email Invalid ",
								               "error",JOptionPane.ERROR_MESSAGE );
										}
								else if (password.length()<8)
								
									{JOptionPane.showMessageDialog(frame, "The length of Password must be greater than 8 Characters ",
								               "error",JOptionPane.ERROR_MESSAGE );
								}
								else {JOptionPane.showMessageDialog(frame, "Your Account has been made",
							               "Welcome!",JOptionPane.DEFAULT_OPTION );}
						
							
						}
					});
					btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
					btnNewButton.setBounds(131, 353, 121, 33);
					frame.getContentPane().add(btnNewButton);
					
					JTextPane txtpnSignUp = new JTextPane();
					txtpnSignUp.setEditable(false);
					txtpnSignUp.setForeground(new Color(255, 255, 255));
					txtpnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 30));
					txtpnSignUp.setText("Sign Up");
					txtpnSignUp.setBackground(new Color(255, 51, 51));
					txtpnSignUp.setBounds(142, 23, 121, 43);
					frame.getContentPane().add(txtpnSignUp);
					
					
					
					JTextArea txtrRestaurantName = new JTextArea();
					txtrRestaurantName.setText("Restaurant Name");
					txtrRestaurantName.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
					txtrRestaurantName.setForeground(new Color(255, 255, 255));
					txtrRestaurantName.setEditable(false);
					txtrRestaurantName.setBackground(new Color(255, 51, 51));
					txtrRestaurantName.setBounds(24, 80, 138, 34);
					frame.getContentPane().add(txtrRestaurantName);
					
					JTextArea txtrRestaurantAddress = new JTextArea();
					txtrRestaurantAddress.setText("Address");
					txtrRestaurantAddress.setForeground(Color.WHITE);
					txtrRestaurantAddress.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
					txtrRestaurantAddress.setEditable(false);
					txtrRestaurantAddress.setBackground(new Color(255, 51, 51));
					txtrRestaurantAddress.setBounds(24, 126, 138, 34);
					frame.getContentPane().add(txtrRestaurantAddress);
					
					JTextArea txtrRestaurantPhone = new JTextArea();
					txtrRestaurantPhone.setText("Phone");
					txtrRestaurantPhone.setForeground(Color.WHITE);
					txtrRestaurantPhone.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
					txtrRestaurantPhone.setEditable(false);
					txtrRestaurantPhone.setBackground(new Color(255, 51, 51));
					txtrRestaurantPhone.setBounds(24, 172, 138, 34);
					frame.getContentPane().add(txtrRestaurantPhone);
					
					JTextArea txtrRestaurantEmail = new JTextArea();
					txtrRestaurantEmail.setText("Email");
					txtrRestaurantEmail.setForeground(Color.WHITE);
					txtrRestaurantEmail.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
					txtrRestaurantEmail.setEditable(false);
					txtrRestaurantEmail.setBackground(new Color(255, 51, 51));
					txtrRestaurantEmail.setBounds(24, 217, 138, 34);
					frame.getContentPane().add(txtrRestaurantEmail);
					
					JTextArea txtrRestaurantUsername = new JTextArea();
					txtrRestaurantUsername.setText("UserName");
					txtrRestaurantUsername.setForeground(Color.WHITE);
					txtrRestaurantUsername.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
					txtrRestaurantUsername.setEditable(false);
					txtrRestaurantUsername.setBackground(new Color(255, 51, 51));
					txtrRestaurantUsername.setBounds(24, 262, 138, 34);
					frame.getContentPane().add(txtrRestaurantUsername);
					
					JTextArea txtrRestaurantPassword = new JTextArea();
					txtrRestaurantPassword.setText("Password");
					txtrRestaurantPassword.setForeground(Color.WHITE);
					txtrRestaurantPassword.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
					txtrRestaurantPassword.setEditable(false);
					txtrRestaurantPassword.setBackground(new Color(255, 51, 51));
					txtrRestaurantPassword.setBounds(24, 308, 138, 34);
					frame.getContentPane().add(txtrRestaurantPassword);
					frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUI gui= new GUI();
		gui.homePage();
	}
	}



