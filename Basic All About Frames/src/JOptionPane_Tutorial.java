import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPane_Tutorial {

	public static void main(String[] args) {
		
		// JOptionPane = pop up a standard dialog box that prompts users for a value
		//               or informs them of something
		
		JOptionPane.showMessageDialog(null, "This is some useless info.", "Title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is some useless info::))", "Title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is some useless info?", "Title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is some useless info!", "Title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is some useless info#&@Q*W", "Title", JOptionPane.ERROR_MESSAGE);

		JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		// Yes returns 0
		// No returns 1
		// Cancel returns 2
		// X returns -1
		
		JOptionPane.showInputDialog("What is your name?");
		// can store the result in a string
		
		
		
		String[] responses = {"No, you are awesome", "Thank you", "blush"};
		
		ImageIcon icon = new ImageIcon("image.png");
		
		JOptionPane.showOptionDialog(null, 
				"You are awesome", 
				"Secret Message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0);
		
	}

}
