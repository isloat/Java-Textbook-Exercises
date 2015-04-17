import java.util.Scanner;

public class StringRead {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String uppercase = "";
		String secondletter = "";
		String underscore = "";
		int vowels = 0;
		String vowelPosition = "";
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int position = 0;
		char ch = '?';
		
		while (position < str.length()) {
			ch = str.charAt(position);
			
			if (Character.isUpperCase(ch)) {
				uppercase += ch;
			}
			
			if ((position + 1) % 2 == 0 && ch != ' ') {
				secondletter += ch;
			}
			
			if ("AEIOUaeiou".indexOf(ch) != -1) {
				underscore += "_";
				vowels++;
				vowelPosition += position + " ";
			} else {
				underscore += ch;
			}
			
			position++;
		}
		
		System.out.println("The uppercase characters in the string are: " + uppercase);
		System.out.println("Every second letter of the string: " + secondletter);
		System.out.println("The string, with vowels replaced by underscores: " + underscore);
		System.out.println("There are " + vowels + " vowels in the string.");
		System.out.println("The position of vowels in the string: "  + vowelPosition);
		
	}
}
