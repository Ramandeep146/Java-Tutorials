package overloaded_Constructors;

public class toString_Method {
	
	public static void main (String[] args) {
		
/**/ 	// toString() = special method that all objects inherit,
	    //              that returns a string that "textually represents" an object.
	    //              can be used both 'implicitly' and 'explicitly'
	
	Pizza pizza = new Pizza("Thicc crust","tomato","mozerella", 5);
	
	System.out.println(pizza);
	System.out.println(pizza.toString()); 
	
	// return the address where it is in memory if the toString method is not there in Pizza class
	
	
	
	}

}
