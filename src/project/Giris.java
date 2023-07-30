package project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Image;

public class Giris extends JFrame implements MouseListener {

	private JPanel contentPane;
	JButton btnNewButton = new JButton("Milk & Dairy");
	JButton btnNewButton_1 = new JButton("Snacks");
	JButton btnPersonalCare = new JButton("Self Care");
	JButton btnNewButton_2 = new JButton("Vegetable & Fruit");
	JButton btnBakery = new JButton("Bakery");
	JButton btnNewButton_3 = new JButton("Ready to Eat");
	JButton btnNewButton_4 = new JButton("Shopping Cart");
	ShoppingChart itemsListInstance = new ShoppingChart();
	
	
  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giris frame = new Giris();
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
	public Giris() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 377);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//	JButton btnNewButton = new JButton("Milk & Dairy");
		btnNewButton.setBounds(0, 21, 131, 29);
		contentPane.add(btnNewButton);
		
		

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(143, 21, 117, 29);
		contentPane.add(btnNewButton_1);
		
///		JButton btnPersonalCare = new JButton("Self Care");
		btnPersonalCare.setBounds(0, 121, 131, 29);
		contentPane.add(btnPersonalCare);
		
	//	JButton btnBakery = new JButton("Bakery");
		btnBakery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBakery.setBounds(143, 121, 117, 29);
		contentPane.add(btnBakery);
		
		JLabel lblNewLabel = new JLabel("");
		Image img= new ImageIcon (this.getClass().getResource("/selfcare.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(39, 159, 42, 48);
		contentPane.add(lblNewLabel);
		
	//	JButton btnNewButton_2 = new JButton("Vegetable & Fruit");
		
		btnNewButton_2.setBounds(0, 219, 138, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img1 =new ImageIcon (this.getClass().getResource("/snack.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(167, 62, 93, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img2 =new ImageIcon (this.getClass().getResource("/sandwich.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		lblNewLabel_2.setBounds(180, 273, 61, 41);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img3 =new ImageIcon (this.getClass().getResource("/milk.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		lblNewLabel_3.setBounds(39, 62, 48, 48);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img4 =new ImageIcon (this.getClass().getResource("/fruit.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img4));
		lblNewLabel_4.setBounds(45, 260, 42, 64);
		contentPane.add(lblNewLabel_4);
		
//		JButton btnNewButton_3 = new JButton("Ready to Eat");
		
		btnNewButton_3.setBounds(150, 219, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img5 =new ImageIcon (this.getClass().getResource("/bread.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		lblNewLabel_5.setBounds(180, 162, 61, 48);
		contentPane.add(lblNewLabel_5);
		
		// JButton btnNewButton_4 = new JButton("Shopping Chart");
		btnNewButton_4.setBounds(73, 320, 141, 29);
		contentPane.add(btnNewButton_4);
		
		btnNewButton.addMouseListener(this);
		btnNewButton_1.addMouseListener(this);
		btnNewButton_2.addMouseListener(this);
		btnBakery.addMouseListener(this);
		btnPersonalCare.addMouseListener(this);
		btnNewButton_3.addMouseListener(this);
		btnNewButton_4.addMouseListener(this);
		
		
	}
	public void mouseClicked(MouseEvent e) 
	{
		if(e.getSource()==btnNewButton) {
			new MilkDiary().setVisible(true);
		}
		else if(e.getSource()==btnNewButton_1) {
				new Snacks().setVisible(true);
			
		}
		else if(e.getSource()==btnNewButton_2) {
			new VegetableFruit().setVisible(true);
		
	}
		else if(e.getSource()==btnBakery) {
			new Bakery().setVisible(true);
		
	}
		else if(e.getSource()==btnPersonalCare) {
			new SelfCare().setVisible(true);
		
	}
		else if(e.getSource()==btnNewButton_3) {
			new ReadyToEat().setVisible(true);
		
	}
		else if(e.getSource()==btnNewButton_4) 
		{	
			

			itemsListInstance.dlm.addElement(MilkDiary.temp);
			itemsListInstance.dlm.addElement(VegetableFruit.temp);
			itemsListInstance.dlm.addElement(Snacks.temp);
			itemsListInstance.dlm.addElement(Bakery.temp);
			itemsListInstance.dlm.addElement(SelfCare.temp);
			itemsListInstance.dlm.addElement(ReadyToEat.temp);
			
			
			
			
			
			
			itemsListInstance.dlm2.addElement(Integer.toString(SelfCare.tempz+VegetableFruit.tempz+Bakery.tempz+ReadyToEat.tempz+MilkDiary.tempz+Snacks.tempz) + " TL ");
			itemsListInstance.setVisible(true);
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
	