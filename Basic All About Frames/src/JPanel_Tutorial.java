import java.awt.Color;
import javax.swing.*;
import java.awt.BorderLayout;

public class JPanel_Tutorial {

	public static void main(String[] args) {
		
		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon image = new ImageIcon("image.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250); // manually placing coordinates, width and height of the panel
		redPanel.setLayout(new BorderLayout()); // this is important to set the layout of the label
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
		bluePanel.setLayout(new BorderLayout()); // this will use border layout
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,500,250);
		greenPanel.setLayout(new BorderLayout()); // try using null as value and add line label.setBounds(0,0,23,54) 
											      // you wont need set-vertical and set-horizontal
		JFrame frame = new JFrame();
		frame.setTitle("Label Class");
		frame.setLayout(null); // used with setBounds()
		frame.setVisible(true);
		frame.setSize(750,750); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(123,50,250));
		frame.setIconImage(image.getImage());
		
/**/    greenPanel.add(label);
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		// frames use border layout whereas panels use flow layout manager
		// flow layout meaning, take all the components and put them on the top-center, and add components until the first row is filled
		// After that, its going to add components to second row

	}

}
