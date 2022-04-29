import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Label_Tutorial {

	public static void main(String[] args) {
		
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("images.png");
		Border border = BorderFactory.createLineBorder(Color.green,5);
		
		JLabel label = new JLabel(); // create a label
		/* you can also pass the text as an argument in JLabel() or do as below */
		label.setText("Man, do you even code?"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER or RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, or BOTTOM of imageicon
		label.setForeground(new Color(255,100,0)); // set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,16)); // set font of text
		label.setIconTextGap(-23); // set gap of text to image
		label.setBackground(Color.black); // set background color, it will not work unless we use the following method:
		label.setOpaque(true); // to display background color, but as the label take the entire content pane (as it will take as much space as possible), it will fill the entire content pane with black color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
		//label.setBounds(100,100 , 250,250); // set x,y position within frame as well as dimensions [do not need with pack]
		
		JFrame frame = new JFrame();
		frame.setTitle("Label Class");
		frame.setVisible(true);
		// frame.setSize(500,500); // do not need with pack()
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(123,50,250));
		frame.setIconImage(image.getImage());
		frame.add(label);
		//frame.setLayout(null); // Used when setting all the components in the frame manually // used with setBounds [do not need with pack]
		frame.pack(); // it must be after adding all components to the frame // It will resize the size of the frame to accommodate all the components the frame has
		
	}

}
