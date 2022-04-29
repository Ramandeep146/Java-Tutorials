package super_Keyword;

public class Main {

	public static void main(String[] args) {

	// super = keyword refers to the superclass (parent) of an object [assuming you are using inheritance]
	//         very similar to the "this" keyword
		
		
		Hero hero1 = new Hero("Batman",42,"$$$Money");
		Hero hero2 = new Hero("Superman",43,"Everything");
		
		Person person1 = new Person("Raman",21);
		Person person2 = new Person("Simran",21);
		
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);
		System.out.println(hero2.toString() + "\n");
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person2.toString());

	}

}
