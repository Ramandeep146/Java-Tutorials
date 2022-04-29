import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
		// exception = an event that occurs during the execution of a program that,
		//             disrupts the normal flow of instructions
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Please input first number: ");
			int x = scanner.nextInt();
			System.out.println("Please input second number: ");
			int y = scanner.nextInt();
			
			double result = (double)x/y;
			
			System.out.println("Answer = " + (double)(Math.round(result * 100))/100);
			
		}
		catch(ArithmeticException e) {
			System.out.println("You can's divide by zero!");
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a number!");			
		}
		catch (Exception e) {
			// this will handle all other exceptions
			// but its good practice to address and handle specific exceptions
			System.out.println("Something went wrong!");
		}
		finally{
			// This will always execute no matter what
			// If there is anything else you want to do before you move on, use finally
			// like closing a scanner or a file
			scanner.close();
		}
	}

}
