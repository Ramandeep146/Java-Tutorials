
public class String_Methods {

	public static void main(String[] args) {
	
		String name = "Raman";
		
/*1*/	boolean c1 = name.equals("Raman"); // equals method is same as == (true)
        boolean c2 = name.equals("raman"); // (false)
        boolean c3 = name.equalsIgnoreCase("rAMaN"); //(true)
        
        System.out.println("1. " + c1 + "\n" + c2 + "\n" + c3 + "\n");
		
/*2*/    int num = name.length(); // return 5
        System.out.println("2. " + num + "\n");

/*3*/    char ch = name.charAt(0); // display R
        System.out.println("3. " + ch + "\n");

/*4*/    int i = name.indexOf("R"); // Display the position of the character in the string, here i = 0
        System.out.println("4. " + i + "\n");

/*5*/    String naam = "     ";
        boolean v1 = naam.isEmpty(); // If the string is completely empty then true
        boolean v2 = naam.isBlank(); // If the string is blank or contain only spaces then true
        System.out.println("5. " + v1 + " " + v2 + "\n");
        
/*6*/    String result = name.toUpperCase();
        String result2 = name.toLowerCase();
        System.out.println("6. " + result + " " + result2 + "\n");
        
	}

}
