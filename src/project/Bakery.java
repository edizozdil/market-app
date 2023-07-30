package project;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Bakery extends JFrame implements MouseListener{

	private JPanel contentPane;
	
	 JRadioButton rdbtnNewRadioButton = new JRadioButton("White Bread");
	 JRadioButton rdbtnBrownBread = new JRadioButton("Brown Bread");
	 JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Baguette");
	 JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Uno Grain Pan Bread 550g");
	 JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("Uno Tandır Lavash 8 ct");
	 JRadioButton rdbtnNewRadioButton_1_1_1_1_1 = new JRadioButton("Simit Sandwich 185g");
	 JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1 = new JRadioButton("Chocolate Chip Cookies 110g");
	 JRadioButton rdbtnNewRadioButton_1_1_1_1_1_2 = new JRadioButton("Basil Flavored Grissini 150g");
	 JButton btnNewButton = new JButton("Checkout");

	 JComboBox comboBox = new JComboBox();
	 JComboBox comboBox_1 = new JComboBox();
	 JComboBox comboBox_1_1 = new JComboBox();
	 JComboBox comboBox_1_1_1 = new JComboBox();
	 JComboBox comboBox_1_1_2 = new JComboBox();
	 JComboBox comboBox_1_1_3 = new JComboBox();
	 JComboBox comboBox_1_1_4 = new JComboBox();
	 JComboBox comboBox_1_1_5 = new JComboBox();
	 static String h1,h2,h3,h4,h5,h6,h7,h8,temp;
	 static int s1,s2,s3,s4,s5,s6,s7,s8,tempz;
	 ShoppingChart itemsListInstance = new ShoppingChart();
	 LinkedList shoppingCart = new LinkedList();
	 private final JLabel lblNewLabel = new JLabel("1 pc = 3 TL");
	 private final JLabel lblNewLabel_1 = new JLabel("1 pc = 4 TL");
	 private final JLabel lblNewLabel_2 = new JLabel("1 pc = 10 TL");
	 private final JLabel lblNewLabel_3 = new JLabel("1 pc = 19 TL");
	 private final JLabel lblNewLabel_4 = new JLabel("1 pc = 23 TL");
	 private final JLabel lblNewLabel_5 = new JLabel("1 pc = 12 TL");
	 private final JLabel lblNewLabel_6 = new JLabel("1 pc = 15 TL");
	 private final JLabel lblNewLabel_7 = new JLabel("1 pc = 12 TL");
	 
 
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bakery frame = new Bakery();
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
	public Bakery() {
		setTitle("Bakery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JRadioButton rdbtnNewRadioButton = new JRadioButton("White Bread");
		rdbtnNewRadioButton.setBounds(6, 17, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		//JRadioButton rdbtnBrownBread = new JRadioButton("Brown Bread");
		rdbtnBrownBread.setBounds(6, 45, 141, 23);
		contentPane.add(rdbtnBrownBread);
		
		//JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Baguette");
		rdbtnNewRadioButton_1_1.setBounds(6, 74, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		//JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(341, 17, 141, 27);
		contentPane.add(comboBox);
		
		//JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1.setBounds(341, 45, 141, 27);
		contentPane.add(comboBox_1);
		
		//JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1.setBounds(341, 74, 141, 27);
		contentPane.add(comboBox_1_1);
		
		//JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Uno Grain Pan Bread 550g");
		rdbtnNewRadioButton_1_1_1.setBounds(6, 109, 220, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1);
		
		//JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("Uno  Tandır Lavash 8 ct");
		rdbtnNewRadioButton_1_1_1_1.setBounds(6, 144, 186, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1);
		
		//JRadioButton rdbtnNewRadioButton_1_1_1_1_1 = new JRadioButton("Simit  Sandwich 185g");
		rdbtnNewRadioButton_1_1_1_1_1.setBounds(6, 179, 186, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1);
		
		//JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1 = new JRadioButton("Chocolate Chip Cookies 110g");
		rdbtnNewRadioButton_1_1_1_1_1_1.setBounds(6, 206, 220, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1);
		
		//JRadioButton rdbtnNewRadioButton_1_1_1_1_1_2 = new JRadioButton("Basil Flavored Grissini 150g");
		rdbtnNewRadioButton_1_1_1_1_1_2.setBounds(6, 241, 220, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_2);
		
		//JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1_1.setBounds(341, 109, 141, 27);
		contentPane.add(comboBox_1_1_1);
		
		//JComboBox comboBox_1_1_2 = new JComboBox();
		comboBox_1_1_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1_2.setBounds(341, 144, 141, 27);
		contentPane.add(comboBox_1_1_2);
		
		//JComboBox comboBox_1_1_3 = new JComboBox();
		comboBox_1_1_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1_3.setBounds(341, 179, 141, 27);
		contentPane.add(comboBox_1_1_3);
		
		//JComboBox comboBox_1_1_4 = new JComboBox();
		comboBox_1_1_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1_4.setBounds(341, 206, 141, 27);
		contentPane.add(comboBox_1_1_4);
		
		//JComboBox comboBox_1_1_5 = new JComboBox();
		comboBox_1_1_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1_5.setBounds(341, 241, 141, 27);
		contentPane.add(comboBox_1_1_5);
		
		//JButton btnNewButton = new JButton("My shopping cart\n\n");
		btnNewButton.setBounds(503, 124, 141, 43);
		contentPane.add(btnNewButton);
		lblNewLabel.setBounds(243, 21, 86, 16);
		
		contentPane.add(lblNewLabel);
		lblNewLabel_1.setBounds(243, 49, 86, 16);
		
		contentPane.add(lblNewLabel_1);
		lblNewLabel_2.setBounds(243, 78, 86, 16);
		
		contentPane.add(lblNewLabel_2);
		lblNewLabel_3.setBounds(243, 113, 86, 16);
		
		contentPane.add(lblNewLabel_3);
		lblNewLabel_4.setBounds(243, 148, 86, 16);
		
		contentPane.add(lblNewLabel_4);
		lblNewLabel_5.setBounds(243, 183, 86, 16);
		
		contentPane.add(lblNewLabel_5);
		lblNewLabel_6.setBounds(243, 210, 86, 16);
		
		contentPane.add(lblNewLabel_6);
		lblNewLabel_7.setBounds(243, 245, 86, 16);
		
		contentPane.add(lblNewLabel_7);
		
		 rdbtnNewRadioButton.addMouseListener(this);
		 rdbtnBrownBread.addMouseListener(this);
		 rdbtnNewRadioButton_1_1.addMouseListener(this);
		 rdbtnNewRadioButton_1_1_1 .addMouseListener(this);
		 rdbtnNewRadioButton_1_1_1_1 .addMouseListener(this);
	     rdbtnNewRadioButton_1_1_1_1_1 .addMouseListener(this);
		 rdbtnNewRadioButton_1_1_1_1_1_1 .addMouseListener(this);
		 rdbtnNewRadioButton_1_1_1_1_1_2 .addMouseListener(this);
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
				s1=Integer.parseInt((String)comboBox.getSelectedItem())*3;
				h1=shoppingCart.add(" White Bread " , Integer.parseInt((String)comboBox.getSelectedItem())) + ( s1 + " TL ," );
					}
			else 
				h1="";
			boolean temp2= buy(rdbtnBrownBread.isSelected() ? true : false);
			if(temp2==true)
			{
				s2=Integer.parseInt((String)comboBox_1.getSelectedItem())*4;
				h2=shoppingCart.add(" Brown Bread " , Integer.parseInt((String)comboBox_1.getSelectedItem()))+ ( s2 + " TL ," );
			}
			else 
				h2="";
			boolean temp3= buy(rdbtnNewRadioButton_1_1.isSelected() ? true : false);
			if(temp3==true)
			{
				s3=Integer.parseInt((String)comboBox_1_1.getSelectedItem())*10;
				h3=shoppingCart.add(" Baguette "  , Integer.parseInt((String)comboBox_1_1.getSelectedItem()))+ ( s3 + " TL ," );
			}
			else 
				h3="";
			boolean temp4= buy(rdbtnNewRadioButton_1_1_1.isSelected() ? true : false);
			if(temp4==true)
			{
				s4=Integer.parseInt((String)comboBox_1_1_1.getSelectedItem())*19;
				h4=shoppingCart.add(" Uno Grain Pan Bread 550g " , Integer.parseInt((String)comboBox_1_1_1.getSelectedItem()))+ ( s4 + " TL ," );
			}
			else 
				h4="";
			boolean temp5= buy(rdbtnNewRadioButton_1_1_1_1.isSelected() ? true : false);
			if(temp5==true)
			{
				s5=Integer.parseInt((String)comboBox_1_1_2.getSelectedItem())*23;
				h5=shoppingCart.add(" Uno  Tandır Lavash 8 ct " , Integer.parseInt((String)comboBox_1_1_2.getSelectedItem()))+ ( s5 + " TL ," );
			}
			else 
				h5="";
			boolean temp6= buy(rdbtnNewRadioButton_1_1_1_1_1.isSelected() ? true : false);
			if(temp6==true)
			{
				s6=Integer.parseInt((String)comboBox_1_1_3.getSelectedItem())*12;
				h6=shoppingCart.add(" Simit  Sandwich 185g " , Integer.parseInt((String)comboBox_1_1_3.getSelectedItem()))+ ( s6 + " TL ," );
			}
			else 
				h6="";
			boolean temp7= buy(rdbtnNewRadioButton_1_1_1_1_1_1.isSelected() ? true : false);
			if(temp7==true)
			{
				s7=Integer.parseInt((String)comboBox_1_1_4.getSelectedItem())*15;
				h7=shoppingCart.add(" Chocolate Chip Cookies 110g "  , Integer.parseInt((String)comboBox_1_1_4.getSelectedItem()))+ ( s7 + " TL ," );
			}
			else 
				h7="";
			boolean temp8= buy(rdbtnNewRadioButton_1_1_1_1_1_2.isSelected() ? true : false);
			if(temp8==true)
			{
				s8=Integer.parseInt((String)comboBox_1_1_5.getSelectedItem())*12;
				h8=shoppingCart.add(" Basil Flavored Grissini 150g " , Integer.parseInt((String)comboBox_1_1_5.getSelectedItem()))+ ( s8 + " TL ," );
			}
			else 
				h8="";
			
			
			temp=(String)(h1 + h2 + h3 + h4 + h5 + h6 + h7 + h8);
		    tempz=(int)(s1+s2+s3+s4+s5+s6+s7+s8);
			 
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