import java.util.Random;

public class Random_Tutorial {
	
	public static void main(String[] args) {
		
		Random rando = new Random();
		
		// It will generate number between 0 to 5 inclusive
		int x = rando.nextInt(6);
		System.out.println(x);
		
		// It will generate a number between 0(inclusive) to 1(exclusive)
		double y = rando.nextDouble();
		System.out.println(y);
		
		// It will generate true or false
		boolean z = rando.nextBoolean();
		System.out.println(z);
		
		/*Fun Example: Application of random number generator and string method*/
		String name = "Raman";
		char ch = name.charAt(rando.nextInt(5));
		System.out.println(ch);
				
	}

}
