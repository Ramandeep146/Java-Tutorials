
public class Wrapper_Class {
	
	public static void main(String[] args) {
		
		// wrapper class =  provides a way to use primitive data types as reference data types
		  //     reference data types contain useful methods
		  //     can be used with collections (ex.ArrayList)
		  
		  //primitive  //wrapper
		  //---------  //-------
		  // boolean  Boolean
		  // char   Character
		  // int   Integer
		  // double  Double
		  
		  // autoboxing = the automatic conversion that the Java compiler makes between the primitive 
		  //              types and their corresponding object wrapper classes
		  // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
		// Autoboxing
		Boolean a = true;
	    Character b = '@';
		Integer c = 123;
		Double d = 5.0;
		
		// Unboxing, even though it is a reference data type, it will still behave as a standard primitive data type
		if (a == true || b == '@' || c == 2 || d == 5)
		{
			System.out.println("This is true");
		}
		
	}

}
