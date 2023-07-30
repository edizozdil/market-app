package project;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindow extends JFrame implements MouseListener
{

	JLabel lblUser = new JLabel("Username:"); 
	JLabel lblPassword = new JLabel("Password:"); 
	JTextField txtUser = new JTextField();
	JPasswordField txtPass = new JPasswordField();
	JButton btnSignUp = new JButton("Sign Up");
	JButton btnOk = new JButton("Log In");
	boolean regex1;
	
	public LoginWindow() 
	{
	super("FastMarket");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(400,200);
	setLayout(new GridLayout(3,2));
	

	
	add(lblUser); add(txtUser);
	add(lblPassword); add(txtPass);
	add(btnOk); add(btnSignUp);
	
	
	btnOk.addMouseListener(this);
	btnSignUp.addMouseListener(this);
	
	
	}
	
	
	
	public static void main(String[] args) 
	{
		new LoginWindow().setVisible(true);
	}
	 

	public void mouseClicked(MouseEvent e) 
	{
		if(e.getSource()==btnSignUp) {
			new LoginPage().setVisible(true);
		}
		else if(e.getSource()==btnOk) {
			regex1=txtUser.getText().matches("[a-zA-Z]{2,}[.-_]{0,}[a-zA-Z0-9]{3,}");
			if (regex1==true)
			{
				new Giris().setVisible(true);
			   
			}
			else if (regex1== false)
				JOptionPane.showMessageDialog(null, "False Username or Password!");
		}
			
			 
		
	}
	public void mouseEntered(MouseEvent e) 
	{

		
	}

	public void mouseExited(MouseEvent e) 
	{

		
	}

	public void mousePressed(MouseEvent e) 
	{

		
	}
	
	public void mouseReleased(MouseEvent e) 
	{
		
	}
	
	
}