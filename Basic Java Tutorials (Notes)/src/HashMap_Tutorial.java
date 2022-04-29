import java.util.HashMap;

public class HashMap_Tutorial {

	public static void main(String[] args) {
		
				// HashMap implements the Map interface (need import)
				// HashMap is similar to ArrayList, but with key-value pairs
				// stores objects, need to use Wrapper Class like String, Integer, Double etc.
				// example: (name, email), (user name, userID), (country, capital)
				
				HashMap<String,String> countries = new HashMap<String,String>();
				
				// add a key and value
				countries.put("USA", "Washington DC");
				countries.put("India","New Delhi");
				countries.put("Russia", "Moscow");
				countries.put("China","Beijing");
				
				System.out.println(countries);
				
				// remove a key and a value from the HashMap
				countries.remove("USA");
				System.out.println(countries);
				
				// return the value associated with the key
				System.out.println(countries.get("Russia"));
				
				// to clear everything in the HashMap
				//countries.clear();
				//System.out.println(countries);
				
				// Display the size of HashMap
				System.out.println(countries.size());
				
				// Replace the value associated with a key
				countries.replace("India", "Mumbai");
				System.out.println(countries);
				
				// If the input is a key in our HashMap, it will return true, else false
				System.out.println(countries.containsKey("England"));
				
				// same is for this, but value instead of key
				System.out.println(countries.containsValue("Beijing"));
				
				// decent way to display HashMap
				for(String i : countries.keySet()) {
					System.out.print(i + " ");
					System.out.print(countries.get(i) + " : ");
				}

	}

}
