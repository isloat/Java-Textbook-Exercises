import java.util.Scanner;

public class PhoneNumberConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a ten-digit phone number: ");
		String phoneNumber = input.next();
		
		String formattedNumber = "(" + phoneNumber.substring(0, 3) + ")";
		formattedNumber = formattedNumber + " " + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10);
		System.out.println("The formatted number is: " + formattedNumber + ".");
	}
}
