package super_Keyword;

public class Hero extends Person{
	
	String power;
	
	Hero(String name, int age, String power){
		
		// The word super refers to the parent class Person
		// To refer to the constructor type super()
		super(name,age);
		this.power = power;
		
		// We can use this.name and this.age but we should really Assign these 
		// values within the constructor of the parent class
		// Because power is declared within this class but the name and age are declared in the Person class
			
	}
	
	@Override
	public String toString() {
		return super.toString() + this.power;
	}

}
