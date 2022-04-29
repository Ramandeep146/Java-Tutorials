import java.util.ArrayList;

public class Array_List_2D {
	
	public static void main (String[] args) {
		
		ArrayList<ArrayList<String>> grocerylist = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakery = new ArrayList<String>();
		bakery.add("Bread");
		bakery.add("Donuts");
		bakery.add("Cake");
		
		ArrayList<String> vegies = new ArrayList<String>();
		vegies.add("Tomatoes");
		vegies.add("Potaoes");
		vegies.add("Spinach");
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("Milk");
		drinks.add("Juice");
		drinks.add("Cola");
		
		// now we add everything to grocery list
		grocerylist.add(bakery);
		grocerylist.add(vegies);
		grocerylist.add(drinks);
		
		System.out.println(grocerylist);
		System.out.println(grocerylist.get(0));
		System.out.println(grocerylist.get(0).get(0));
		System.out.println();
		
		
/*Extra*/// for each loop, i will get all the string values for the grocerylist.get(2)
		for(String i: grocerylist.get(2)) {
			System.out.println(i);
		}
		
	}
	
}
