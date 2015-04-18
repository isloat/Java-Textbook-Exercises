import java.util.Scanner;

public class SubstringSplice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = input.next();
		
		int length = word.length();
		
		for (int i = 1; i <= length; i++) {
			for (int j = 0; i + j <= length; j++) {
				if ("".equals(word.substring(j, i + j))) {
					continue;
				}
				
				System.out.println(word.substring(j, i + j));
			}
		}
	}
}
