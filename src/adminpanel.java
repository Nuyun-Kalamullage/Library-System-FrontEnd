import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

public class adminpanel extends JFrame implements ActionListener {//extend jframe class and actionlistener interface
	
	//if this order changes program willl be fucked up
	
	JLabel usridLabel;
	JLabel passLabel;
	JButton loginBtn;//create our button as global variable since action performed methods outside of our constructor
	JSeparator passSeparator;
	JSeparator usrSeparator;
	JTextField usridField;
	JPasswordField passwordField;


	adminpanel(){

		
		//jlabel is a component that holds picture or text inside a frame
		
		ImageIcon image = new ImageIcon("line.png");
		
		ImageIcon frameIcon = new ImageIcon("bash.png");
	
		ImageIcon anim = new ImageIcon("swipe.gif");
	
		ImageIcon usrIcon = new ImageIcon("user.png");
		
		ImageIcon pass = new ImageIcon("padlock1.png");
		
		//JFrame this = new JFrame("admin login");//create jframe
		
		this.getContentPane().setBackground(new Color(255, 255, 255));
		//this.setBackground(Color.WHITE);
		this.setFont(new Font("Jersey M54", Font.BOLD, 15));
		this.setIconImage(frameIcon.getImage());//set image to frame
		
		this.setBounds(100, 100, 1248, 784);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		this.getContentPane().setPreferredSize(new Dimension(1920, 1000));
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);//maximize both
		this.setUndecorated(true);//maximize both
		//this.setLocationRelativeTo(null);
		
		
		this.setVisible(true);
		//this.pack();
		this.getContentPane().setLayout(null);//set frame layout as absolute layout
		
		Border border = BorderFactory.createLineBorder(Color.green,3);//create border object
		//txtLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GREEN));
		
		JLabel gifLabel = new JLabel();
		gifLabel.setBackground(new Color(192, 192, 192));
		gifLabel.setIcon(anim);
		gifLabel.setBounds(407, -12, 594,623 );
		this.getContentPane().add(gifLabel);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.DARK_GRAY);
		loginPanel.setBounds(0, 0, 405, 623);
		this.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		
		JLabel txtLabel = new JLabel();
		txtLabel.setBounds(28, 135, 337, 64);
		txtLabel.setBackground(Color.WHITE);
		loginPanel.add(txtLabel);
		txtLabel.setIcon(null);
		txtLabel.setHorizontalAlignment(SwingConstants.CENTER);
		txtLabel.setText("Manual Login Panel");
		txtLabel.setForeground(Color.WHITE);//font color
		txtLabel.setFont(new Font("Myanmar Text", Font.BOLD, 33));//set font style,font type and size
		//txtLabel.setBackground(Color.GRAY);//set background color of label as gray
		//txtLabel.setOpaque(true);//visible background colour of label
		txtLabel.setVerticalTextPosition(JLabel.TOP);//position text
		txtLabel.setHorizontalTextPosition(SwingConstants.LEADING);//position text
		
		JLabel iconLabel = new JLabel();
		iconLabel.setBounds(159, 61, 64, 64);
		iconLabel.setForeground(Color.WHITE);
		iconLabel.setIcon(usrIcon);//add user icon to label
		loginPanel.add(iconLabel);
		
		usridLabel = new JLabel("User ID");//user id label
		usridLabel.setForeground(Color.LIGHT_GRAY);
		usridLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		usridLabel.setBackground(Color.WHITE);
		usridLabel.setBounds(42, 234, 84, 23);
		loginPanel.add(usridLabel);
		
		passLabel = new JLabel("password");
		passLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 24));
		passLabel.setForeground(Color.LIGHT_GRAY);
		passLabel.setBounds(38, 340, 106, 30);
		loginPanel.add(passLabel);
		
		usrSeparator = new JSeparator();
		usrSeparator.setForeground(Color.WHITE);
		usrSeparator.setBounds(42, 309, 323, 7);
		loginPanel.add(usrSeparator);
		
		passSeparator = new JSeparator();
		passSeparator.setForeground(Color.WHITE);
		passSeparator.setBounds(42, 422, 323, 14);
		loginPanel.add(passSeparator);
		
		usridField = new JTextField();
		usridField.setForeground(Color.WHITE);
		usridField.setBounds(42, 268, 323, 39);
		usridField.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		usridField.setCaretColor(Color.WHITE);
		usridField.setBackground(Color.DARK_GRAY);
		usridField.setBorder(null);
		loginPanel.add(usridField);
		usridField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setCaretColor(Color.WHITE);
		passwordField.setBackground(Color.DARK_GRAY);
		passwordField.setBounds(42, 380, 323, 39);
		passwordField.setBorder(null);
		loginPanel.add(passwordField);
		
		
		loginBtn = new JButton("LOGIN");
		loginBtn.setBounds(110, 457, 131, 39);
		loginPanel.add(loginBtn);
		loginBtn.setForeground(new Color(0, 0, 0));
		loginBtn.addActionListener(this);//since this keyword for our actionlistner interface
		loginBtn.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		loginBtn.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		loginBtn.setBackground(new Color(242, 12, 39));
		loginBtn.setFocusable(false);
		
		
		//txtLabel.setIconTextGap(25); text and icon gap
		this.pack();
		//txtLabel.setIcon(image);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loginBtn) {
			
			String usr = usridField.getText();//making string variable and store text field user input
			String passwd = passwordField.getText();
			
			if(usr.equals("admin") && passwd.equals("admin")) {//check user input equals with string
				
				this.dispose();//when press button first frame will dispose
				adminview adminbtns = new adminview();//if button triggers this join to our page
			}
			else {
				JOptionPane.showMessageDialog(this, "Invalid Username or Password");
			}
		}
	}
							
}