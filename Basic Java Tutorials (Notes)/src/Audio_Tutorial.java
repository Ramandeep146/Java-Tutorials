import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Audio_Tutorial {
	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("pokemon.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		String response = "";
		
		// It will terminate as it starts playing in the background thread
		// our program does not wait for the background thread so it will terminate
		// as soon as it runs out of code, it will terminate
		// clip.start();
		
		// since the program will wait for the user input, the audio will play
		// response = scanner.next();
		
		
		while (!response.equals("Q")){
			System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
			System.out.println("Enter your choice: ");
			
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
				case ("P"): clip.start();
				break;
				case ("S"): clip.stop();
				break;
				case ("R"): clip.setMicrosecondPosition(0);
				break;
				case ("Q"): clip.close();
				break;
				default: System.out.println("Not a valid choice!");
			}
			
		}
		
		scanner.close();
		
		System.out.println("Byeee");
		
	}
	
}
