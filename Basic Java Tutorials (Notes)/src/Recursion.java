import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		
		// recursion = the process is which a method calls itself continuously
		// a method that calls itself is called a recursive method
		// useful for factorials, transversing trees and simplifying a complex task
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How far do you want to walk (meters)?: ");
		int distance = scan.nextInt();
		
		takeAStep(0, distance);		

	}
	
	static void takeAStep(int i, int distance) {
		
		if (i<distance) {
			i++;
			System.out.println("*You take a step* : " + i + "meter/s");
			takeAStep(i,distance);
		}
		else {
			System.out.println("Your are done walking!");
		}
	}
	
	

}
