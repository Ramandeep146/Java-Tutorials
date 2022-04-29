import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class AnonymousObjects {

	public static void main(String[] args) {
		
		// Benefit of using nameless objects: 
		// makes the code much concise
		
		JFrame frame = new JFrame();
		
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		/** Longer Method
		ImageIcon ace = new ImageIcon("deck\\ace.png");
		JLabel aceLabel = new JLabel(ace);
		deck.add(aceLabel);
		frame.add(deck.get(0));
		
		ImageIcon cards = new ImageIcon("deck\\cards.png");
		JLabel cardsLabel = new JLabel(cards);
		deck.add(cardsLabel);
		frame.add(deck.get(1));
		**/
		
		/* shorter method */
		deck.add(new JLabel(new ImageIcon("deck\\ace.png")));
		deck.add(new JLabel(new ImageIcon("deck\\cards.png")));
		deck.add(new JLabel(new ImageIcon("deck\\deck.png")));
		
		// You can do same for above as well if the pictures are named 1,2,3,4,etc.
		// to make the code more short
		for (int i = 0; i<3 ; i++) {
			frame.add(deck.get(i));
		}
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);

	}

}
