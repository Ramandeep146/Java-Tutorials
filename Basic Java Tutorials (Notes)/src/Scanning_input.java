import java.util.Scanner;

public class Scanning_input {

	public static void main(String[] args) {
		
        Scanner myObj = new Scanner(System.in);
		
		//myObj.method by which . . .
		String s = myObj.next();
		
		boolean tf = myObj.hasNextLine(); // To check if there is next line to scan or not
		
		String name = "";
		boolean check = name.isBlank(); //To check if the string contains something (here, true)
		
		System.out.println(s + tf + check);

		myObj.close();
		
	}

}
