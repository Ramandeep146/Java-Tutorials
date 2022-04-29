import java.io.FileWriter;
import java.io.IOException;

public class File_Writer_Tutorial {
	
	public static void main(String[] args) {
		
		// it is important to use try and catch, as its auto generated below
			try {
				// create instance of a file writer
				FileWriter writer = new FileWriter("secret_message.txt");
				
				writer.write("Roses are red. \nViolets are blue. \nBest rocking thing. \nHulalalala");
				// this will add a string at the end of your file
				writer.append("\n(A poem by Raman)");
				writer.close();
			
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
