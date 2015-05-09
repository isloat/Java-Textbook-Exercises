import java.io.*;
import java.util.*;

/* 
 * This program will prompt the user for a filename. 
 * Then it will print the number of characters, words, and lines in that file.
 */

public class FileCount {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the filename to read from: ");
		String filename = input.next();
		input.close();
		
		int charCount = countChar(filename);
		int lineCount = countLine(filename);
		int wordCount = countWord(filename);
		
		System.out.println("In the file " + filename + ", there are: ");
		System.out.println(charCount + " characters,");
		System.out.println(lineCount + " lines,");
		System.out.println("and " + wordCount + " words.");
	}
	
	public static int countChar(String filename) throws FileNotFoundException {
		Scanner readFile = new Scanner(new File(filename));
		int chars = 0;
		
		while (readFile.hasNextLine()) {
			String line = readFile.nextLine();
			chars += line.trim().length();
		}
		
		readFile.close();
		
		return chars;
	}
	
	public static int countLine(String filename) throws FileNotFoundException {
		Scanner readFile = new Scanner(new File(filename));
		int lines = 0;
		
		while (readFile.hasNextLine()) {
			String line = readFile.nextLine();
			lines++;
		}
		
		readFile.close();
		
		return lines;
	}
	
	public static int countWord(String filename) throws FileNotFoundException {
		Scanner readFile = new Scanner(new File(filename));
		int words = 0;
		
		while (readFile.hasNext()) {
			String line = readFile.next();
			words++;
		}
		
		readFile.close();
		
		return words;
	}
}
