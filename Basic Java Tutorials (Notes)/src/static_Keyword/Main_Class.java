package static_Keyword;

public class Main_Class {

	public static void main(String[] args) {

//		 The keyword static indicates that the particular member belongs to a type itself, rather than to an instance of that type.
//		 if a field is declared static, then exactly a single copy of that field is created and shared among all instances of that class.

//       static: modifier. A single copy of a variable/method is created and shared.
//                         The class "owns" the static member

/*  Reasons to use static field: - 
    1. When the value of variable is independent of objects
    2. When the value is supposed to be shared across all objects
*/		
		
		
		Friends friend1 = new Friends("Raman");
		Friends friend2 = new Friends("Simran");
		Friends friend3 = new Friends("Simran di massi");
		Friends friend4 = new Friends("Simran di bhua");
		
		Friends.displayFriends();
		System.out.println(friend1.name + " - " + friend1.number);
		System.out.println(friend2.name + " - " + friend2.number);
		System.out.println(friend3.name + " - " + friend3.number);
		System.out.println(friend4.name + " - " + friend4.number + "\n");
		
		// we can use object as well like: friend1.numberoffriends or friend4.numberoffriends
		// but its not recomended, it will show warning		
		// fun fact - round method of math class is also static
		
		
		
		
		// extra testing
		friend1 = new Friends("Simran");
		friend2 = new Friends("Raman");
		friend3.name = "Simran di bhua";
		friend4.name = "Simran di massi";
		Friends.displayFriends();
		System.out.println(friend1.name + " - " + friend1.number);
		System.out.println(friend2.name + " - " + friend2.number);
		System.out.println(friend3.name + " - " + friend3.number);
		System.out.println(friend4.name + " - " + friend4.number);

	}

}
