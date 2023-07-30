package project;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Snacks extends JFrame implements MouseListener {

	 private JPanel contentPane;
	 static String h1,h2,h3,h4,h5,h6,h7,temp;
	 static int s1,s2,s3,s4,s5,s6,s7,tempz;
	 ShoppingChart itemsListInstance = new ShoppingChart();
	 LinkedList shoppingCart = new LinkedList();
	 
	 JRadioButton rdbtnNewRadioButton = new JRadioButton("Doritos Taco Spicy");
	 JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Ruffles Ketchup");
	 JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Lay's Classic");
	 JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Toblerone");
	 JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("Tadelle");
	 JRadioButton rdbtnNewRadioButton_3_1_1 = new JRadioButton("Eti Browni Intense");
	 JRadioButton rdbtnNewRadioButton_3_1_1_1 = new JRadioButton("Ülker Stick Crackers");
	
	 JComboBox comboBox = new JComboBox();
	 JComboBox comboBox_1 = new JComboBox();
	 JComboBox comboBox_1_1 = new JComboBox();
	 JComboBox comboBox_1_1_1 = new JComboBox();
	 JComboBox comboBox_1_1_1_1 = new JComboBox();
	 JComboBox comboBox_1_1_1_1_1 = new JComboBox();
	 JComboBox comboBox_1_1_1_1_1_1 = new JComboBox();
	 
	 JButton btnNewButton = new JButton("Checkout");
	 private final JLabel lblNewLabel = new JLabel("1 pc=  9 TL");
	 private final JLabel lblNewLabel_1 = new JLabel("1 pc=  9 TL");
	 private final JLabel lblNewLabel_2 = new JLabel("1 pc=  9 TL");
	 private final JLabel lblNewLabel_2_1 = new JLabel("1 pc=  15 TL");
	 private final JLabel lblNewLabel_2_1_1 = new JLabel("1 pc=  8 TL");
	 private final JLabel lblNewLabel_2_1_1_1 = new JLabel("1 pc=  5 TL");
	 private final JLabel lblNewLabel_2_1_1_1_1 = new JLabel("1 pc=  4 TL");
	 
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Snacks frame = new Snacks();
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
	public Snacks() {
		super("Snacks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//	JRadioButton rdbtnNewRadioButton = new JRadioButton("Doritos Taco Spicy");
		rdbtnNewRadioButton.setBounds(6, 18, 169, 23);
		contentPane.add(rdbtnNewRadioButton);
		
	//	JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(217, 18, 127, 27);
		contentPane.add(comboBox);
		
	//  JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Ruffles Ketchup");
		rdbtnNewRadioButton_1.setBounds(6, 48, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
	//	JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1.setBounds(217, 48, 127, 27);
		contentPane.add(comboBox_1);
		
	//	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Lay's Classic");
		rdbtnNewRadioButton_2.setBounds(6, 77, 141, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
	//	JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1.setBounds(217, 77, 127, 27);
		contentPane.add(comboBox_1_1);
		
	//	JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Toblerone");
		rdbtnNewRadioButton_3.setBounds(6, 112, 141, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
	//	JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1_1.setBounds(217, 112, 127, 27);
		contentPane.add(comboBox_1_1_1);
		
	//	JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("Tadelle");
		rdbtnNewRadioButton_3_1.setBounds(6, 147, 141, 23);
		contentPane.add(rdbtnNewRadioButton_3_1);
		
	//	JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1_1_1.setBounds(217, 147, 127, 27);
		contentPane.add(comboBox_1_1_1_1);
		
	//	JRadioButton rdbtnNewRadioButton_3_1_1 = new JRadioButton("Eti Browni Intense");
		rdbtnNewRadioButton_3_1_1.setBounds(6, 182, 169, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1);
		
	//	JComboBox comboBox_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1_1_1_1.setBounds(217, 182, 127, 27);
		contentPane.add(comboBox_1_1_1_1_1);
		
	//	JRadioButton rdbtnNewRadioButton_3_1_1_1 = new JRadioButton("Ülker Stick Crackers");
		rdbtnNewRadioButton_3_1_1_1.setBounds(6, 217, 169, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1);
		
	//	JComboBox comboBox_1_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1_1_1_1_1.setBounds(217, 217, 127, 27);
		contentPane.add(comboBox_1_1_1_1_1_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	//	JButton btnNewButton = new JButton("Checkout");
		btnNewButton.setBounds(503, 111, 117, 29);
		contentPane.add(btnNewButton);
		lblNewLabel.setBounds(380, 22, 100, 16);
		
		contentPane.add(lblNewLabel);
		lblNewLabel_1.setBounds(380, 52, 100, 16);
		
		contentPane.add(lblNewLabel_1);
		lblNewLabel_2.setBounds(380, 81, 100, 16);
		
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2_1.setBounds(380, 116, 100, 16);
		
		contentPane.add(lblNewLabel_2_1);
		lblNewLabel_2_1_1.setBounds(380, 151, 100, 16);
		
		contentPane.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1_1.setBounds(380, 186, 100, 16);
		
		contentPane.add(lblNewLabel_2_1_1_1);
		lblNewLabel_2_1_1_1_1.setBounds(380, 221, 100, 16);
		
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		 rdbtnNewRadioButton.addMouseListener(this);
		 rdbtnNewRadioButton_1.addMouseListener(this);
		 rdbtnNewRadioButton_2.addMouseListener(this);
		 rdbtnNewRadioButton_3 .addMouseListener(this);
		 rdbtnNewRadioButton_3_1 .addMouseListener(this);
	     rdbtnNewRadioButton_3_1_1 .addMouseListener(this);
		 rdbtnNewRadioButton_3_1_1_1 .addMouseListener(this);
		 btnNewButton.addMouseListener(this);
	}

	
	
	public boolean buy(boolean answer) 
	{
		if (answer)
			return true;
		return false;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnNewButton) 
		{
			boolean temp1= buy(rdbtnNewRadioButton.isSelected() ? true : false);
			if(temp1==true)
					{
				s1=Integer.parseInt((String)comboBox.getSelectedItem())*9;
				h1=shoppingCart.add(" Doritos Taco Spicy "  , Integer.parseInt((String)comboBox.getSelectedItem()))+ ( s1 + " TL ," );
					}
			else 
				h1="";
			boolean temp2= buy(rdbtnNewRadioButton_1.isSelected() ? true : false);
			if(temp2==true)
			{
				s2=Integer.parseInt((String)comboBox_1.getSelectedItem())*9;
				h2=shoppingCart.add(" Ruffles Ketchup "   , Integer.parseInt((String)comboBox_1.getSelectedItem()))+ ( s2 + " TL ," );
			}
			else 
				h2="";
			boolean temp3= buy(rdbtnNewRadioButton_2.isSelected() ? true : false);
			if(temp3==true)
			{
				s3=Integer.parseInt((String)comboBox_1_1.getSelectedItem())*9;
				h3=shoppingCart.add(" Lay's Classic " , Integer.parseInt((String)comboBox_1_1.getSelectedItem()))+ ( s3 + " TL ," );
			}
			else 
				h3="";
			boolean temp4= buy(rdbtnNewRadioButton_3.isSelected() ? true : false);
			if(temp4==true)
			{
				s4=Integer.parseInt((String)comboBox_1_1_1.getSelectedItem())*15;
				h4=shoppingCart.add(" Toblerone "   , Integer.parseInt((String)comboBox_1_1_1.getSelectedItem()))+ ( s4 + " TL ," );
			
			}
			else 
				h4="";
			boolean temp5= buy(rdbtnNewRadioButton_3_1.isSelected() ? true : false);
			if(temp5==true)
			{
				s5=Integer.parseInt((String)comboBox_1_1_1_1.getSelectedItem())*8;
				h5=shoppingCart.add(" Tadelle "  , Integer.parseInt((String)comboBox_1_1_1_1.getSelectedItem()))+ ( s5 + " TL ," );
			}
			else 
				h5="";
			boolean temp6= buy(rdbtnNewRadioButton_3_1_1.isSelected() ? true : false);
			if(temp6==true)
			{
				s6=Integer.parseInt((String)comboBox_1_1_1_1_1.getSelectedItem())*5;
				h6=shoppingCart.add(" Eti Browni Intense "  , Integer.parseInt((String)comboBox_1_1_1_1_1.getSelectedItem()))+ ( s6 + " TL ," );
			}
			else 
				h6="";
			boolean temp7= buy(rdbtnNewRadioButton_3_1_1_1.isSelected() ? true : false);
			if(temp7==true)
			{
				s7=Integer.parseInt((String)comboBox_1_1_1_1_1_1.getSelectedItem())*4;
				h7=shoppingCart.add(" Ülker Stick Crackers "  , Integer.parseInt((String)comboBox_1_1_1_1_1_1.getSelectedItem()))+ ( s7 + " TL ," );
			}
			else 
				h7="";
			
			temp=(String)(h1+ h2 + h3  + h4 + h5 + h6 + h7);
		    tempz=(int)(s1+s2+s3+s4+s5+s6+s7);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}