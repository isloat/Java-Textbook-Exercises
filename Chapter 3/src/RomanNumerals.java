import java.util.Scanner;

public class RomanNumerals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer less than 4000: ");
		int number = input.nextInt();
		String roman = "";
		
		if (number >= 4000 || number <= 0) {
			System.out.println("You have entered an incompatible number. Try again.");
		} else {
			while (number >= 1000) {
				roman += "M";
				number -= 1000;
			}
			
			if (number >= 900) {
				roman += "CM";
				number -= 900;
			}
			
			if (number >= 500) {
				roman += "D";
				number -= 500;
			}
			
			if (number >= 400) {
				roman += "CD";
				number -= 400;
			}
			
			while (number >= 100) {
				roman += "C";
				number -= 100;
			}
			
			if (number >= 90) {
				roman += "XC";
				number -= 90;
			}
			
			if (number >= 50) {
				roman += "L";
				number -= 50;
			}
			
			if (number >= 40) {
				roman += "XL";
				number -= 40;
			}
			
			while (number >= 10) {
				roman += "X";
				number -= 10;
			}
			
			if (number >= 9) {
				roman += "IX";
				number -= 9;
			}
			
			if (number >= 5) {
				roman += "V";
				number -= 5;
			}
			
			if (number >= 4) {
				roman += "IV";
				number -= 4;
			}
			
			while (number >= 1) {
				roman += "I";
				number -= 1;
			}
			
			System.out.println(roman);
		}
	}
}
