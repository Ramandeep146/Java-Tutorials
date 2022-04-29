package overloaded_Constructors;

public class Overloaded_Constructors {

	public static void main(String[] args) {
		
		// Overloaded Constructors = Multiple constructors within a class with the same name,
		//                           but have different parameters
		//        					 name + parameters = signature                             

		Pizza pizza = new Pizza("Thicc crust","tomato","mozerella", 5);
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		System.out.println(pizza.slices);
		
	}

}
