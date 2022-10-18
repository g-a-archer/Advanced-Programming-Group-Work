import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Database extends JFrame implements ActionListener {


	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTabbedPane tab;
	private JPanel dashboard;
	private JPanel management;
	private JPanel inventory;
	private JPanel accounting;
	private JLabel navigationLabel;
	private JPanel navigationPanel;

	private JButton button;
	private JComboBox combobox;
	Database(){
		frame= new JFrame();
		dashboard=new JPanel();
		management=new JPanel();
		inventory=new JPanel();
		accounting=new JPanel();
		tab=new JTabbedPane();
		tab.setBounds(100, 100, 700,400);
		//navigationPanel =new JPanel();
		navigationLabel=new JLabel("Navigation:");
		frame.add(navigationLabel);
		//navigationPanel.setLayout(new FlowLayout());
		
		button=new JButton("Logout");
		String navigation[]= {" ","Dashboard","Customer Database","Staff Database","Stock and Inventory","Check Out","Sales Reports","Register Customer"};
		 combobox=new JComboBox<>(navigation);
		combobox.setBounds(100, 50, 150, 20);
		frame.add(combobox);
		
		layout();
	}
	public void layout() {
		frame.setLayout(null);
		frame.add(button);
		//frame.add(navigationPanel);
		tab.add("Dashboard",dashboard);
		tab.add("Management",management);
		tab.add("Inventory",inventory);
		tab.add("Accounting and Sales",accounting);
		frame.add(tab);
		
		frame.setSize(700,400);
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
