import javax.swing.*;
import java.awt.*;

public class Layered_Pane {

	public static void main(String[] args) {
		
		// JLayeredPane = Swing container that provides a third
		//                dimension for positioning components
		//                ex. depth, z-index
		// Names of layers:
		// Default, Palette, Modal, PopUp, Drag
		// Deepest (in the screen) ----- to ----- most outer 
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150,150,200,200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500); // x,y,width,height	
		
		layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label2, Integer.valueOf(0));       // can also use this, higher the number higher the placement when stacked  
		layeredPane.add(label3, JLayeredPane.DRAG_LAYER);  
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
