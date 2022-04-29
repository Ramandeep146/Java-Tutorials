package generics_Tutorial;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		/**
		MyIntegerClass myInt = new MyIntegerClass(1);
		MyDoubleClass myDouble = new MyDoubleClass(3.14);
		MyCharacterClass myChar = new MyCharacterClass('@');
		MyStringClass myString = new MyStringClass("Hello");
		**/
		
		// instead of doing above, do this instead
		
		MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
		MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,1.01);
		MyGenericClass<Character,Character> myChar = new MyGenericClass<>('@','$');
		MyGenericClass<String,Character> myString = new MyGenericClass<>("Hello",'!');
		
		// this uses generic class
		ArrayList<String> myFriends = new ArrayList<>();
		
		// another example
		HashMap<Integer,String> user = new HashMap<>();
		
		System.out.println(myInt.getValue2());
		System.out.println(myDouble.getValue2());
		System.out.println(myChar.getValue2());
		System.out.println(myString.getValue2());
		
		/*
		 * Bounded types = you can create objects of a generic class to have data
		 * 				   of specific derived types ex: Number 
		 * Number is the number class which contains Integer, Double, Long etc.
		 */
		// to use it: -
		// public class MyGenericClass <T1 extends Number,T2 extends Number> {    }
	
	}

}
