import java.io.*;
import java.util.*;


/* This program will search all files specified on the command line. 
 * It will print out all lines that contain the specified word.
 * The specified word is always the first command line argument.
 */

public class FileSearch {
	public static String word;
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> filenames = new ArrayList<String>();
		
		if (args.length >= 2) {
			word = args[0];
			
			for (int i = 1; i < args.length; i++) {
				filenames.add(args[i]);
			}
			
			System.out.println(filenames.toString());
		}
		
		for (int i = 0; i < filenames.size(); i++) {
			search(filenames.get(i));
		}
	}
	
	public static void search(String filename) throws FileNotFoundException {
		String output = "";
		Scanner readFile = new Scanner(new File(filename));
		
		while (readFile.hasNextLine()) {
			String[] line = readFile.nextLine().split("\\s+");
			
			if (Arrays.asList(line).contains(word)) {
				if (output.length() < 1) {
					output = String.format("%s: %s", filename, line);
				} else {
					output += " " + line;
				}
			}
		}
		
		readFile.close();
		System.out.println(output);
	}

}
