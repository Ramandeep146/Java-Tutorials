import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.*;

// Using 'JFrame' as a parent class to a child class 'MyFrame'
public class MyFrame extends JFrame{
	
	MyFrame(){
		this.setTitle("Hell Yea this"); // sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application when pressed 'X'
		this.setResizable(false); // prevent frame from being resized
		this.setSize(500,500); // sets the x-dimension, and y-dimension of frame
		this.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("images.png"); // create an ImageIcon
		this.setIconImage(image.getImage()); // change icon of frame
		this.getContentPane().setBackground(new Color(123,50,250)); // extra point: this is called method chaining
		
	}

} 
