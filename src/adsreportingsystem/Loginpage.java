package adsreportingsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField user_text;
	private JTextField user_pass;
	JButton btnNewButton;
	String username;
	String password;
	JLabel lblNewLabel_2;
	Registration registration;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage frame = new Loginpage();
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
	
	
	public Loginpage() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 632);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 128));
		panel.setBounds(24, 20, 987, 545);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(270, 30, 468, 485);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Username");
		lblNewLabel.setBounds(72, 191, 100, 22);
		panel_1.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		 lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(180, 77, 100, 63);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(83, 251, 89, 22);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		user_text = new JTextField();
		user_text.setBounds(213, 196, 192, 19);
		panel_1.add(user_text);
		user_text.setColumns(10);
		
		user_pass = new JTextField();
		user_pass.setBounds(213, 256, 192, 19);
		panel_1.add(user_pass);
		user_pass.setColumns(10);
		
		btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		Submitbutton_clicked();	}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(157, 322, 127, 21);
		panel_1.add(btnNewButton);
		
		 username="admin";
		 password="password";
	}
	
	public void  Submitbutton_clicked()
	{
	
		if(user_text.getText().equals(username) && user_pass.getText().equals(password))
		{	
		 OpenRegistration();
			
		}
		else
		{
		JOptionPane.showMessageDialog(null, "mismatched!");
		}
		
	
	}
	
	public void OpenRegistration()
	{
		 registration = new Registration();
		 registration.setVisible(true);
		
	}
}
