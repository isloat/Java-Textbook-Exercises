import java.util.Scanner;

public class StringSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three strings: ");
		String word1 = input.next();
		String word2 = input.next();
		String word3 = input.next();
		String dummy;
		
		if (word1.compareTo(word2) > 0) { // If 1 comes after 2, swap 1 and 2.
			dummy = word2;
			word2 = word1;
			word1 = dummy;
		}
		
		if (word1.compareTo(word3) > 0) { // If 1 comes after 3, swap 1 and 3. 
			dummy = word3;
			word3 = word1;
			word1 = dummy;
		}
		
		if (word2.compareTo(word3) > 0) { // If 2 comes after 3, swap 2 and 3. 
			dummy = word3;
			word3 = word2;
			word2 = dummy;
		}
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}
}
