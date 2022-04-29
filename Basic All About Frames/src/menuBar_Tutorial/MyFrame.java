package menuBar_Tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
	
	JMenuBar menuBar;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		menuBar = new JMenuBar(); // JMenuBar
		
		loadItem = new JMenuItem("Load"); // JMenuItem
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this); // Implementing action listener on JMenuItem
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu = new JMenu("File"); // JMenu
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		// adding mnemonics to add shortcut to open
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
		
		// adding mnemonics to add shortcut to open
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
		
		// you can also set icons for the items example:
		// loadItem.setIcon(loadIcon);
		
		fileMenu.add(loadItem); // Adding JMenuItem in JMenu
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu); // Adding JMenu to the JMenuBar
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar); // this is the way to add a menu bar to the frame
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == loadItem) {
			System.out.println("Loading an item.");
		}
		
		if (e.getSource() == saveItem) {
			System.out.println("Loading an save.");
		}
		
		if (e.getSource() == exitItem) {
			System.exit(0);
		}
		
	}

}
