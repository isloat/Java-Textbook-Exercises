import java.io.*;
import java.util.*;

/* This program will read a file. It will reverse the line order and 
 * write that to a new file.
 * 
 * 		A
 * 		B
 * 		C
 * 		D
 * 
 * 		becomes:
 * 
 * 		D
 * 		C
 * 		B
 * 		A
 */
public class NewFileReverse {
	public static void main(String[] args) throws FileNotFoundException {
		String inputFile;
		String outputFile;
		
		if (args.length == 2) {
			inputFile = args[0];
			outputFile = args[1];
		} else {
			System.out.print("Enter filename: ");
			Scanner input = new Scanner(System.in);
			inputFile = input.next();
			System.out.print("Enter filename to write to: ");
			outputFile = input.next();
			input.close();
		}
		
		Scanner readFile = new Scanner(new File(inputFile));
		ArrayList<String> line = new ArrayList<String>();
	
		while (readFile.hasNextLine()) {
			line.add(readFile.nextLine());
		}
		readFile.close();
		
		PrintWriter writeFile = new PrintWriter(new File(outputFile));
		int size = line.size();
		
		for (int i = size - 1; i >= 0; i--) {
			writeFile.println(line.get(i));
		}
		writeFile.close();
	}
}
