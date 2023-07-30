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

public class ReadyToEat extends JFrame implements MouseListener {

	private JPanel contentPane;
	 LinkedList shoppingCart = new LinkedList();
	
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Cheese Ham Sandwich 160g");
	JRadioButton rdbtnDardanelPastaTuna = new JRadioButton("Dardanel Pasta Tuna 185g");
	JRadioButton rdbtnDrOetkerPizza = new JRadioButton("Dr. Oetker Pizza 4 x 150 g");
	JRadioButton rdbtnVeggyVeganMeatballs = new JRadioButton("Veggy Vegan Meatballs 300g");
	JRadioButton rdbtnGourmanjeRussianSalad = new JRadioButton("Gourmanje Russian Salad 200g");
	JRadioButton rdbtnDardanelPouchSalmon = new JRadioButton("Dardanel Pouch Salmon 85g");
	JRadioButton rdbtnCheddarSalamiSandwich = new JRadioButton("Cheddar Salami Sandwich 165g");
	JRadioButton rdbtnSuperfreshCrispyBalls = new JRadioButton("Superfresh Crispy Balls 360g");
	
	JComboBox comboBox = new JComboBox();
	JComboBox comboBox_1 = new JComboBox();
	JComboBox comboBox_2 = new JComboBox();
	JComboBox comboBox_3 = new JComboBox();
	JComboBox comboBox_4 = new JComboBox();
	JComboBox comboBox_5 = new JComboBox();
	JComboBox comboBox_6 = new JComboBox();
	JComboBox comboBox_7 = new JComboBox();
	
	
	 JButton btnNewButton = new JButton("Checkout");
	 static String h1,h2,h3,h4,h5,h6,h7,h8,temp;
	 static int s1,s2,s3,s4,s5,s6,s7,s8,tempz;
	 ShoppingChart itemsListInstance = new ShoppingChart();
	 private final JLabel lblNewLabel = new JLabel("1 pc= 34 TL");
	 private final JLabel lblPc = new JLabel("1 pc= 31 TL");
	 private final JLabel lblPc_2 = new JLabel("1 pc= 65 TL");
	 private final JLabel lblPc_2_1 = new JLabel("1 pc= 42 TL");
	 private final JLabel lblPc_2_1_1 = new JLabel("1 pc= 68 TL");
	 private final JLabel lblPc_2_1_1_1 = new JLabel("1 pc= 39 TL");
	 private final JLabel lblPc_2_1_1_1_1 = new JLabel("1 pc= 50 TL");
	 private final JLabel lblPc_2_1_1_1_1_1 = new JLabel("1 pc= 36 TL");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReadyToEat frame = new ReadyToEat();
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
	public ReadyToEat() {
		setTitle("ReadyToEat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//	JRadioButton rdbtnNewRadioButton = new JRadioButton("Cheese Ham Sandwich 160g");
		rdbtnNewRadioButton.setBounds(6, 25, 239, 23);
		contentPane.add(rdbtnNewRadioButton);
		
	//	JRadioButton rdbtnDardanelPastaTuna = new JRadioButton("Dardanel Pasta Tuna 185g");
		rdbtnDardanelPastaTuna.setBounds(6, 85, 239, 23);
		contentPane.add(rdbtnDardanelPastaTuna);
		
	//	JRadioButton rdbtnDrOetkerPizza = new JRadioButton("Dr. Oetker Pizza 4 x 150 g");
		rdbtnDrOetkerPizza.setBounds(6, 145, 239, 23);
		contentPane.add(rdbtnDrOetkerPizza);
		
	//	JRadioButton rdbtnVeggyVeganMeatballs = new JRadioButton("Veggy Vegan Meatballs 300g");
		rdbtnVeggyVeganMeatballs.setBounds(6, 205, 239, 23);
		contentPane.add(rdbtnVeggyVeganMeatballs);
		
	//	JRadioButton rdbtnGourmanjeRussianSalad = new JRadioButton("Gourmanje Russian Salad 200g");
		rdbtnGourmanjeRussianSalad.setBounds(6, 235, 251, 23);
		contentPane.add(rdbtnGourmanjeRussianSalad);
		
	//	JRadioButton rdbtnDardanelPouchSalmon = new JRadioButton("Dardanel Pouch Salmon 85g");
		rdbtnDardanelPouchSalmon.setBounds(6, 115, 239, 23);
		contentPane.add(rdbtnDardanelPouchSalmon);
		
	//	JRadioButton rdbtnCheddarSalamiSandwich = new JRadioButton("Cheddar Salami Sandwich 165g");
		rdbtnCheddarSalamiSandwich.setBounds(6, 55, 251, 23);
		contentPane.add(rdbtnCheddarSalamiSandwich);
		
	//	JRadioButton rdbtnSuperfreshCrispyBalls = new JRadioButton("Superfresh Crispy Balls 360g");
		rdbtnSuperfreshCrispyBalls.setBounds(6, 175, 239, 23);
		contentPane.add(rdbtnSuperfreshCrispyBalls);
		
	//	JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(369, 25, 161, 27);
		contentPane.add(comboBox);
		
	//	JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1.setBounds(369, 55, 161, 27);
		contentPane.add(comboBox_1);
		
	//	JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_2.setBounds(369, 85, 161, 27);
		contentPane.add(comboBox_2);
		
	//	JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_3.setBounds(369, 115, 161, 27);
		contentPane.add(comboBox_3);
		
	//	JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_4.setBounds(369, 145, 161, 27);
		contentPane.add(comboBox_4);
		
	//	JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_5.setBounds(369, 175, 161, 27);
		contentPane.add(comboBox_5);
		
	//	JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_6.setBounds(369, 205, 161, 27);
		contentPane.add(comboBox_6);
		
	//	JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_7.setBounds(369, 235, 161, 27);
		contentPane.add(comboBox_7);
		
	//	JButton btnNewButton = new JButton("Checkout");
		btnNewButton.setBounds(522, 125, 117, 29);
		contentPane.add(btnNewButton);
		lblNewLabel.setBounds(257, 29, 93, 16);
		
		contentPane.add(lblNewLabel);
		lblPc.setBounds(257, 59, 93, 16);
		
		contentPane.add(lblPc);
		lblPc_2.setBounds(257, 89, 93, 16);
		
		contentPane.add(lblPc_2);
		lblPc_2_1.setBounds(257, 119, 93, 16);
		
		contentPane.add(lblPc_2_1);
		lblPc_2_1_1.setBounds(257, 149, 93, 16);
		
		contentPane.add(lblPc_2_1_1);
		lblPc_2_1_1_1.setBounds(257, 179, 93, 16);
		
		contentPane.add(lblPc_2_1_1_1);
		lblPc_2_1_1_1_1.setBounds(257, 209, 93, 16);
		
		contentPane.add(lblPc_2_1_1_1_1);
		lblPc_2_1_1_1_1_1.setBounds(257, 239, 93, 16);
		
		contentPane.add(lblPc_2_1_1_1_1_1);
		
		
		
		 rdbtnNewRadioButton.addMouseListener(this);
		 rdbtnDardanelPastaTuna.addMouseListener(this);
		 rdbtnDrOetkerPizza.addMouseListener(this);
		 rdbtnVeggyVeganMeatballs .addMouseListener(this);
		 rdbtnGourmanjeRussianSalad .addMouseListener(this);
		 rdbtnDardanelPouchSalmon .addMouseListener(this);
		 rdbtnCheddarSalamiSandwich .addMouseListener(this);
		 rdbtnSuperfreshCrispyBalls .addMouseListener(this);
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

	if (e.getSource() == btnNewButton) 
	{
		
	
	boolean temp1= buy(rdbtnNewRadioButton.isSelected() ? true : false);
	if(temp1==true)
			{
		s1=Integer.parseInt((String)comboBox.getSelectedItem())*34;
		h1=shoppingCart.add(" Cheese Ham Sandwich 160g "  , Integer.parseInt((String)comboBox.getSelectedItem()))+ ( s1 + " TL ," );
			}
	else 
		h1="";
	boolean temp2= buy(rdbtnDardanelPastaTuna.isSelected() ? true : false);
	if(temp2==true)
	{
		s2=Integer.parseInt((String)comboBox.getSelectedItem())*65;
		h2=shoppingCart.add(" Dardanel Pasta Tuna 185g "  , Integer.parseInt((String)comboBox_1.getSelectedItem()))+ ( s2 + " TL ," );
	}
	else 
		h2="";
	boolean temp3= buy(rdbtnDrOetkerPizza.isSelected() ? true : false);
	if(temp3==true)
	{
		s3=Integer.parseInt((String)comboBox.getSelectedItem())*68;
		h3=shoppingCart.add(" Dr. Oetker Pizza 4 x 150 g "  , Integer.parseInt((String)comboBox_2.getSelectedItem()))+ ( s3 + " TL ," );
	}
	else 
		h3="";
	boolean temp4= buy(rdbtnVeggyVeganMeatballs.isSelected() ? true : false);
	if(temp4==true)
	{
		s4=Integer.parseInt((String)comboBox.getSelectedItem())*50;
		h4=shoppingCart.add(" Veggy Vegan Meatballs 300g "   , Integer.parseInt((String)comboBox_3.getSelectedItem()))+ ( s4 + " TL ," );
	}
	else 
		h4="";
	boolean temp5= buy(rdbtnGourmanjeRussianSalad.isSelected() ? true : false);
	if(temp5==true)
	{
		s5=Integer.parseInt((String)comboBox.getSelectedItem())*36;
		h5=shoppingCart.add(" Gourmanje Russian Salad 200g " , Integer.parseInt((String)comboBox_4.getSelectedItem()))+ ( s5 + " TL ," );
	}
	else 
		h5=" ";
	boolean temp6= buy(rdbtnDardanelPouchSalmon.isSelected() ? true : false);
	if(temp6==true)
	{
		s6=Integer.parseInt((String)comboBox.getSelectedItem())*42;
		h6=shoppingCart.add(" Dardanel Pouch Salmon 85g "  , Integer.parseInt((String)comboBox_5.getSelectedItem()))+ ( s6 + " TL ," );
	}
	else 
		h6=" ";
	boolean temp7= buy(rdbtnCheddarSalamiSandwich.isSelected() ? true : false);
	if(temp7==true)
	{
		s7=Integer.parseInt((String)comboBox.getSelectedItem())*31;
		h7=shoppingCart.add(" Cheddar Salami Sandwich 165g "  , Integer.parseInt((String)comboBox_6.getSelectedItem()))+ ( s7 + " TL ," );
	}
	else 
		h7=" ";
	boolean temp8= buy(rdbtnSuperfreshCrispyBalls.isSelected() ? true : false);
	if(temp8==true)
	{
		s8=Integer.parseInt((String)comboBox.getSelectedItem())*39;
		h8=shoppingCart.add(" Superfresh Crispy Balls 360g "  , Integer.parseInt((String)comboBox_7.getSelectedItem()))+ ( s8 + " TL ," );
	}
	
	else 
		h8=" ";
	
	 temp=(String)(h1 + h2 + h3  + h4 + h5 + h6 + h7 + h8);
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