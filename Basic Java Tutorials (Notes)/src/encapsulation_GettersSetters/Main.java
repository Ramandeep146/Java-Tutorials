package encapsulation_GettersSetters;

public class Main {

	public static void main(String[] args) {

		// Encapsulation = attributes of a class will be hidden or private
		//				   Can be accessed only through methods (getters & setters)
		//                 You should make attributes private if you don't have a reason to make them public/protected
		
		Car car = new Car("Chevrolet", "Camaro", 2021);

		/*System.out.println(car.make);
		 * Cannot use this because the attributes are private*/
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		System.out.println();
		
		car.setMake("Mustang");
		car.setModel("GT");
		car.setYear(2022);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
	}

}
