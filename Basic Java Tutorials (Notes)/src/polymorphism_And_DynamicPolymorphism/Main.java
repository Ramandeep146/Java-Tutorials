package polymorphism_And_DynamicPolymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

/*1*/	// polymorphism = greek word for poly - "many", morph - "form"
		//                The ability of an object to identify as more than one type
		
		// the car identifies as Car but it also identifies as Vehicle, and same goes for others
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		// Array of Vehicle, as Car, Bicycle and Boat are subclasses of Vehicle
		// We can also write Object[] instead of Vehicle[] as they all identify as objects as well
		// This is polymorphism
		Vehicle[] racer = {car,bicycle,boat};
		
		// for each loop to print output
		for (Vehicle x : racer) {
			x.go();
		}
		
		System.out.println();
		
		
		
/*2*/  	// polymorphism = many shapes/forms
		// dynamic = after compilation (during runtime)
		
		// ex. A corvette is a: corvette, and a car, and a vehicle, and an object
		
		Scanner scanner = new Scanner(System.in);
		// This is the benefit of dynamic polymorphism
		// You can declare an object and make space for it in memory 
		// even if you don't know what type of object you want quite yet
		Vehicle vehicle;
		
		System.out.println("What vehicle do you want?: (1 = car) or (2 = bicycle) or (3 = boat))");
		int choice = scanner.nextInt();
		
		if (choice==1) {
			vehicle = new Car();
			vehicle.go();
		}
		else if (choice==2) {
			vehicle = new Bicycle();
			vehicle.go();
		}
		else if (choice==3) {
			vehicle = new Boat();
			vehicle.go();
		}
		else {
			vehicle = new Vehicle();
			System.out.println("The choice is invalid");
			vehicle.go();
		}
		
		scanner.close();
		
		// Practical example: Like in Pokemon when you choose to be a boy or girl
		// and then it chooses the appropriate game sprite once you make your decision
		
	
	}

}
