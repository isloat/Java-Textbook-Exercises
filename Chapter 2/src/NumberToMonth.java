import java.util.Scanner;

public class NumberToMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 and 12: ");
		int monthNumber = input.nextInt();
		
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
		
		monthNumber--;
		monthNumber = monthNumber * 10;
		
		System.out.println("The month you have chosen is "  + monthString.substring(monthNumber, monthNumber + 9));
	}
}
