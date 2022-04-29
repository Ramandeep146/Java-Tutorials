package radioButton_Tutorial;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	ImageIcon pizza;
	ImageIcon hamburger;
	ImageIcon hotdog;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizza = new ImageIcon("pizza.png");
		hamburger = new ImageIcon("hamburger.png");
		hotdog = new ImageIcon ("hotdog.png");
		
		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Hamburger");
		hotdogButton = new JRadioButton("Hotdog");
		
		//pizzaButton.setFocusable(false);
		//hamburgerButton.setFocusable(false);
		//hotdogButton.setFocusable(false);
		
		pizzaButton.setIcon(pizza);
		hamburgerButton.setIcon(hamburger);
		hotdogButton.setIcon(hotdog);
		
		// a group will let us select just one of the JRadioButtons
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == pizzaButton) {
			System.out.println("You ordered pizza");
		}
		else if (e.getSource() == hamburgerButton) {
			System.out.println("You ordered a hamburger");
		}
		else if (e.getSource() == hotdogButton) {
			System.out.println("You ordered a hotdog");
		}
		
	}

}
