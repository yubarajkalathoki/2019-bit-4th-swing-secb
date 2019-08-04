import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Login Demo!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(50, 50, 100, 20);//x,y,width,height
		frame.add(usernameLabel);
		
		JTextField usernameField = new JTextField();
		usernameField.setBounds(150, 50, 100, 20);
		frame.add(usernameField);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(50, 100, 100, 20);
		frame.add(passwordLabel);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(150, 100, 100, 20);
		frame.add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(100, 150, 80, 20);
		frame.add(loginButton);
		
		frame.setVisible(true);
	}
}
