
public class Overloaded_Methods {
	
	public static void main (String[] args) {

// Same method name but different parameter types or/and different number of parameters.		
		int x = add(1,2);
		System.out.println(x);
		
		double y = add(1.0,3.0);
		System.out.println(y);
		
		int z = add(1,2,3);
		System.out.println(z);
		
	}
	
	static int add(int a, int b) {
		System.out.print("1. ");
		return a + b;
	}
	
	static double add(double a, double b) {
		System.out.print("2. ");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.print("3. ");
		return a + b + c;
	}

}
