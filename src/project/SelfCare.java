package project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class SelfCare extends JFrame implements MouseListener 
{

	private JPanel contentPane;
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Signal White Now 75 ml");
	JRadioButton rdbtnParadontaxFreshness = new JRadioButton("Paradontax Freshness 75 ml");
	JRadioButton rdbtnHeadshouldersClassicClean = new JRadioButton("Head&Shoulders Classic Clean 350 ml");
	JRadioButton rdbtnBiotingCollagenShampoo = new JRadioButton("Biotin& Collagen Shampoo 385 ml");
	JRadioButton rdbtnCoconutScrubShower = new JRadioButton("Coconut Scrub Shower Gel 250 ml");
	JRadioButton rdbtnDuruShowerSoap = new JRadioButton("Duru Shower Soap 8 x 70 g");
	JRadioButton rdbtnAntibacterialLiquidSoap = new JRadioButton("Antibacterial Liquid Soap 300 ml");
	JRadioButton rdbtnBalmDeodarantSpray = new JRadioButton("Balm Deodarant Spray 150 ml");
	
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
	LinkedList shoppingCart = new LinkedList();
	private final JLabel lblNewLabel = new JLabel("1 pc = 30 TL");
	private final JLabel lblPc = new JLabel("1 pc = 35 TL");
	private final JLabel lblPc_1 = new JLabel("1 pc = 40 TL");
	private final JLabel lblPc_2 = new JLabel("1 pc = 90 TL");
	private final JLabel lblPc_3 = new JLabel("1 pc = 40 TL");
	private final JLabel lblNewLabel_5 = new JLabel("1 pc = 30 TL");
	private final JLabel lblPc_4 = new JLabel("1 pc = 19 TL");
	private final JLabel lblPc_5 = new JLabel("1 pc = 24 TL");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelfCare frame = new SelfCare();
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
	public SelfCare() {
		setTitle("Self Care");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//	JRadioButton rdbtnNewRadioButton = new JRadioButton("Signal White Now 75 ml");
		rdbtnNewRadioButton.setBounds(6, 25, 208, 23);
		contentPane.add(rdbtnNewRadioButton);
		
	//	JRadioButton rdbtnParadontaxFreshness = new JRadioButton("Paradontax Freshness 75 ml");
		rdbtnParadontaxFreshness.setBounds(6, 55, 224, 23);
		contentPane.add(rdbtnParadontaxFreshness);
		
	//	JRadioButton rdbtnHeadshouldersClassicClean = new JRadioButton("Head&Shoulders Classic Clean 350 ml");
		rdbtnHeadshouldersClassicClean.setBounds(6, 80, 282, 23);
		contentPane.add(rdbtnHeadshouldersClassicClean);
		
	//	JRadioButton rdbtnBiotingCollagenShampoo = new JRadioButton("Bioting& Collagen Shampoo 385 ml");
		rdbtnBiotingCollagenShampoo.setBounds(6, 105, 282, 23);
		contentPane.add(rdbtnBiotingCollagenShampoo);
		
	//	JRadioButton rdbtnCoconutScrubShower = new JRadioButton("Coconut Scrub Shower Gel 250 ml");
		rdbtnCoconutScrubShower.setBounds(6, 130, 282, 23);
		contentPane.add(rdbtnCoconutScrubShower);
		
	//	JRadioButton rdbtnDuruShowerSoap = new JRadioButton("Duru Shower Soap 8 x 70 g");
		rdbtnDuruShowerSoap.setBounds(6, 155, 268, 23);
		contentPane.add(rdbtnDuruShowerSoap);
		
	//	JRadioButton rdbtnAntibacterialLiquidSoap = new JRadioButton("Antibacterial Liquid Soap 300 ml");
		rdbtnAntibacterialLiquidSoap.setBounds(6, 180, 282, 23);
		contentPane.add(rdbtnAntibacterialLiquidSoap);
		
	//	JRadioButton rdbtnBalmDeodarantSpray = new JRadioButton("Balm Deodarant Spray 150 ml");
		rdbtnBalmDeodarantSpray.setBounds(6, 205, 268, 23);
		contentPane.add(rdbtnBalmDeodarantSpray);
		
	//	JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(404, 25, 123, 27);
		contentPane.add(comboBox);
		
	//	JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1.setBounds(404, 55, 123, 27);
		contentPane.add(comboBox_1);
		
	//	JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_2.setBounds(404, 80, 123, 27);
		contentPane.add(comboBox_2);
		
	//	JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_3.setBounds(404, 105, 123, 27);
		contentPane.add(comboBox_3);
		
	//	JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_4.setBounds(404, 130, 123, 27);
		contentPane.add(comboBox_4);
		
	//	JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_5.setBounds(404, 155, 123, 27);
		contentPane.add(comboBox_5);
		
	//	JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_6.setBounds(404, 180, 123, 27);
		contentPane.add(comboBox_6);
		
	//	JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_7.setBounds(404, 205, 123, 27);
		contentPane.add(comboBox_7);
		
	//	JButton btnNewButton = new JButton("Checkout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(547, 104, 117, 29);
		contentPane.add(btnNewButton);
		lblNewLabel.setBounds(281, 29, 111, 16);
		
		contentPane.add(lblNewLabel);
		lblPc.setBounds(281, 52, 111, 16);
		
		contentPane.add(lblPc);
		lblPc_1.setBounds(281, 84, 111, 16);
		
		contentPane.add(lblPc_1);
		lblPc_2.setBounds(281, 109, 111, 16);
		
		contentPane.add(lblPc_2);
		lblPc_3.setBounds(281, 134, 111, 16);
		
		contentPane.add(lblPc_3);
		lblNewLabel_5.setBounds(281, 159, 111, 16);
		
		contentPane.add(lblNewLabel_5);
		lblPc_4.setBounds(281, 184, 111, 16);
		
		contentPane.add(lblPc_4);
		lblPc_5.setBounds(281, 209, 111, 16);
		
		contentPane.add(lblPc_5);
		
		 rdbtnNewRadioButton.addMouseListener(this);
		 rdbtnParadontaxFreshness.addMouseListener(this);
		 rdbtnHeadshouldersClassicClean.addMouseListener(this);
		 rdbtnBiotingCollagenShampoo .addMouseListener(this);
		 rdbtnCoconutScrubShower .addMouseListener(this);
		 rdbtnDuruShowerSoap .addMouseListener(this);
	     rdbtnAntibacterialLiquidSoap .addMouseListener(this);
		 rdbtnBalmDeodarantSpray .addMouseListener(this);
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
				s1=Integer.parseInt((String)comboBox.getSelectedItem())*30;
				h1=shoppingCart.add(" Signal White Now 75 ml "  , Integer.parseInt((String)comboBox.getSelectedItem()))+ ( s1 + " TL ," );
					}
			else 
				h1="";
			boolean temp2= buy(rdbtnParadontaxFreshness.isSelected() ? true : false);
			if(temp2==true)
			{
				s2=Integer.parseInt((String)comboBox_1.getSelectedItem())*35;
				h2=shoppingCart.add(" Paradontax Freshness 75 ml "  , Integer.parseInt((String)comboBox_1.getSelectedItem()))+ ( s2 + " TL ," );
			}
			else 
				h2="";
			boolean temp3= buy(rdbtnHeadshouldersClassicClean.isSelected() ? true : false);
			if(temp3==true)
			{
				s3=Integer.parseInt((String)comboBox_2.getSelectedItem())*40;
				h3=shoppingCart.add( " Head&Shoulders Classic Clean 350 ml "  , Integer.parseInt((String)comboBox_2.getSelectedItem()))+ ( s3 + " TL ," );
			}
			else 
				h3="";
			boolean temp4= buy(rdbtnBiotingCollagenShampoo.isSelected() ? true : false);
			if(temp4==true)
			{
				s4=Integer.parseInt((String)comboBox_3.getSelectedItem())*90;
				h4=shoppingCart.add(" Bioting& Collagen Shampoo 385 ml "  , Integer.parseInt((String)comboBox_3.getSelectedItem()))+ ( s4 + " TL ," );
			}
			else 
				h4="";
			boolean temp5= buy(rdbtnCoconutScrubShower.isSelected() ? true : false);
			if(temp5==true)
			{
				s5=Integer.parseInt((String)comboBox_4.getSelectedItem())*40;
				h5=shoppingCart.add(" Coconut Scrub Shower Gel 250 ml " , Integer.parseInt((String)comboBox_4.getSelectedItem()))+ ( s5 + " TL ," );
			}
			else 
				h5="";
			boolean temp6= buy(rdbtnDuruShowerSoap.isSelected() ? true : false);
			if(temp6==true)
			{
				s6=Integer.parseInt((String)comboBox_5.getSelectedItem())*30;
				h6=shoppingCart.add(" Duru Shower Soap 8 x 70 g " , Integer.parseInt((String)comboBox_5.getSelectedItem()))+ ( s6 + " TL ," );
			}
			else 
				h6="";
			boolean temp7= buy(rdbtnAntibacterialLiquidSoap.isSelected() ? true : false);
			if(temp7==true)
			{
				s7=Integer.parseInt((String)comboBox_6.getSelectedItem())*19;
				h7=shoppingCart.add(" Antibacterial Liquid Soap 300 ml " , Integer.parseInt((String)comboBox_6.getSelectedItem()))+ ( s7 + " TL ," );
			}
			else 
				h7="";
			boolean temp8= buy(rdbtnBalmDeodarantSpray.isSelected() ? true : false);
			if(temp8==true)
			{
				h8=shoppingCart.add(" Balm Deodarant Spray 150 ml " , Integer.parseInt((String)comboBox_7.getSelectedItem()))+ ( s8 + " TL ," );
				s8=Integer.parseInt((String)comboBox_7.getSelectedItem())*24;
			}
			else 
				h8="";
			
			 temp=(String)(h1+ h2 + h3 + h4 + h5 + h6 + h7 + h8 );
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