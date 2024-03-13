package javaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameTxt;
	private JPasswordField passwordTxt;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(88, 87, 104, 26);
		contentPane.add(lblNewLabel);
		
		usernameTxt = new JTextField();
		usernameTxt.setHorizontalAlignment(SwingConstants.CENTER);
		usernameTxt.setBounds(202, 77, 256, 47);
		contentPane.add(usernameTxt);
		usernameTxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(88, 170, 104, 26);
		contentPane.add(lblNewLabel_1);
		
		passwordTxt = new JPasswordField();
		passwordTxt.setBounds(202, 157, 256, 47);
		contentPane.add(passwordTxt);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//  JOptionPane.showMessageDialog(null, "Hello");
				
				//login form validation
				if(usernameTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(usernameTxt, "username is required");
					return;
				}
				
				
				if(passwordTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(passwordTxt, "password is required");
					return;
				}
				
				
				String un  =  usernameTxt.getText();
				String psw =  passwordTxt.getText();
				
				if(un.equals("ram") && psw.equals("123")) {
					
					JOptionPane.showMessageDialog(null, "login success");  
					new Home().setVisible(true);
					dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "login failed");
				}
				  
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 255));
		btnNewButton.setBounds(233, 224, 98, 47);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("User Login");
		lblNewLabel_2.setForeground(new Color(0, 255, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_2.setBounds(154, 14, 304, 52);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usernameTxt.setText("");
				passwordTxt.setText("");
			}
		});
		btnNewButton_1.setBounds(341, 221, 89, 50);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("CREATE NEW ACCOUNT");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				new RegisterForm().setVisible(true);
				
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(224, 281, 265, 47);
		contentPane.add(lblNewLabel_3);
	}
}
