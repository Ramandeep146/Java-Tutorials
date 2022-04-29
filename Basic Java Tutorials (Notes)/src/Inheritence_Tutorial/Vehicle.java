package Inheritence_Tutorial;

// Vehicle class is the super class also known as parent class

public class Vehicle {

	// attributes common in cars and bicycle
	// Benefit: 1. We do not need to list these attributes twice
	//          2. Car and Bicycle can have their own unique additional attributes and methods
	
	double speed;
	
	void go() {
		System.out.println("This vehicle is moving");
	}
	
	void stop() {
		System.out.println("This vehicle is stopped");
	}
}
