import java.util.Scanner;
import java.util.Random;

public class WordScrambler {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String word = "";
		
		do {
			System.out.print("Enter the word you would like scrambled. Enter 'Done' to finish: ");
			word = input.next();
			System.out.println(scramble(word));
		} while (!word.equals("Done"));
	}
	
	public static String scramble(String word) {
		Random random = new Random();
		String scrambledWord = word;
		
		int i = 0;
		while (i == 0 || i == word.length() - 1) { // a number that is not the first or last character
			i = random.nextInt(word.length());
		}
		
		int j = i;
		while (j == i || j == 0 || j == word.length() - 1) { // a number that is not the first/last or i
			j = random.nextInt(word.length()); 
		}
		
		String temp = scrambledWord.substring(i, i + 1);
		scrambledWord = scrambledWord.substring(0, i) + scrambledWord.substring(j, j + 1) + scrambledWord.substring(i + 1, word.length());
		scrambledWord = scrambledWord.substring(0, j) + temp + scrambledWord.substring(j + 1, word.length());
		
		return scrambledWord;
	}
}
