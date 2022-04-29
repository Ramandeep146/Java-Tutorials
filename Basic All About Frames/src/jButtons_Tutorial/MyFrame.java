package jButtons_Tutorial;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// We need to implement an action listener to make the button work when clicked
public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	int i = 1;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("image.png");
		
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(150,250,150,150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100,100,250,100);
		//this' because since this class is implementing the action listener interface
		button.addActionListener(this); // to make the button work
		
		/* Can use lambda expression: -
		 * button.addActionListener(e -> System.out.println("poo"));
		 * We do not need "implements ActionListener" when used above
		 */
		
		button.setText("I am a button!");
		button.setFocusable(false); // this will remove the setText outline
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(5);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		// button.setEnabled(false); // to disable button click
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button) {
			
			System.out.println("Poo");
			if (i == 1) {
				label.setVisible(true);
				i++;
				
			}
			else {
				label.setVisible(false);
				i--;
			}
			
		}
		
	}

}
