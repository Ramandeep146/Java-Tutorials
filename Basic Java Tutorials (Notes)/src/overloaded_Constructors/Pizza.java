package overloaded_Constructors;

public class Pizza {

	String bread;
	String sauce;
	String cheese;
	String topping;
	int slices;
	
	Pizza(String bread, String sauce, String cheese, String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
		
	}
	
    Pizza(String bread, String sauce, String cheese, int slices){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.slices = slices;
	}
 
    
    
    
    
    
    
    
// if assigning this method like here, it will return the following
// if this method is not used and deleted below, then toString() method will return memory address location
// Over-riding toString() method: -     
/*    public String toString() {
    	
    	String myString = bread + "\n" + sauce + "\n" + cheese + "\n" + topping + "\n" + slices;
    	return myString;
    }
*/    
	
}
