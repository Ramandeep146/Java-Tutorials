package objects;

public class Array_of_Objects {

	public static void main(String[] args) {

/**/    // General way of creating arrays
		int[] numbers = new int[5]; 
		numbers[0] = 1;
		
		
		// Making array of objects
		Human[] humans = new Human[3];
		
		Human human1 = new Human("Raman", 21, 55.00);
		Human human2 = new Human("Simran", 21, 45.00);
		Human human3 = new Human("Simran di massi", 55, 82.00);
		
		
		humans[0] = human1;
		humans[1] = human2;
		humans[2] = human3;
		
		System.out.println(humans[0].name);
		System.out.println(humans[1].name);

/**/    // Another way of assigning values
        Human[] HUMANS = {human1,human2,human3}; 
		
        System.out.println(HUMANS[2].name);

	}

}
