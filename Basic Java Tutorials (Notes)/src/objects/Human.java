package objects;

public class Human {
	
	String name;
	int age;
	double weight;
	
	
	//A constructor
	Human(String name,int age, double weight){
		
		// here, 'this' keyword is necessary
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	void eat() {
		// here 'this' is not necessary but should be used to avoid confusion
		System.out.println (this.name + " is eating.");
	}
	
	void drink() {
		System.out.println(this.name + " is drinking.");
	}

}
