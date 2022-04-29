import java.util.Scanner;

public class Arrays_Tutorial {

	public static void main(String[] args) {
		
/*1*/	// Scan an array and print its values
		String[] names = new String[5];
		
		Scanner myObj = new Scanner(System.in);
		
		for (int i=0;i<names.length;i++) {
			names[i] = myObj.nextLine();
		}
		
		for (int i=0;i<5;i++) {
		    System.out.println(names[i]);
		}
		
		System.out.println();
		
     	// Another way to store values in Array
		String[] games = {"Skyrim", "Dark", "Mario"};
		for (int i=0; i<3; i++) {
			System.out.println(games[i]);
		}
		
		System.out.println();
		

/*2*/   // 2D arrays
		String[][] alphabets = new String[3][3];
		
		for (int i=0; i<alphabets.length ; i++) {
			for (int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = myObj.next();
			}
		}
		
		for (int i=0; i<3 ; i++) {
			for (int j=0; j<3; j++) {
				System.out.printf("%s ", alphabets[i][j]);
			}
			System.out.println();
		}
		
        // 2D arrays can also be assigned as
		String[][] alpha = {{"A","B","C"},
				            {"D","E","F"},
				            {"G","H","I"}};
		
		for (int i=0; i<3 ; i++) {
			for (int j=0; j<3; j++) {
				System.out.printf("%s ", alpha[i][j]);
			}
			System.out.println();
		}
		
		myObj.close();

	}

}
