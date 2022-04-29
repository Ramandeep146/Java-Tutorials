package Method_Overriding;

public class Dog extends Animal{
	
	// the speak method in Dog class is considered the overriding method
	// The one that it inherits from its parent class is considered the overridden method
    
	
	// @Override is not necessary but its considered a good practice just to let you know its an overrind method
	@Override
	void speak() {
		System.out.println("The dog *barks*");
	}
	
}
