import java.io.*;
import java.util.*;

/*
 * This program will read a file of user choice and print all lines
 * in that file to a new file. While printing over the lines, it will add 
 * numbering to each line.
 * 
 * This program is capable of accepting command line input.
 */
public class CmdAddLineNumbers {
	static int lineNumber = 1;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		String filenameRead;
		String filenameWrite;
		
		if (args.length == 2) {
			filenameRead = args[0];
			filenameWrite = args[1];
		} else {
			System.out.print("Input filename to read: ");
			filenameRead = input.next();
			System.out.print("Input filename to write to: ");
			filenameWrite = input.next();
		}
		
		input.close();
		
		File fileRead = new File(filenameRead);
		Scanner fileIn = new Scanner(fileRead);
		PrintWriter fileOut = new PrintWriter(filenameWrite);
		
		while (fileIn.hasNextLine()) {
			String line = fileIn.nextLine();
			System.out.println(line);
			writeLine(line, fileOut);
		}
		
		fileIn.close();
		fileOut.close();
	}
	
	public static void writeLine(String line, PrintWriter fileOut) {
		fileOut.println(String.format("/* %d */ %s", lineNumber, line));
		lineNumber += 1;
	}
}
