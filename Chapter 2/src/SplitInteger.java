import java.util.Scanner;

public class SplitInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		String integer = input.next();
		String splitInteger = "";
		
		int n = integer.length();
		for (int i = 0; i < n; i++) {
			splitInteger = splitInteger + integer.substring(i, i + 1);
			splitInteger = splitInteger + " ";
		}
		
		System.out.println(splitInteger);
	}
}