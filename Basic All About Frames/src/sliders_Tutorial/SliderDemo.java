package sliders_Tutorial;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); // minimum of 0 and maximum of 100, 50 is the starting point 
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		
		slider.setFont(new Font("MV Boli",Font.PLAIN, 15));
		
		// set the orientation of the slider
		// slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.setOrientation(SwingConstants.VERTICAL);
		
		slider.addChangeListener(this);
		
		label.setFont(new Font("MV Boli",Font.PLAIN, 25));
		label.setText("°C = " + slider.getValue());
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}
	

	@Override
	public void stateChanged(ChangeEvent e) {
		
		label.setText("°C = " + slider.getValue());
		
	}
	
}
