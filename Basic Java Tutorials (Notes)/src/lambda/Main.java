package lambda;

public class Main {

	public static void main(String[] args) {
		
		// lambda expression = feature for java 8 and above
		//					   also known as an anonymous method
		//					   a shorter way to write anonymous classes with only one method
		//                     
		//                     need to use a functional interface or use a pre-defined functional interface
		//                     they contain only one abstract method
		//                     ex. ActionListener, Runnable, (user-defined)
		//                       
		//                     A Lambda expression can be used in any place where a functional interface is required
		//					   How to use a lambda expression:
		//                     (arguments) -> (statement/s)
		
		
		/** Usually done like this but there is another way
		MyInterface myInterface = new MyInterface() {
			public void message() {
				
			}
		};
		*/
		
		/*
		String name = "Raman";
		char symbol = '!';
		
		MyInterface myInterface = (namex,symbolx) -> {
			System.out.println("Hello World");
			System.out.println("It is a nice day " + namex + symbolx);
		};
		
		MyInterface myInterface2 = (x,y) -> {
			System.out.println("Hello " + x + y);
		};

		myInterface2.message(name,symbol);
		*/
		
		new MyFrame();

	}

}
