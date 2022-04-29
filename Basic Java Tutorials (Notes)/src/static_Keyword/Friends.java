package static_Keyword;

public class Friends {
	
	String name;
	//static variable
	static int numberoffriends;
    int number=0;
	
	Friends (String name){
		
		this.name = name;
		numberoffriends++;
		this.number++;		
	}
	
	// static method
	static void displayFriends() {
		System.out.println("You have " + numberoffriends + " friends.");
	}

}
