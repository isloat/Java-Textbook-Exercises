import java.util.Scanner;
import java.util.Random;

public class WordScrambler {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		
		String scramble = word;  // keep original word intact for output
		String first = ""; // part of word before rand1
		String middle = ""; // part of word between rand1 and rand2
		String last = ""; // part of word after rand2
		
		int length = word.length();
		int j = 0;
		int k = 0;
		
		for (int i = 0; i < length - 1; i++) {
			j = random.nextInt(length - 1); // generates a random position in the word that is not the last position
			k = random.nextInt(length - 1 - j) + 1 + j; // generates a random position that is greater than j
			
			first = scramble.substring(0, j);
			middle = scramble.substring(j + 1, k);
			last = scramble.substring(k + 1, length);
			
			scramble = first + scramble.charAt(k) + middle + scramble.charAt(j) + last;
		}
		
		System.out.println(word + " has been scrambled into " + scramble + ".");
	}
}
