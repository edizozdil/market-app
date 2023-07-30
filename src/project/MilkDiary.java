package project;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class MilkDiary extends JFrame implements MouseListener {

	private JPanel contentPane;
	
	JComboBox comboBox = new JComboBox();
	JComboBox comboBox_1 = new JComboBox();
	JComboBox comboBox_1_1 = new JComboBox();
	JComboBox comboBox_1_1_1 = new JComboBox();
	JComboBox comboBox_2 = new JComboBox();
	JComboBox comboBox_2_1 = new JComboBox();
	JComboBox comboBox_2_1_1 = new JComboBox();
	JComboBox comboBox_3 = new JComboBox();
	JRadioButton rdbtnNewRadioButton = new JRadioButton(" Milk 1L");
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Milk 6x200 ml");
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Lactose- Free Milk 1L");
	JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Strained Cheese");
	JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Kashar Cheese");
	JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Cheddar Cheese");
	JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Pan Yogurt");
	JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Butter");
	JButton btnNewButton = new JButton("Checkout\n\n");
	static String h1,h2,h3,h4,h5,h6,h7,h8,temp;
	static int s1,s2,s3,s4,s5,s6,s7,s8,tempz;
	ShoppingChart itemsListInstance = new ShoppingChart();
	LinkedList shoppingCart = new LinkedList();
	private final JLabel lblNewLabel = new JLabel("1L = 12 TL");
	private final JLabel lblPc = new JLabel("1 pc = 29 TL");
	private final JLabel lbll = new JLabel("1L = 15 TL");
	private final JLabel lblKg = new JLabel("0.5 kg = 45 TL");
	private final JLabel lblNewLabel_1 = new JLabel("0.5 kg = 55 TL");
	private final JLabel lblNewLabel_1_1 = new JLabel("0.5 kg = 60 TL");
	private final JLabel lblNewLabel_1_2 = new JLabel("0.5 kg = 45 TL");
	private final JLabel lblNewLabel_1_2_1 = new JLabel("0.25 kg = 48 TL");

	 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MilkDiary frame = new MilkDiary();
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
	public MilkDiary() {
		setTitle("Milk&Diary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(311, 15, 102, 21);
		contentPane.add(comboBox);
		
		//JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(311, 42, 102, 21);
		contentPane.add(comboBox_1);
		
		//JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1.setToolTipText("");
		comboBox_1_1.setBounds(311, 70, 102, 21);
		contentPane.add(comboBox_1_1);
		
		//JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"0.5 kg", "1 .0 kg", "1.5  kg", "2 .0 kg"}));
		comboBox_1_1_1.setToolTipText("");
		comboBox_1_1_1.setBounds(311, 100, 102, 21);
		contentPane.add(comboBox_1_1_1);
		
		//JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0.5 kg", "1 .0 kg", "1.5  kg", "2 .0 kg"}));
		comboBox_2.setBounds(311, 125, 102, 27);
		contentPane.add(comboBox_2);
		
		//JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"0.5 kg", "1 .0 kg", "1.5  kg", "2 .0 kg"}));
		comboBox_2_1.setBounds(311, 158, 102, 27);
		contentPane.add(comboBox_2_1);
		
		//JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setModel(new DefaultComboBoxModel(new String[] {"0.5 kg", "1 .0 kg", "1.5  kg", "2 .0 kg"}));
		comboBox_2_1_1.setBounds(311, 193, 102, 27);
		contentPane.add(comboBox_2_1_1);
		
		//JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0.25 kg", "0.50 kg", "0.75 kg", "1 .00kg"}));
		comboBox_3.setBounds(311, 231, 102, 27);
		contentPane.add(comboBox_3);
		
	//	JRadioButton rdbtnNewRadioButton = new JRadioButton(" Milk 1L");
		rdbtnNewRadioButton.setBounds(6, 12, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
	//	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Milk 6x200 ml");
		rdbtnNewRadioButton_1.setBounds(6, 39, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
	//	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Lactose- Free Milk 1L");
		rdbtnNewRadioButton_2.setBounds(6, 67, 168, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
	//	JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Strained Cheese");
		rdbtnNewRadioButton_3.setBounds(6, 97, 141, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
	//	JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Kashar Cheese");
		rdbtnNewRadioButton_4.setBounds(6, 125, 141, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
	//	JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Cheddar Cheese");
		rdbtnNewRadioButton_5.setBounds(7, 158, 141, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
	//	JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Pan Yogurt");
		rdbtnNewRadioButton_6.setBounds(6, 193, 141, 23);
		contentPane.add(rdbtnNewRadioButton_6);
		
	//	JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Butter");
		rdbtnNewRadioButton_7.setBounds(6, 231, 141, 23);
		contentPane.add(rdbtnNewRadioButton_7);
		
	//	JButton btnNewButton = new JButton("My shopping cart");
		btnNewButton.setBounds(402, 122, 153, 29);
		contentPane.add(btnNewButton);
		lblNewLabel.setBounds(197, 16, 102, 16);
		
		contentPane.add(lblNewLabel);
		lblPc.setBounds(197, 43, 102, 16);
		
		contentPane.add(lblPc);
		lbll.setBounds(197, 71, 102, 16);
		
		contentPane.add(lbll);
		lblKg.setBounds(197, 98, 102, 16);
		
		contentPane.add(lblKg);
		lblNewLabel_1.setBounds(197, 162, 102, 16);
		
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1_1.setBounds(197, 129, 102, 16);
		
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_2.setBounds(197, 197, 102, 16);
		
		contentPane.add(lblNewLabel_1_2);
		lblNewLabel_1_2_1.setBounds(197, 235, 102, 16);
		
		contentPane.add(lblNewLabel_1_2_1);
		 rdbtnNewRadioButton.addMouseListener(this);
		 rdbtnNewRadioButton_1.addMouseListener(this);
		 rdbtnNewRadioButton_2.addMouseListener(this);
		 rdbtnNewRadioButton_3 .addMouseListener(this);
		 rdbtnNewRadioButton_4 .addMouseListener(this);
	     rdbtnNewRadioButton_5 .addMouseListener(this);
		 rdbtnNewRadioButton_6 .addMouseListener(this);
		 rdbtnNewRadioButton_7 .addMouseListener(this);
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
					s1=12;
				else if(comboBox.getSelectedIndex()==1)
					s1=24;
				else if(comboBox.getSelectedIndex()==2)
					s1=36;
				else if(comboBox.getSelectedIndex()==3)
					s1=48;
				h1=shoppingCart.add2(" Milk 1L "  , (String)(comboBox.getSelectedItem().toString()))+ ( s1 + " TL , " );
					}
			else 
				h1="";
			boolean temp2= buy(rdbtnNewRadioButton_1.isSelected() ? true : false);
			if(temp2==true)
			{
				if(comboBox_1.getSelectedIndex()==0)
					s2=29;
				else if(comboBox_1.getSelectedIndex()==1)
					s2=58;
				else if(comboBox_1.getSelectedIndex()==2)
					s2=87;
				else if(comboBox_1.getSelectedIndex()==3)
					s2=116;
				
				h2=shoppingCart.add2(" Milk 6x200 ml "  , (String)(comboBox_1.getSelectedItem().toString()))+ ( s2 + " TL , " );
			}
			
			else 
				h2="";
			boolean temp3= buy(rdbtnNewRadioButton_2.isSelected() ? true : false);
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
				
				h3=shoppingCart.add2("Lactose- Free Milk 1L"  , (String)(comboBox_1_1.getSelectedItem().toString()))+ ( s3 + " TL , " );
			}
			
			else 
				h3="";
			
			boolean temp4= buy(rdbtnNewRadioButton_3.isSelected() ? true : false);
			if(temp4==true)
			{
				if(comboBox_1_1_1.getSelectedIndex()==0)
					s4=45;
				else if(comboBox_1_1_1.getSelectedIndex()==1)
					s4=90;
				else if(comboBox_1_1_1.getSelectedIndex()==2)
					s4=135;
				else if(comboBox_1_1_1.getSelectedIndex()==3)
					s4=180;
				
				h4=shoppingCart.add2(" Strained Cheese " , (String)(comboBox.getSelectedItem().toString()))+ ( s4 + " TL , " );
			}
			else 
				h4="";
			
	
			boolean temp5= buy(rdbtnNewRadioButton_4.isSelected() ? true : false);
			if(temp5==true)
			{
				if(comboBox_2.getSelectedIndex()==0)
					s5=60;
				else if(comboBox_2.getSelectedIndex()==1)
					s5=120;
				else if(comboBox_2.getSelectedIndex()==2)
					s5=180;
				else if(comboBox_2.getSelectedIndex()==3)
					s5=240;
				
				h5=shoppingCart.add2(" Kashar Cheese " , (String)(comboBox_2.getSelectedItem().toString()))+ ( s5 + " TL , " );
			}
			else 
				h5="";
			
		
			boolean temp6= buy(rdbtnNewRadioButton_5.isSelected() ? true : false);
			if(temp6==true)
			{
				if(comboBox_2_1.getSelectedIndex()==0)
					s6=55;
				else if(comboBox_2_1.getSelectedIndex()==1)
					s6=110;
				else if(comboBox_2_1.getSelectedIndex()==2)
					s6=165;
				else if(comboBox_2_1.getSelectedIndex()==3)
					s6=220;
				
				h6=shoppingCart.add2(" Cheddar Cheese " , (String)(comboBox_2_1.getSelectedItem().toString()))+ ( s6 + " TL , " );
			}
			else 
				h6="";
			
			
			boolean temp7= buy(rdbtnNewRadioButton_6.isSelected() ? true : false);
			if(temp7==true)
			{
				if(comboBox_2_1_1.getSelectedIndex()==0)
					s7=45;
				else if(comboBox_2_1_1.getSelectedIndex()==1)
					s7=90;
				else if(comboBox_2_1_1.getSelectedIndex()==2)
					s7=135;
				else if(comboBox_2_1_1.getSelectedIndex()==3)
					s7=180;
				
				h7=shoppingCart.add2(" Pan Yogurt " , (String)(comboBox_2_1_1.getSelectedItem().toString()))+ ( s7 + " TL , " );
			}
			else 
				h7="";
			
		
			boolean temp8= buy(rdbtnNewRadioButton_7.isSelected() ? true : false);
			if(temp8==true)
			{
				if(comboBox_3.getSelectedIndex()==0)
					s8=48;
				else if(comboBox_3.getSelectedIndex()==1)
					s8=96;
				else if(comboBox_3.getSelectedIndex()==2)
					s8=144;
				else if(comboBox_3.getSelectedIndex()==3)
					s8=192;
				
				h8=shoppingCart.add2(" Butter "   , (String)(comboBox_3.getSelectedItem().toString()))+ ( s8 + " TL , " );
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