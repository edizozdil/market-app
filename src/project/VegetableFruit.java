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
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VegetableFruit extends JFrame implements MouseListener 
{

	private JPanel contentPane;
	static String h1,h2,h3,h4,h5,h6,h7,temp;
	static int s1,s2,s3,s4,s5,s6,s7,tempz;
	ShoppingChart itemsListInstance = new ShoppingChart();
    LinkedList shoppingCart = new LinkedList();
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Onions");
	JRadioButton rdbtnPotatoes = new JRadioButton("Potatoes");
	JRadioButton rdbtnLettuce = new JRadioButton("Lettuce");
	JRadioButton rdbtnParsley = new JRadioButton("Parsley");
	JRadioButton rdbtnCherry = new JRadioButton("Cherry");
	JRadioButton rdbtnApple = new JRadioButton("Apple");
	JRadioButton rdbtnOrange = new JRadioButton("Orange");
	JComboBox comboBox = new JComboBox();
	JComboBox comboBox_1 = new JComboBox();
	JComboBox comboBox_1_1 = new JComboBox();
	JComboBox comboBox_1_1_1 = new JComboBox();
	JComboBox comboBox_1_1_1_1 = new JComboBox();
	JComboBox comboBox_1_1_1_1_1 = new JComboBox();
	JComboBox comboBox_1_1_1_1_1_1 = new JComboBox();
	
	JButton btnNewButton = new JButton("Checkout");
	private final JLabel lblNewLabel = new JLabel("1 kg= 10 TL");
	private final JLabel lblKg = new JLabel("1 kg= 12 TL");
	private final JLabel lblKg_2 = new JLabel("1 kg= 15 TL");
	private final JLabel lblKg_2_1 = new JLabel("50 g= 8 TL");
	private final JLabel lblKg_2_2 = new JLabel("0.5 kg= 20 TL");
	private final JLabel lblKg_2_3 = new JLabel("1 kg= 8 TL");
	private final JLabel lblKg_2_3_1 = new JLabel("1 kg= 14 TL");
	
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VegetableFruit frame = new VegetableFruit();
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
	public VegetableFruit() {
		setTitle("Fruits & Vegetables");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//	JRadioButton rdbtnNewRadioButton = new JRadioButton("Onions");
		rdbtnNewRadioButton.setBounds(6, 16, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
	//	JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1 kg", "2 kg", "3 kg", "4 kg"}));
		comboBox.setBounds(260, 16, 110, 27);
		contentPane.add(comboBox);
		
	//	JRadioButton rdbtnPotatoes = new JRadioButton("Potatoes");
		rdbtnPotatoes.setBounds(6, 51, 141, 23);
		contentPane.add(rdbtnPotatoes);
		
	//	JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1 kg", "2 kg", "3 kg", "4 kg"}));
		comboBox_1.setBounds(260, 51, 110, 27);
		contentPane.add(comboBox_1);
		
	//	JRadioButton rdbtnLettuce = new JRadioButton("Lettuce");
		rdbtnLettuce.setBounds(6, 86, 141, 23);
		contentPane.add(rdbtnLettuce);
		
	//	JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_1_1.setBounds(260, 86, 110, 27);
		contentPane.add(comboBox_1_1);
		
	//	JRadioButton rdbtnParsley = new JRadioButton("Parsley");
		rdbtnParsley.setBounds(6, 118, 141, 23);
		contentPane.add(rdbtnParsley);
		
	//	JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"50 g", "100 g", "150 g", "200 g"}));
		comboBox_1_1_1.setBounds(260, 118, 110, 27);
		contentPane.add(comboBox_1_1_1);
		
	//	JRadioButton rdbtnCherry = new JRadioButton("Cherry");
		rdbtnCherry.setBounds(6, 153, 141, 23);
		contentPane.add(rdbtnCherry);
		
	//	JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"0.50 kg", "1.00 kg", "1.50 kg", "2.00 kg"}));
		comboBox_1_1_1_1.setBounds(260, 153, 110, 27);
		contentPane.add(comboBox_1_1_1_1);
		
	//	JRadioButton rdbtnApple = new JRadioButton("Apple");
		rdbtnApple.setBounds(6, 194, 141, 23);
		contentPane.add(rdbtnApple);
		
	//	JComboBox comboBox_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"1 kg", "2 kg", "3 kg", "4 kg"}));
		comboBox_1_1_1_1_1.setBounds(260, 194, 110, 27);
		contentPane.add(comboBox_1_1_1_1_1);
		
	//	JRadioButton rdbtnOrange = new JRadioButton("Orange");
		rdbtnOrange.setBounds(6, 230, 141, 23);
		contentPane.add(rdbtnOrange);
		
	//	JComboBox comboBox_1_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"1 kg", "2 kg", "3 kg", "4 kg"}));
		comboBox_1_1_1_1_1_1.setBounds(260, 230, 110, 27);
		contentPane.add(comboBox_1_1_1_1_1_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	//	JButton btnNewButton = new JButton("Checkout");
		btnNewButton.setBounds(384, 117, 117, 29);
		contentPane.add(btnNewButton);
		lblNewLabel.setBounds(129, 20, 102, 16);
		
		contentPane.add(lblNewLabel);
		lblKg.setBounds(129, 55, 102, 16);
		
		contentPane.add(lblKg);
		lblKg_2.setBounds(129, 90, 102, 16);
		
		contentPane.add(lblKg_2);
		lblKg_2_1.setBounds(129, 122, 102, 16);
		
		contentPane.add(lblKg_2_1);
		lblKg_2_2.setBounds(129, 157, 102, 16);
		
		contentPane.add(lblKg_2_2);
		lblKg_2_3.setBounds(129, 198, 102, 16);
		
		contentPane.add(lblKg_2_3);
		lblKg_2_3_1.setBounds(129, 234, 102, 16);
		
		contentPane.add(lblKg_2_3_1);
		
		
		 rdbtnNewRadioButton.addMouseListener(this);
		 rdbtnPotatoes.addMouseListener(this);
		 rdbtnLettuce.addMouseListener(this);
		 rdbtnParsley.addMouseListener(this);
		 rdbtnCherry.addMouseListener(this);
		 rdbtnApple.addMouseListener(this);
		 rdbtnOrange.addMouseListener(this);
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
				if(comboBox.getSelectedIndex()==0)
					s1=10;
				else if(comboBox.getSelectedIndex()==1)
					s1=20;
				else if(comboBox.getSelectedIndex()==2)
					s1=30;
				else if(comboBox.getSelectedIndex()==3)
					s1=40;
				
				h1=shoppingCart.add2(" Onions "  , (String)(comboBox.getSelectedItem().toString()))+ ( s1 + " TL , " );
					}
			else 
				h1=""; 
			boolean temp2= buy(rdbtnPotatoes.isSelected() ? true : false);
			if(temp2==true)
			{
				if(comboBox_1.getSelectedIndex()==0)
					s2=12;
				else if(comboBox_1.getSelectedIndex()==1)
					s2=24;
				else if(comboBox_1.getSelectedIndex()==2)
					s2=36;
				else if(comboBox_1.getSelectedIndex()==3)
					s2=48;
				h2=shoppingCart.add2(" Potatoes "  , (String)(comboBox_1.getSelectedItem().toString()))+ ( s2 + " TL , " );
					}
			else 
				h2="";
			boolean temp3= buy(rdbtnLettuce.isSelected() ? true : false);
			if(temp3==true)
			{
				if(comboBox_1_1.getSelectedIndex()==0)
					s3=15;
				else if(comboBox_1_1.getSelectedIndex()==1)
					s3=30;
				else if(comboBox_1_1.getSelectedIndex()==2)
					s3=45;
				else if(comboBox_1_1.getSelectedIndex()==3)
					s3=60;
				h3=shoppingCart.add2(" Lettuce "  , (String)(comboBox_1_1.getSelectedItem().toString()))+ ( s3 + " TL , " );
					}
			
			else 
				h3="";
			boolean temp4= buy(rdbtnParsley.isSelected() ? true : false);
			if(temp4==true)
			{
				if(comboBox_1_1_1.getSelectedIndex()==0)
					s4=4;
				else if(comboBox_1_1_1.getSelectedIndex()==1)
					s4=8;
				else if(comboBox_1_1_1.getSelectedIndex()==2)
					s4=12;
				else if(comboBox_1_1_1.getSelectedIndex()==3)
					s4=16;
				h4=shoppingCart.add2(" Parsley " , (String)(comboBox_1_1_1.getSelectedItem().toString()))+ ( s4 + " TL , " );
					
			}
			else
				h4="";
			boolean temp5= buy(rdbtnCherry.isSelected() ? true : false);
			if(temp5==true)
			{
				if(comboBox_1_1_1_1.getSelectedIndex()==0)
					s5=20;
				else if(comboBox_1_1_1_1.getSelectedIndex()==1)
					s5=30;
				else if(comboBox_1_1_1_1.getSelectedIndex()==2)
					s5=40;
				else if(comboBox_1_1_1_1.getSelectedIndex()==3)
					s5=50;
				h5=shoppingCart.add2(" Cherry "  , (String)(comboBox_1_1_1_1.getSelectedItem().toString()))+ ( s5 + " TL , " );
			}
			else 
				h5="";
			boolean temp6= buy(rdbtnApple.isSelected() ? true : false);
			if(temp6==true)
			{
				if(comboBox_1_1_1_1_1.getSelectedIndex()==0)
					s6=8;
				else if(comboBox_1_1_1_1_1.getSelectedIndex()==1)
					s6=16;
				else if(comboBox_1_1_1_1_1.getSelectedIndex()==2)
					s6=24;
				else if(comboBox_1_1_1_1_1.getSelectedIndex()==3)
					s6=32;
				h6=shoppingCart.add2(" Apple "   , (String)(comboBox_1_1_1_1_1.getSelectedItem().toString()))+ ( s6 + " TL , " );
			}
			else 
				h6="";
			boolean temp7= buy(rdbtnOrange.isSelected() ? true : false);
			if(temp7==true)
			{
				if(comboBox_1_1_1_1_1_1.getSelectedIndex()==0)
					s7=14;
				else if(comboBox_1_1_1_1_1_1.getSelectedIndex()==1)
					s7=28;
				else if(comboBox_1_1_1_1_1_1.getSelectedIndex()==2)
					s7=42;
				else if(comboBox_1_1_1_1_1_1.getSelectedIndex()==3)
					s7=56;
				h7=shoppingCart.add2(" Orange "   , (String)(comboBox_1_1_1_1_1_1.getSelectedItem().toString()))+ ( s7 + " TL , " );
			}
			else 
				h7="";
			
		
			temp=(String)(h1+ h2 + h3  + h4 + h5 + h6 + h7);
		    tempz=(int)s1+s2+s3+s4+s5+s6+s7;
			 
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