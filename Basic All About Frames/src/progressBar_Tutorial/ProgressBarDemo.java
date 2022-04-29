package progressBar_Tutorial;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,500); 
	
	ProgressBarDemo(){
		
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true); // adds percentage in the bar
		bar.setFont(new Font("MVBoli", Font.BOLD, 25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}

	public void fill() {
		
		int counter = 500;
		
		while (counter>0) {
			
			bar.setValue(counter);
			
			try {
				Thread.sleep(10); // pause the program every 1 second
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			counter--;
		}
		
		bar.setString("Done! :)"); 
		
	}
	
}
