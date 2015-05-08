import java.util.*;
import java.io.*;

/*
 * This will read a file containing two columns of float numbers.
 * It will compute the average of each column.
 */
public class FileColumnAverages {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.print("Read from which file?: ");
		String fileToRead = input.next();
		input.close();
		
		Scanner fileInput = new Scanner(new File(fileToRead));
		
		double totalA = 0;
		double totalB = 0;
		int numberA = 0;
		int numberB = 0;
		
		while (fileInput.hasNext()) {
			String[] line = fileInput.nextLine().split("\\s+");
			totalA = Double.parseDouble(line[0]);
			totalB = Double.parseDouble(line[1]);
			numberA++;
			numberB++;
		}
		fileInput.close();

		double averageA = totalA / numberA;
		double averageB = totalB / numberB;
		
		System.out.println("Average of the first column: " + averageA);
		System.out.println("Average of the second column: " + averageB);
	}
}
