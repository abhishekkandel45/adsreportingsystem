package adsreportingsystem;

//import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JEditorPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
//import javax.swing.JPasswordField; // Importing the password field

public class LoginPage extends JFrame {

    private JPanel contentPane;
    private JTextField user_text;
    private JTextField user_pass; // Password field to hide the password
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
                    LoginPage frame = new LoginPage();
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
public LoginPage() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 627);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1049, 595);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(513, 0, 536, 595);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Username");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(132, 146, 125, 35);
		panel_1.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		 lblNewLabel_2 = new JLabel("Welcome Back !");
		 lblNewLabel_2.setForeground(new Color(255, 255, 255));
		 lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setBounds(148, 47, 239, 63);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(119, 226, 114, 35);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		user_text = new JTextField();
		user_text.setBackground(new Color(255, 255, 255));
		user_text.setBounds(136, 181, 263, 35);
		panel_1.add(user_text);
		user_text.setColumns(10);
		
		user_pass = new JTextField();
		user_pass.setBackground(new Color(255, 255, 255));
		user_pass.setBounds(136, 263, 263, 35);
		panel_1.add(user_pass);
		user_pass.setColumns(10);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 51, 204));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		Submitbutton_clicked();	}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(211, 341, 114, 35);
		panel_1.add(btnNewButton);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(new Color(0, 102, 204));
		editorPane_1.setBounds(-39, 0, 554, 595);
		panel_1.add(editorPane_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		
//BAckground image
        
		lblNewLabel_3.setBounds(0, 0, 511, 595);
		panel.add(lblNewLabel_3);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(410, 35, 107, 19);
		panel.add(editorPane);
		
		
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