import java.util.Scanner;

public class FindSubstring {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the word to be searched: ");
		String word = input.next();
		System.out.print("Enter the string to search for: ");
		String match = input.next();
		
		if (findMatch(word, match)) {
			System.out.println(match + " is contained in " + word + "!");
		} else {
			System.out.println(word + " does not contain " + match + ".");
		}
	}
	
	public static boolean findMatch(String word, String match) {
		if (match.length() > word.length()) return false; // by definition a word cannot contain a string longer than it is
		
		if (word.substring(0, match.length()).equalsIgnoreCase(match)) { // if the first part of the word == match, it contains match
			return true;
		} else { // else recurse and get rid of the first letter
			return findMatch(word.substring(1, word.length()), match);
		}
	}
}
