package copy_Objects;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("Chevrolet", "Camaro", 2021);
		Car car2 = new Car("Ford", "Mustang", 2022);
		
		/*car2 = car1;
		 * using this will create issues.
		 * the address will get copied
		 * the address of car2 will become same as of car1
		 * car2 printout will show car1 make,model and year*/
		
		// now address wont get copy
		car2.copy(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		
		System.out.println();
		
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		
		System.out.println();
		
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		// 2nd way, passing objects as arguments
		Car car3 = new Car(car1);
		
		System.out.println();
		
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());
		
	}

}
