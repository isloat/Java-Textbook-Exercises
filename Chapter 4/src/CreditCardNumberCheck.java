import java.util.Scanner;

public class CreditCardNumberCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an eight-digit number: ");
		int number = input.nextInt();
		int numberLength = (int) (Math.floor(Math.log10(Math.abs(number))) + 1);
		
		while (numberLength != 8) {
			System.out.print("You must enter an eight-digit number: ");
			number = input.nextInt();
			numberLength = (int) (Math.floor(Math.log10(Math.abs(number))) + 1);
		}
		
		int sumEven = 0; // adds all even digits from rightmost -- nb positions 1, 3, 5, 7
		int sumOdd = 0; // adds all odd digits from rightmost -- this includes the check digit -- nb, positions 0, 2, 4, 6
		int oddDouble = 0;
		int checkDigit = number % 10;
		boolean isValid = false;
				
		for (int i = 0; i < 8; i += 2) {
			sumEven += (number % (Math.pow(10, i + 1))) / Math.pow(10, i); // Add the digit
		}
		
		for (int i = 0; i < 8; i += 2) {
			oddDouble = 2 * ((int) ((number % (Math.pow(10, i + 2))) / Math.pow(10, i + 1))); // Take the digit and double it
			sumOdd += oddDouble % 10; // Add the ones digit
			sumOdd += (oddDouble - (oddDouble % 10)) / 10; // Add the tens digit
		}
		
		int finalDigit = (sumEven + sumOdd) % 10; // check final digit of the total sum -- if it's 0, pass. If not, test for what the checkDigit needs to be.
		
		if (finalDigit == 0) {
			isValid = true;
		} else {
			isValid = false;
			
			int digitChange = Math.abs(finalDigit - checkDigit);
			
			if (checkDigit + digitChange > 9) {
				checkDigit -= finalDigit;
			} else {
				checkDigit += 10 - finalDigit;
			}
		}
		
		if (isValid) {
			System.out.println("Your credit card number is valid!");
		} else {
			System.out.println("Your credit card number is not valid. Your check digit needs to be " + checkDigit + " to be valid.");
		}
	}
}
