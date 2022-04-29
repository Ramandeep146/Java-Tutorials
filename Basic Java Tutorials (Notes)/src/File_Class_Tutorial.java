import java.io.File;

public class File_Class_Tutorial {
	
	public static void main(String[] args) {
		
		// file = An abstract representation of file and directory pathnames
		
		// important to include file extension if it has one
		File file = new File("secret_message.txt");

/*1*/   // to check if it exists within the project
		if(file.exists()) {
			System.out.println("That file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			// to check if its a file, not a folder
			System.out.println(file.isFile());
			
			// to delete the file: 
			// file.delete();
		}
		else {
			System.out.println("That file doesn't exist");
		}
		
/*2*/	// to check if it exists in another location,	
		// type in the full address of the path i.e.,
		// C:\\Users\\Asus\\Desktop\\secret_message.txt
		// be sure to change \ with \\ because thats an escape sequence
		// you can also use / instead of \ if you want
		
	}

}
