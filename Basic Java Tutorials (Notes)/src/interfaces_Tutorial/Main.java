package interfaces_Tutorial;

public class Main {

	public static void main(String[] args) {
		
		// interface = a template that can be applied to a class.
		//             similar to inheritance, but specifies what a class has/must do.
		//             classes can apply more that one interface, inheritance is limited to one direct super class
		
		// with interfaces you can declare variables normally like with we can do with inheritance
		// Can also declare methods, and you do not need to create a body for these methods

		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.flee();
		fish.hunt();
		
	}

}
