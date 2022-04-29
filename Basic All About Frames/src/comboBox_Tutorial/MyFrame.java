package comboBox_Tutorial;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	
	JComboBox comboBox;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		// we need to pass an array of 'reference data types'
		String[] animals = {"dog","cat","bird"};
		
		//** if we pass an array of primitive data types, it wouldn't work
		// int[] numbers = {1, 2, 3, 4, 5};
		//** we need to use the wrapper class instead:
		// Integer[] numbers = {1, 2, 3, 4, 5};
		//** Another example: Double instead of double
		// Double[] numbers = {1.2, 2.4, 1.8, 7.8, 6.8};
		
		comboBox = new JComboBox(animals); // we can pass array of reference data types (use wrapper class)
		comboBox.addActionListener(this);
		
		//comboBox.setEditable(true); // can edit the content and type in box
		//System.out.println(comboBox.getItemCount()); // gets the current amount of items
		//comboBox.addItem("Horse"); // Add item afterwards
		//comboBox.insertItemAt("Pig", 0); // add item at certain index
		//comboBox.setSelectedIndex(0); // sets the item which is selected at the start of the program according to its index number
		//comboBox.removeItem("cat"); // to remove item
		//comboBox.removeItemAt(0); // to remove item at certain index
		//comboBox.removeAllItems(); // clear the combo box
		
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
			
			//System.out.println(comboBox.getSelectedIndex()); // this will return indux number
		}
		
	}

}
