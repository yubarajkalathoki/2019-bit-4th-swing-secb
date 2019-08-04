import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HelloWorldDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Hello World!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		JLabel label = new JLabel("Hello World!");
		frame.add(label);
		
		frame.setVisible(true);
	}
}
