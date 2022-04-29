package Inheritence_Tutorial;

public class Main {

	public static void main(String[] args) {
	
	// inheritance = the process where one class acquires the attributes
	//               and methods of another
		
	
		Car car = new Car();
	    car.go();
	    System.out.println(car.speed=10.00);
	    System.out.println(car.doors);
	    
	    System.out.println();
	    
	    Bicycle bike = new Bicycle();
	    bike.stop();
	    System.out.println(bike.speed);
	    System.out.println(bike.pedals);	    

	}

}
