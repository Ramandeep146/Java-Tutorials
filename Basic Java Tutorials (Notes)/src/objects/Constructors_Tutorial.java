package objects;

public class Constructors_Tutorial {

	public static void main (String[] args) {
		
//		constructor = special method that is called when an object is instantiated (created)
//      This allows us to create different objects that have different attributes
//		constructors allow us to assign different attributes to each object that we instantiate
		Human hum = new Human("Raman", 21, 55.00);
		Human hum2 = new Human ("Simran", 21, 45);
		
		System.out.println(hum.name);
		System.out.println(hum2.name);
		
		System.out.println();
		
		hum.eat();  
		hum2.drink();		
		
	}
// Extra: local - Declared inside a method. Visible only to that method.
//        global - Declared outside a method, but within a class. Visible to all parts of a class	
	
}
