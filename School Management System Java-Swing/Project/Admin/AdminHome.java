package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.JTextArea;
public class AdminHome extends JFrame {

	private JPanel contentPane;
	private JFrame jf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome frame = new AdminHome();
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
	public AdminHome() {
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1008, 26);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Main Menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAddOldBooks = new JMenuItem("Add Student");
		mntmAddOldBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//			Add_old_books obj=new Add_old_books();
		//		obj.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmAddOldBooks);
		
		JMenuItem mntmAddNewBooks = new JMenuItem("Add Marks");
		mntmAddNewBooks.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		//	Add_new_books obj=new Add_new_books();
			//obj.setVisible(true);
		}
	});
		mnNewMenu_1.add(mntmAddNewBooks);
		
		JMenu menu = new JMenu("Add Attendence %");
		menuBar.add(menu);
		
		
		
		JMenu mnNewMenu_2 = new JMenu("All Students");
		menu.add(mnNewMenu_2);
		
		JMenuItem menuItem1 = new JMenuItem("All Faculty");
		mnNewMenu_2.add(menuItem1);
		
		JMenuItem menuItem2 = new JMenuItem("Manage ");
		mnNewMenu_2.add(menuItem2);
		
		JMenu mnNewMenu_3 = new JMenu("Add Faculty");
		menu.add(mnNewMenu_3);
		
		
		JMenuItem menuItem_1 = new JMenuItem("Add Attendence %");
		mnNewMenu_3.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("All Students");
		mnNewMenu_3.add(menuItem_2);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
						
				dispose();
				//Main_screen ms=new Main_screen();
				//ms.setTitle("Book Hub");
				//ms.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(899, 39, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton add = new JButton("Add student");
		add.setFont(new Font("Tahoma", Font.PLAIN, 29));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Students obj=new Add_Students();
				obj.setVisible(true);
			}
		});
		add.setBounds(46, 197, 264, 118);
		contentPane.add(add);
		
		JButton btnNewButton_1 = new JButton("Add Marks");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//		Add_new_books obj=new Add_new_books();
			//	obj.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(374, 197,264, 118);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("All Students");
		button.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button.setBounds(699, 197, 264, 118);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Add Marks");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button_1.setBounds(374, 366, 264, 118);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Show");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(46, 366, 264, 118);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Manage Faculty");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(699, 366, 264, 118);
		contentPane.add(button_3);
		
		JMenu mnNewMenu = new JMenu("Search");
		mnNewMenu.setBounds(0, 39, 58, -32);
		contentPane.add(mnNewMenu);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(65, 69, 587, 68);
		contentPane.add(textArea);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_2.setBounds(688, 68, 148, 69);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String pstr=textArea.getText();
				try{
					System.out.println("add");
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
					
					PreparedStatement st=(PreparedStatement) con.prepareStatement("Select * from stu where name=? ");
					int i;
					
					st.setString(1,pstr);
					ResultSet rs=st.executeQuery();
					if(rs.next())
					{
						jf=new JFrame();
						jf.setVisible(true);
						jf.setBounds(450, 319, 1014, 460);
						jf.setResizable(false);

						JLabel lblGurdiansName = new JLabel("Gurdian's Name");
						lblGurdiansName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
						lblGurdiansName.setBounds(59, 101, 145, 32);
						contentPane.add(lblGurdiansName);
						
						JLabel lblGender = new JLabel("Gender");
						lblGender.setFont(new Font("Segoe UI", Font.PLAIN, 20));
						lblGender.setBounds(59, 184, 145, 32);
						contentPane.add(lblGender);
						
						JTextArea stuname = new JTextArea();
						stuname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
						stuname.setBounds(235, 26, 166, 37);
						contentPane.add(stuname);
						
						JTextArea partname = new JTextArea();
						partname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
						partname.setBounds(235, 102, 166, 37);
						contentPane.add(partname);
						
					}
					else{
					
						i=0;
					}
					
					
					
					
				}
				catch(Exception w1)
				{
				System.out.println(w1);	
				}
				
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\why-you-should-read-and-re-read-these-high-school-books-as-an-adult (Custom).jpeg"));
		label.setBounds(0, 26, 1008, 536);
		contentPane.add(label);
		
		
	
	}
}
