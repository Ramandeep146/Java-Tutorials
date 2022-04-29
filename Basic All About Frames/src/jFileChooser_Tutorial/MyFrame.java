package jFileChooser_Tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		button.setFocusable(false);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button) {
			
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("C:\\Users\\Asus\\Desktop"));
			
			//int response1 = fileChooser.showOpenDialog(null); // select file to open. This will return integer value
			                                                  // if clicked on 'Open', it will return 0
		                                                      // if clicked on 'Cancel' or 'X', it will return 1
			
			int response2 = fileChooser.showSaveDialog(null); // select file to save // doesn't actually save, but 'Save' button instead of 'Open'
			
			// better to use approve_option instead of the return value
			if(response2 ==JFileChooser.APPROVE_OPTION) {
				File file = new File (fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
				
			}
			
		}
		
	}

}
