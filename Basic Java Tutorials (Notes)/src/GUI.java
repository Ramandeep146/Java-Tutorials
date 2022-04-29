import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		
		// Display Input dialog box
		String name = JOptionPane.showInputDialog("Enter your name: ");
	    // Display output in a dialog box
		JOptionPane.showMessageDialog(null, "Hello " + name); 		
		
		// Integer.parseInt - to convert string to integer
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
			
		// Double.parseDouble - to convert string to double
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
		JOptionPane.showMessageDialog(null, "Your height is " + height + "m");

	}
}
