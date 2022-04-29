package checkBox_Tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
	
	JCheckBox checkBox;
	JButton button = new JButton("Submit");
	ImageIcon check = new ImageIcon("check.png");
	ImageIcon cross = new ImageIcon("close.png");
	
	MyFrame(){

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		button.addActionListener(this);
		button.setFocusable(false);
		
		checkBox = new JCheckBox("I am not a robot"); // or use set text method
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		// change the check box 
		checkBox.setIcon(cross);
		checkBox.setSelectedIcon(check);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button ) {
			System.out.println(checkBox.isSelected()); // return true when check box is ticked and clicked on submit button
		}
		
	}


}
