package lambda;


@FunctionalInterface
public interface MyInterface {
	
	// functional interfaces contain only one abstract method
	
	public void message(String name, char symbol);
	
}
