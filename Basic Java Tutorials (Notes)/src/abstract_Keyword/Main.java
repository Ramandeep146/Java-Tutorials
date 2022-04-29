package abstract_Keyword;

public class Main {

	public static void main(String[] args) {

		// abstract = abstract classes cannot be instantiated, but they can have a subclass that can be
		//            abstract methods are declared without implementation, but the child class has to implement it somewhere

		// So, now we cannot declare a Vehicle object using
		//     Vehicle vehicle = new Vehicle();
		Car car = new Car();
		
		car.go();
	}

}
