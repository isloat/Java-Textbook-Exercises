import java.util.Scanner;

public class AddComma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 1000 and 999999. Do not use a comma: ");
		String commaNumber = input.next();
		int n = commaNumber.length();
		commaNumber = commaNumber.substring(0, n - 3) + "," + commaNumber.substring(n - 3, n);
		
		System.out.println("Your number is " + commaNumber);
	}
}
