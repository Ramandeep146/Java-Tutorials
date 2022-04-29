
public class Printf_Method {

	public static void main(String[] args) {
		
		boolean bool = true;
		char mychar = '@';
		String mystring = "Simran";
		int myint = 50;
		double mydouble = 1000000.2896;
		
		System.out.printf("%b %c %s %d %f \n \n",bool, mychar, mystring, myint, mydouble);
		
		// Width
		System.out.printf("1. Width: Hello %10s \n \n", mystring);
		
		// Precision
		System.out.printf("2. Total money: $%.2f \n \n", mydouble);
		
		// Flags
		System.out.printf("3. Total money: $%,020.2f \n", mydouble);
		System.out.printf("   Total money: $%,20.2f \n", mydouble);
		System.out.printf("   Total money: $%+,.2f", mydouble);
		/* + sign is used to display the positive or negative sign of the number 
		 * It will display + if the number is positive and - if the number is negative*/
	}
	
}
