import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CheckOut {


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
	private JFrame frame;
	private JTextField invoiceTextField;
	private JTextField customerTextField;
	private JTextField idTextField;
	private JTextField itemTextField;
	private JTextField quantityTextField;
	private JTextField recievedTextField;
	private JRadioButton yesMemberRadioButton;
	private JRadioButton noMemberRadioButton;
	private GridBagConstraints gbc;
	public CheckOut() {
frame=new JFrame();
		
        headerLabel=new JLabel("Check Out");
		invoiceLabel=new JLabel("Invoice#:");
		//use random number to set invoice number
		invoiceTextField= new JTextField(50);
		dateLabel=new JLabel("Billing Date");
		cashierLabel=new JLabel("Cashier");
		customerLabel=new JLabel("Customer");
		customerTextField= new JTextField(50);
		idLabel=new JLabel("Customer ID");
		idTextField= new JTextField(20); 
		itemLabel=new JLabel("Item");
		itemTextField= new JTextField(50);
		quantityLabel=new JLabel("Quantity of Item");
		quantityTextField= new JTextField(50);
		memberLabel=new JLabel("Member");
		yesMemberRadioButton=new JRadioButton("Yes");
		yesMemberRadioButton.setBounds(100,50,100,30);
		noMemberRadioButton=new JRadioButton("No");
		noMemberRadioButton.setBounds(100,100,100,30);
		discountLabel=new JLabel("Discount");
		
		taxLabel=new JLabel("Tax");
		
		 totalLabel=new JLabel("Total");
		
		 recievedLabel=new JLabel("Amount Recieved:");
		 recievedTextField=new JTextField();
		 changeLabel=new JLabel("Change");
		layout();
		
	
	}
	public void layout() {
frame.setLayout(new GridBagLayout());
		
		gbc=new GridBagConstraints();
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTH;
		frame.add(headerLabel,gbc);
		gbc=new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(invoiceLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(dateLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(cashierLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(customerLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1; 
		gbc.ipadx = 150;
		gbc.ipady = 5;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(customerTextField,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 4;
		gbc.gridy = 3;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(idLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 5;
		gbc.gridy = 3;
		gbc.gridwidth = 1; 
		gbc.ipadx = 150;
		gbc.ipady = 5;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(idTextField,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(itemLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1; 
		gbc.ipadx = 150;
		gbc.ipady = 5;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(itemTextField,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 4;
		gbc.gridy = 4;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(quantityLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 5;
		gbc.gridy = 4;
		gbc.gridwidth = 1; 
		gbc.ipadx = 150;
		gbc.ipady = 5;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(quantityTextField,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(memberLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 1; 
        frame.add(yesMemberRadioButton,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridwidth = 1; 
        frame.add(noMemberRadioButton,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(discountLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(taxLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 4;
		gbc.gridy = 6;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(totalLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(recievedLabel,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.gridwidth = 1; 
		gbc.ipadx = 150;
		gbc.ipady = 5;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(recievedTextField,gbc);
        gbc=new GridBagConstraints();
		gbc.gridx = 4;
		gbc.gridy = 7;
		gbc.gridwidth = 1; 
		gbc.ipadx = 50;
		gbc.ipady = 20;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        frame.add(changeLabel,gbc);
       
		frame.setSize(new Dimension(800,500));
		frame.setVisible(true);
		frame.setResizable(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new CheckOut();
	}
}
