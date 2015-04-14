import java.util.Scanner;

public class EasterCalculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the current year: ");
		int currentYear = input.nextInt();
		
		// the following is Carl Friedrich Gauss's equation for calculating the date on which Easter falls
		int a = currentYear % 19; 
		int b = currentYear / 100;
		int c = currentYear % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;
		
		String monthString = "January   " // Each month is a length of 10, so 0 to 9 is January, 10 to 19 is February, and so on
				+ "February  "
				+ "March     "
				+ "April     "
				+ "May       "
				+ "June      "
				+ "July      "
				+ "August    "
				+ "September "
				+ "October   "
				+ "November  "
				+ "December  ";
		
		int monthNumber = n;
		monthNumber--;
		monthNumber = monthNumber * 10;
		
		System.out.println("In " + currentYear + ", Easter Sunday will be on " + monthString.substring(monthNumber, monthNumber + 9) + p + ".");
	}
}
