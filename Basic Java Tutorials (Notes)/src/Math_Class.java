import java.util.Scanner;

public class Math_Class {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		double x = myObj.nextDouble();
		double y = myObj.nextDouble();
		
		myObj.close();
		
		double hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
		
		System.out.println("Hypotenuse = " + hypotenuse);
		
		double z = Math.max(x,y); 
		double z1 = Math.min(x,y);
		
		// Absolute value of x (Always positive output)
		double z2 = Math.abs(x); 
		
		// If x = 3.14 then z3 = 3.0
		double z3 = Math.round(x);
		
		// If x = 3.14, then z4 = 4.0
		double z4 = Math.ceil(x);
		
		//If x=3.14, then z5 = 3.0
		double z5 = Math.floor(x);
		
		System.out.println(z + z1 + z2 + z3 + z4 + z5);
		
	}
}
