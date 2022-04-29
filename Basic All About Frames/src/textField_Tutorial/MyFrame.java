package textField_Tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

	JTextField textField = new JTextField();
	JButton button = new JButton("Submit");
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 25));
		textField.setForeground(Color.green); // font color
		textField.setBackground(new Color(143,50,250)); // background color
		textField.setCaretColor(Color.white); // line will become white
		textField.setText("username"); // set text within field
		
		button.setFocusable(false);
		button.addActionListener(this);		
		
		this.add(textField);
		this.add(button);
		this.pack();
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			
			 // to retrieve what is typed in the field
			System.out.println(textField.getText());
			textField.setEditable(false);
			button.setEnabled(false);
			
		}
		
	}

}
