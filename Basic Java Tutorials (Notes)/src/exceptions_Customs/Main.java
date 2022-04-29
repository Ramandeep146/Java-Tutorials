package exceptions_Customs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// exception = an event, after execution, that disrupts the normal flow of the program
		// ex. ArithematicException, ArrayIndexOutOfBoundsException etc
				
		// user defined exceptions = custom exception
		// ex. DuplicateEmail, InvalidCreditException, AgeExeption
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = scan.nextInt();
		
		try {
			checkAge(age);
		}
		catch(Exception e) {
			System.out.println("A problem occured: " + e);
		}

	}
	
	static void checkAge(int age) throws AgeException{
		if (age<18) {
			throw new AgeException("\n" + "You must be 18+ to sign up.");
		}
		else {
			System.out.println("You are now signed up!");
		}
		
	}

}
