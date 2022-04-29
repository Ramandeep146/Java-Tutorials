package lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5189646760960021420L;
	
	JButton myButton1 = new JButton("My Button1");
	JButton myButton2 = new JButton("My Button2");
	
	MyFrame(){
		
		myButton1.setBounds(100,100,200,100);
		myButton1.setFocusable(false);
		myButton1.addActionListener(
			(e) -> System.out.println("You clicked button1.")
		);
		
		myButton2.setBounds(100,200,200,100);
		myButton2.setFocusable(false);
		myButton2.addActionListener(
			(e) -> System.out.println("You clicked button2.")
		);
		
		this.add(myButton1);
		this.add(myButton2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
	}

}
