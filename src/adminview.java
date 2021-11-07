import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminview extends JFrame {
	
	/*add button names as local variable since action perform is out of our constructor*/
	JButton srchBtn;
	JButton addbkBtn;
	JButton delusrBtn;
	JButton lendbkBtn;
	JButton infoBtn;
	JButton exitBtn; 
	
	adminview(){
		setResizable(false);
		getContentPane().setBackground(new Color(192, 192, 192));//set frame colour
		
		ImageIcon bookImg = new ImageIcon("book1.png");
		ImageIcon srchImg = new ImageIcon("search.png");
		ImageIcon adbkImg = new ImageIcon("adbk.png");
		ImageIcon dltImg  = new ImageIcon("delete.png");
		ImageIcon lendImg = new ImageIcon("handover.png");
		ImageIcon infoImg = new ImageIcon("aboutus.png");
		ImageIcon exitImg = new ImageIcon("logout.png");
		
		this.setBounds(100, 100, 986, 699);//this key word replace Frame name
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();//upper jPannel
		panel.setBackground(new Color(33,63,86));
		panel.setBounds(0, 0, 1030, 205);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel upLabel = new JLabel();//upper JLabel contains Text
		upLabel.setBackground(Color.WHITE);
		upLabel.setForeground(new Color(255, 255, 255));
		upLabel.setBounds(235, 48, 687, 94);
		panel.add(upLabel);
		upLabel.setText("Library Mangemenet System");
		upLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 53));
		
		JLabel upImgLabel = new JLabel();//upper JLabel contains Image
		upImgLabel.setBounds(42, 35, 128, 128);
		upImgLabel.setIcon(bookImg);
		panel.add(upImgLabel);
		
		JPanel srchPanel = new JPanel();//search book panel
		srchPanel.setBounds(100, 244, 175, 183);
		srchPanel.setBackground(new Color(33,63,86));
		getContentPane().add(srchPanel);
		srchPanel.setLayout(null);
		
		JLabel srchLabel = new JLabel();//search book icon label
		srchLabel.setBounds(57, 44, 64, 64);
		srchLabel.setIcon(srchImg);
		srchPanel.add(srchLabel);
		
		srchBtn = new JButton();//search book panel button
		srchBtn.setForeground(new Color(255, 255, 255));
		srchBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		srchBtn.setBounds(28, 133, 119, 24);
		srchBtn.setText("Search Book");
		srchBtn.setBorder(null);
		srchBtn.setBackground(new Color(33,63,86));
		srchBtn.setFocusable(false);
		srchPanel.add(srchBtn);
		
		JPanel addbkPanel = new JPanel();//add book JPanel
		addbkPanel.setBackground(new Color(33, 63, 86));
		addbkPanel.setBounds(391, 244, 175, 183);
		getContentPane().add(addbkPanel);
		addbkPanel.setLayout(null);
		
		JLabel addbkLabel = new JLabel();//add book icon label
		addbkLabel.setBounds(56, 45, 64, 64);
		addbkLabel.setIcon(adbkImg);
		addbkPanel.add(addbkLabel);
		
		addbkBtn = new JButton();//add book button
		addbkBtn.setText("Add Book");
		addbkBtn.setForeground(Color.WHITE);
		addbkBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		addbkBtn.setFocusable(false);
		addbkBtn.setBorder(null);
		addbkBtn.setBackground(new Color(33, 63, 86));
		addbkBtn.setBounds(34, 139, 104, 21);
		addbkPanel.add(addbkBtn);
		
		JPanel delusrPanel = new JPanel();//update or delete user JPanel
		delusrPanel.setBackground(new Color(33, 63, 86));
		delusrPanel.setBounds(695, 244, 175, 183);
		getContentPane().add(delusrPanel);
		delusrPanel.setLayout(null);
		
		JLabel delusrLabel = new JLabel();//update or delete user Icon Label
		delusrLabel.setBounds(58, 43, 64, 64);
		delusrLabel.setIcon(dltImg);
		delusrPanel.add(delusrLabel);
		
		delusrBtn = new JButton();//update or delete user button
		delusrBtn.setText("Update/Delete User");
		delusrBtn.setForeground(Color.WHITE);
		delusrBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		delusrBtn.setFocusable(false);
		delusrBtn.setBorder(null);
		delusrBtn.setBackground(new Color(33, 63, 86));
		delusrBtn.setBounds(10, 141, 155, 21);
		delusrPanel.add(delusrBtn);
		
		JPanel lendbkPanel = new JPanel();//lend book JPanel
		lendbkPanel.setBackground(new Color(33, 63, 86));
		lendbkPanel.setBounds(100, 454, 175, 183);
		getContentPane().add(lendbkPanel);
		lendbkPanel.setLayout(null);
		
		JLabel lendbkLabel = new JLabel();//lend book Icon Label
		lendbkLabel.setBounds(57, 43, 64, 64);
		lendbkLabel.setIcon(lendImg);
		lendbkPanel.add(lendbkLabel);
		
		lendbkBtn = new JButton();//lend book button
		lendbkBtn.setText("Lend Book");
		lendbkBtn.setForeground(Color.WHITE);
		lendbkBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		lendbkBtn.setFocusable(false);
		lendbkBtn.setBorder(null);
		lendbkBtn.setBackground(new Color(33, 63, 86));
		lendbkBtn.setBounds(27, 138, 119, 21);
		lendbkPanel.add(lendbkBtn);
		this.setVisible(true);
		
		
		JPanel infoPanel = new JPanel();//about us JPanel
		infoPanel.setBackground(new Color(33, 63, 86));
		infoPanel.setBounds(391, 454, 175, 183);
		getContentPane().add(infoPanel);
		infoPanel.setLayout(null);
		
		JLabel infoLabel = new JLabel();//about us Icon Label
		infoLabel.setBounds(54, 41, 64, 64);
		infoLabel.setIcon(infoImg);
		infoPanel.add(infoLabel);
		
		infoBtn = new JButton();//about us button
		infoBtn.setText("About Us");
		infoBtn.setForeground(Color.WHITE);
		infoBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		infoBtn.setFocusable(false);
		infoBtn.setBorder(null);
		infoBtn.setBackground(new Color(33, 63, 86));
		infoBtn.setBounds(28, 138, 119, 21);
		infoPanel.add(infoBtn);
		
		JPanel exitPanel = new JPanel();//exit program JPanel
		exitPanel.setLayout(null);
		exitPanel.setBackground(new Color(33, 63, 86));
		exitPanel.setBounds(695, 454, 175, 183);
		getContentPane().add(exitPanel);
		
		JLabel exitLabel = new JLabel();//exit program Icon Label
		exitLabel.setBounds(50, 48, 64, 64);
		exitLabel.setIcon(exitImg);
		exitPanel.add(exitLabel);
		
		exitBtn = new JButton();//exit program button
		exitBtn.setText("Logout");
		exitBtn.setForeground(Color.WHITE);
		exitBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		exitBtn.setFocusable(false);
		exitBtn.setBorder(null);
		exitBtn.setBackground(new Color(33, 63, 86));
		exitBtn.setBounds(30, 140, 119, 21);
		exitPanel.add(exitBtn);
		
	}
}
