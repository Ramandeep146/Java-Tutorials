package passingObjectsAsArguments;

public class Main {

	public static void main(String[] args) {
	
		Garage garage1 = new Garage("Hall - 1");
		Garage garage2 = new Garage("Hall - 2");
		
		Cars car1 = new Cars("BMW");
		Cars car2 = new Cars("Tesla");
		
		garage1.park(car2);
		garage2.park(car1);

	}

}
