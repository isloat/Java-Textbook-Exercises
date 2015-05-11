import java.io.*;
import java.util.*;

/* This program will replace each line of a file with its reverse.
 */
public class WordReverser {
	public static void main(String[] args) throws FileNotFoundException {
		String filename;
		
		if (args.length == 1) {
			filename = args[0];
		} else {
			System.out.print("Enter filename: ");
			Scanner input = new Scanner(System.in);
			filename = input.next();
			input.close();
		}
		
		Scanner readFile = new Scanner(new File(filename));
		ArrayList<String> line = new ArrayList<String>();
	
		while (readFile.hasNextLine()) {
			String lines = readFile.nextLine();
			line.add(reverse(lines));
		}
		readFile.close();
		
		PrintWriter writeFile = new PrintWriter(new File(filename));
		int size = line.size();
		
		for (int i = 0; i < size; i++) {
			writeFile.println(line.get(i));
		}
		writeFile.close();
	}
	
	public static String reverse(String line) {
		return new StringBuilder(line).reverse().toString();
	}
}
