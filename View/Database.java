import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Database extends JFrame implements ActionListener {


	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTabbedPane tab;
	private JPanel dashboard;
	private JPanel management;
	private JPanel inventory;
	private JPanel accounting;
	private JTable managementTable;
	private JTable inventoryTable;
	private JTable accountingTable;
	private JLabel navigationLabel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JComboBox<String> combobox;
	private JButton button;
	private JLabel headerLabel;
	private String headings[]= {"Department Code","Name"};
	private int row =35;
	Database(){
		frame= new JFrame();
		dashboard=new JPanel();
		management=new JPanel(new BorderLayout(0,0));
		inventory=new JPanel(new BorderLayout(0,0));
		accounting=new JPanel(new BorderLayout(0,0));
		tab=new JTabbedPane();
		tab.setBounds(500, 500, 700,400);
		//navigationPanel =new JPanel();
		navigationLabel=new JLabel("Navigation:");

		button=new JButton("Logout");
		String navigation[]= {" ","Dashboard","Customer Database","Staff Database","Stock and Inventory","Check Out","Sales Reports","Register Customer"};
		 combobox=new JComboBox<>(navigation);
		combobox.setBounds(100, 50, 150, 20);
		headerLabel=new JLabel("Staff Database");
		panel1=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 panel2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		 panel3=new JPanel(new FlowLayout(FlowLayout.CENTER));
		 panel4=new JPanel(new BorderLayout(0,0));
		 panel5=new JPanel(new BorderLayout(1,0));
		 DefaultTableModel model = new DefaultTableModel(row, headings.length) ;
		 model.setColumnIdentifiers(headings);
		 
		 managementTable=new JTable(model);
		
		 inventoryTable=new JTable(model);
		 accountingTable=new JTable(model);
		layout();
	}
	public void layout() {
		frame.setLayout(new BorderLayout(0,1));
	
		panel1.add(navigationLabel);
		panel1.add(combobox);
		
		panel2.add(button);
		panel4.add(panel1,BorderLayout.WEST);
		panel4.add(panel2,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.PAGE_START);
		panel3.add(headerLabel,BorderLayout.CENTER);
		//frame.add(panel3,BorderLayout.AFTER_LAST_LINE);
		
		//frame.add(navigationPanel);
		tab.add("Dashboard",dashboard);
		 managementTable.getColumnModel().getColumn(0).setPreferredWidth(50);
		 managementTable.getColumnModel().getColumn(1).setPreferredWidth(450);
		management.add(managementTable.getTableHeader(),BorderLayout.PAGE_START);
		management.add(managementTable,BorderLayout.CENTER);
		tab.add("Management",management);
		 inventoryTable.getColumnModel().getColumn(0).setPreferredWidth(50);
		 inventoryTable.getColumnModel().getColumn(1).setPreferredWidth(450);
		inventory.add(inventoryTable.getTableHeader(),BorderLayout.PAGE_START);
		inventory.add(inventoryTable,BorderLayout.CENTER);
		tab.add("Inventory",inventory);
		 accountingTable.getColumnModel().getColumn(0).setPreferredWidth(50);
		 accountingTable.getColumnModel().getColumn(1).setPreferredWidth(450);
		accounting.add(accountingTable.getTableHeader(),BorderLayout.PAGE_START);
		accounting.add(accountingTable,BorderLayout.CENTER);
		tab.add("Accounting and Sales",accounting);
		panel5.add(panel3,BorderLayout.NORTH);
		panel5.add(tab);
		//panel5.setSize(400,200);
		frame.getContentPane().add(panel5,BorderLayout.CENTER);
		frame.setSize(700,700);
		frame.setVisible(true);
		//frame.isResizable();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new Database();
	}
}
