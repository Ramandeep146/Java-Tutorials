package abstract_Keyword;

public class Car extends Vehicle{

	// The type Car must implement the inherited abstract method Vehicle.go()
	// If not, Error
	@Override
	void go() {
		// TODO Auto-generated method stub
		
		System.out.println("The driver is driving the car");
		
	}

}
