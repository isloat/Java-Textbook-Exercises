import java.util.Scanner;

public class PalindromeRecursive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = input.next();
		
		if (isPalindrome(word)) System.out.println(word + " is a palindrome!");
		else System.out.println(word + " is not a palindrome.");
	}
	
	public static boolean isPalindrome(String word) {
		if (word.length() == 0 || word.length() == 1) return true; // by definition
		
		if (word.substring(0, 1).equalsIgnoreCase(word.substring(word.length() - 1))) { // check first and last letter
			return isPalindrome(word.substring(1, word.length() - 1)); // if match, check second and second-last, recursively
		}
		
		return false; // match not found? false
	}
}
