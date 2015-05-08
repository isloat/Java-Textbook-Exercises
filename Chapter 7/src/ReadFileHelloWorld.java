import java.io.*;
import java.util.*;

/*
 * This program will execute the following basic tasks:
 * 	Open a file with the filename "hello.txt"
 * 	Store the message "Hello, World!" in the file.
 * 	Close the file.
 * 	Open that same file.
 * 	Read the message into a string and print.
 */
public class ReadFileHelloWorld {
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "hello.txt";
		
		writeToFile(filename);
		printFileContents(filename);
	}
	
	public static void writeToFile(String filename) {
		try (PrintWriter outputFile = new PrintWriter(filename)) {
			outputFile.println("Hello, World!");
		} catch (FileNotFoundException exception) {
			System.out.println("Could not find the file.");
		}
	}
	
	public static void printFileContents(String filename) throws FileNotFoundException {
		Scanner input = new Scanner(new File(filename));
		
		String contents = input.nextLine();
		input.close();
		
		System.out.println(contents);
	}
}
