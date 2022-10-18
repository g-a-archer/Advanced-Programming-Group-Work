import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CheckOut  extends JFrame implements ActionListener{


	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel headerPanel;
	private JPanel invoicePanel;
	private JPanel datePanel;
	private JPanel customerPanel;
	private JPanel itemPanel;
	private JPanel memberPanel;
	private JPanel discountPanel;
	private JPanel recievedPanel;
	private JLabel headerLabel;
	private JLabel invoiceLabel;
	private JLabel dateLabel;
	private JLabel cashierLabel;
	private JLabel customerLabel;
	private JLabel idLabel;
	private JLabel itemLabel;
	private JLabel quantityLabel;
	private JLabel memberLabel;
	private JLabel discountLabel;
	private JLabel taxLabel;
	private JLabel totalLabel;
	private JLabel recievedLabel;
	private JLabel changeLabel;
	private JTextField invoiceTextField;
	private JTextField customerTextField;
	private JTextField idTextField;
	private JTextField itemTextField;
	private JTextField quantityTextField;
	private JTextField recievedTextField;
	private JRadioButton yesMemberRadioButton;
	private JRadioButton noMemberRadioButton;
	private Random random;
	private String randomString;
	public CheckOut() {
		frame =new JFrame();
		
	
		headerLabel=new JLabel("Check Out");
		
		headerPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		invoiceLabel=new JLabel("Invoice#:");
		invoiceTextField= new JTextField(50);
		invoicePanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		random=new Random();
		
		invoiceTextField.setText(randomString);
		datePanel= new JPanel(new FlowLayout(FlowLayout.LEFT));
		 dateLabel=new JLabel("Billing Date");
		
		//change header to this then add buttons to header
		//namePanel=new JPanel(new FlowLayout(FlowLayout.CENTER);
		//JLabel nameLabel=new JLabel();
		
		cashierLabel=new JLabel("Cashier");
		
		 customerPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 customerLabel=new JLabel("Customer");
		 customerTextField= new JTextField(50);
		 
		idLabel=new JLabel("Customer ID");
		idTextField= new JTextField(20); 
		
		itemPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 itemLabel=new JLabel("Item");
		itemTextField= new JTextField(50);
		 
		quantityLabel=new JLabel("Quantity of Item");
		quantityTextField= new JTextField(50);
		
		memberPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 memberLabel=new JLabel("Member");
		yesMemberRadioButton=new JRadioButton("Yes");
		yesMemberRadioButton.setBounds(100,50,100,30);
		noMemberRadioButton=new JRadioButton("No");
		noMemberRadioButton.setBounds(100,100,100,30);
		 discountPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 discountLabel=new JLabel("Discount");
		
		taxLabel=new JLabel("Tax");
		
		 totalLabel=new JLabel("Total");
		
		 recievedPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 recievedLabel=new JLabel("Amount Recieved:");
		recievedTextField=new JTextField();
		recievedTextField.setSize(100,50);
		 changeLabel=new JLabel("Change");
		 
		
		frame.setVisible(true);
		layout();
		
	
	}
	public void layout() {
		frame.setLayout(new GridLayout(7,0,0,0));
		
		headerPanel.setSize(new Dimension(100,200));
		headerPanel.add(headerLabel);
		frame.add(headerPanel);
		
		invoicePanel.setSize(new Dimension(100,100));
		invoicePanel.add(invoiceLabel);
		invoicePanel.add(invoiceTextField);
		frame.add(invoicePanel);
		
		datePanel.setSize(new Dimension(100,30));
		datePanel.add(dateLabel);
		datePanel.add(cashierLabel);
		frame.add(datePanel);
	
		customerPanel.setSize(new Dimension(100,30));
		customerPanel.add(customerLabel);
		customerPanel.add(customerTextField);
		customerPanel.add(idLabel);
		customerPanel.add(idTextField);
		frame.add(customerPanel);
		
		itemPanel.setSize(new Dimension(100,30));
		itemPanel.add(itemLabel);
		itemTextField.add(idTextField);
		itemPanel.add(quantityLabel);
		itemPanel.add(quantityTextField);
		frame.add(itemPanel);
		
		memberPanel.setSize(new Dimension(100,30));
		memberPanel.add(memberLabel);
		memberPanel.add(yesMemberRadioButton);
		memberPanel.add(noMemberRadioButton);
		frame.add(memberPanel);
		
		discountPanel.setSize(new Dimension(100,30));
		discountPanel.add(discountLabel);
		discountPanel.add(taxLabel);
		discountPanel.add(totalLabel);
		frame.add(discountPanel);
		
		recievedPanel.setSize(new Dimension(100,30));
		recievedPanel.add(recievedLabel);
		recievedPanel.add(recievedTextField);
		recievedPanel.add(changeLabel);
		frame.add(recievedPanel);
		
		
		frame.setSize(new Dimension(600,800));
		frame.setVisible(true);
		frame.setResizable(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		random.setSeed(1234567890);
		randomString=String.valueOf(random);
		
	}
	public static void main(String[] args) {
		new CheckOut();
	}
}
