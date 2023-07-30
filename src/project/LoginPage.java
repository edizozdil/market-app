package project;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class LoginPage extends JFrame implements MouseListener
{

	
	JLabel lblInfo= new JLabel("");
	
	JTextField txtUserName = new JTextField();
	JPasswordField txtPass = new JPasswordField();
	JTextField txtName = new JTextField();
	JTextField txtSurname = new JTextField();
	JTextField txtBirthDate = new JTextField();
	JTextField txtPhone = new JTextField();
	JTextField txtPostalCode = new JTextField();
	JTextField txtEmail = new JTextField();
	
	
	JButton btnClear = new JButton("Clear");
	JButton btnSignUp = new JButton("SignUp");
	
	DefaultComboBoxModel<String> dcmGender = new DefaultComboBoxModel<>();
	JComboBox<String> cmbGender = new JComboBox<String>(dcmGender);
	
	public LoginPage() 
	{
		super("Sign Up Window");
		setSize(350, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		setDesign();
		
		
		btnSignUp.addMouseListener(this);
		btnClear.addMouseListener(this);
	
	
	}
	
	public void setDesign()
	{
		setLayout(new GridLayout(11, 2));
		
		
		
		
		add(lblInfo);
		add(new JLabel());
		
		add(new JLabel("User Name"));
		txtUserName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtUserName.getText().matches("[a-zA-Z]{2,}[.-_]{0,}[a-zA-Z0-9]{3,}"))
					lblInfo.setText("UserName Matched");
				else
					lblInfo.setText("UserName not Matched");
			}	
			});
		add(txtUserName);
		
		add(new JLabel("Password"));
		txtPass.addKeyListener(new KeyAdapter() {
		@Override
		public void keyReleased(KeyEvent e) {
			txtPass.setText(new String(txtPass.getPassword()).replace(" "," "));
		}	
		});
		add(txtPass);

		
		add(new JLabel("Name"));
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtName.getText().matches("[a-zA-Z]{2,}[ ]?[a-zA-Z]{0,}")) 
					// {0,} --> *
					// {0,1} --> ?
					lblInfo.setText("Name Matched");
				else
					lblInfo.setText("Name not Matched");
			}
		});
		add(txtName);

		add(new JLabel("Surname"));
		txtSurname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtSurname.getText().matches("[a-zA-Z]{2,}[ ]?[a-zA-Z]{0,}")) 
					// {0,} --> *
					// {0,1} --> ?
					lblInfo.setText("Name Matched");
				else
					lblInfo.setText("Name not Matched");
			}
		});
		add(txtSurname);

		add(new JLabel("Gender"));
		dcmGender.addElement(GENDER.FEMALE.name());
		dcmGender.addElement(GENDER.MALE.name());
		dcmGender.addElement(GENDER.NOT_SPECIFIED.name());
		add(cmbGender);

		add(new JLabel("Birth Date (DD.MM.YYYY)"));
		txtBirthDate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtBirthDate.getText().matches("[0,9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}"))
					lblInfo.setText("Birth Date Matched");
				else
					lblInfo.setText("Birth Date not Matched");
			}
		});
		add(txtBirthDate);

		add(new JLabel("Phone Number"));
		txtPhone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtPhone.getText().matches("[+]{1}[9]{1}[0]{1}[0-9]{10}" //+02123810000
						+ "|([0]{2}[9]{1}[0]{1}[0-9]{10})" //00902123810000
						+ "|([0-9]{11})" )) //02123810000
					lblInfo.setText("Phone Number Matched");
				else
					lblInfo.setText("Phone Number not Matched");
					}
		});
		add(txtPhone);

		add(new JLabel("Postal Code"));
		txtPostalCode.addKeyListener(new KeyAdapter() {
			@Override
			
			public void keyReleased(KeyEvent e) {
			
				if(txtPostalCode.getText().matches("[0-9]{5}"))
					lblInfo.setText("Postal Code Matched");
				else
					lblInfo.setText("Postal Code not Matched");
					
			}
		});
		add(txtPostalCode);

		add(new JLabel("Email"));
		txtPostalCode.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String regexEmail= "[a-z]+([.-_][a-z0-9]+){0,}" 
						+ "@"
						+ "[a-z0-9]{0,}" 
						+ "(\\.[a-z0-9]+){0,}"
						+ "(\\.[a-z]{2,})$";
				if(txtPostalCode.getText().matches(regexEmail))
						lblInfo.setText("E-Mail Matched");
				else
					lblInfo.setText("E-Mail not Matched");
			}
						});
		add(txtEmail);
		
		
		add(btnClear);
		add(btnSignUp);
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		new LoginPage().setVisible(true);
		
	}
	
	LoginWindow log = new LoginWindow();
	
	
	public void mouseClicked(MouseEvent e) 
	{
		
		
	    if(e.getSource() == btnSignUp)
			log.setVisible(true);
		else if(e.getSource() == btnClear)
			txtUserName.setText("");
			txtName.setText("");
			txtSurname.setText("");
			txtBirthDate.setText("");
			txtPhone.setText("");
			txtEmail.setText("");
			txtPostalCode.setText("");
			txtPass.setText("");
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
	
