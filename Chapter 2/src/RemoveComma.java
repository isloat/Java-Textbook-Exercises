import java.util.Scanner;

public class RemoveComma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 1,000 and 999,999: ");
		String commaNumber = input.next();
		int n = commaNumber.length();
		commaNumber = commaNumber.substring(0, n - 4) + commaNumber.substring(n - 3, n);
		
		System.out.println("Your number is " + commaNumber);
	}
}
