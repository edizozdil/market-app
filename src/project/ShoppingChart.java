package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ShoppingChart extends JFrame implements ListSelectionListener , MouseListener , ActionListener 
{
	LinkedList shoppingCart = new LinkedList();
	
	DefaultListModel<String> dlm = new DefaultListModel<String>();
	JList<String> list = new JList<String>(dlm);
	
	DefaultListModel<String> dlm2 = new DefaultListModel<String>();
	JList<String> list2 = new JList<String>(dlm2);
	
	DefaultComboBoxModel<String> cmbPaymentOptionsModel;
	JComboBox<String> cmbPaymentOptions;
	JLabel p1,p2,p3,p4;
	JTextField t1,t2,t3,t4;
	JButton btnSubmit;
	JPanel jpn= new JPanel(new FlowLayout());
	JPanel jpn2= new JPanel(new FlowLayout());
	
 
	public ShoppingChart()
	{
		super("ORDER MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(1200, 300);
		list.addListSelectionListener(this); 
		add(list);
		
		
		cmbPaymentOptionsModel = new DefaultComboBoxModel<String>();
		cmbPaymentOptionsModel.addElement("Choose one");
		cmbPaymentOptionsModel.addElement("Cash");
		cmbPaymentOptionsModel.addElement("Debit");
		cmbPaymentOptionsModel.addElement("Credit Card");
		cmbPaymentOptions = new JComboBox<String>(cmbPaymentOptionsModel);
		btnSubmit = new JButton("Confirm Order");
		JLabel p1= new JLabel("Card No");
		JLabel p2= new JLabel("Card Owner Name");
		JLabel p3= new JLabel("Exp. Date");
		JLabel p4= new JLabel("CCV");
		JLabel p5= new JLabel();
		JLabel p6= new JLabel();
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		
		jpn2= new JPanel(new GridLayout(4, 2));
		jpn2.add(p1);
		jpn2.add(t1);
		jpn2.add(p2);
		jpn2.add(t2);
		jpn2.add(p3);
		jpn2.add(t3);
		jpn2.add(p4);
		jpn2.add(t4);
		
		
		jpn2.setVisible(false);
		
		jpn.add(list2,BorderLayout.SOUTH);
		jpn.add(cmbPaymentOptions,BorderLayout.SOUTH);
		jpn.add(jpn2,BorderLayout.SOUTH);
		jpn.add(btnSubmit,BorderLayout.SOUTH);
		btnSubmit.setVisible(false);
		add(jpn,BorderLayout.SOUTH);
		
		
		
		btnSubmit.addMouseListener(this);
		cmbPaymentOptions.addActionListener(this);
	
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		JOptionPane.showMessageDialog(null, list.getSelectedValue().toString());
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnSubmit)
		{
			JOptionPane.showMessageDialog(null,"Your order has been received" );
			System.exit(0);
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

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if (arg0.getSource()==cmbPaymentOptions)
		{
			
			if (cmbPaymentOptionsModel.getSelectedItem().toString()== "Cash")
			{
				btnSubmit.setVisible(true);
			    jpn2.setVisible(false);
			}
			 
			else if (cmbPaymentOptionsModel.getSelectedItem().toString()== "Debit")
			{
				jpn2.setVisible(true);
				btnSubmit.setVisible(true);
				
				
			}
			else if (cmbPaymentOptionsModel.getSelectedItem().toString()== "Credit Card")
			{
				btnSubmit.setVisible(true);
			    jpn2.setVisible(true);
			}
			else if (cmbPaymentOptionsModel.getSelectedItem().toString()== "Choose one")
			{
				jpn2.setVisible(false);
				btnSubmit.setVisible(false);
				
				
			}
			
		}
		}
	
	

	}

