package passingObjectsAsArguments;

public class Garage {
	
	String name;
	
	Garage(String name){
		
		this.name = name;
		
	}
	
	void park(Cars car) {
		
		System.out.println(car.name + " is parked in " + this.name);
		
	}

}
