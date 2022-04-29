import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
/*1*/	// instead of string we will use "Integer" not int is changing the data-type of array-list
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		
		System.out.println(color + "\n");
		
		
		
		// here instead of using color.length which we usually use for other, we will use color.size()
		for (int i=0; i<color.size(); i++) {
			System.out.println(color.get(i));
		}
		System.out.println();
		
		// to set another value
		color.set(0, "Orange");
		for (int i=0; i<color.size(); i++) {
			System.out.println(color.get(i));
		}
		System.out.println();

		// to remove a value;
		color.remove(1);
		for (int i=0; i<color.size(); i++) {
			System.out.println(color.get(i));
		}
		
		// to clear the list
		color.clear();		
		
	}
	
}
