import java.util.Scanner;

public class LetterGrading {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your letter grade: ");
		String grade = input.next();
		
		String letter = grade.substring(0, 1);
		String plus = "x";
		
		if (grade.length() == 2) {
			plus = grade.substring(1, 2);
		}

		double value = 0;
		
		if (letter.equals("A")) {
			value = 4;
		} else if (letter.equals("B")) {
			value = 3;
		} else if (letter.equals("C")) {
			value = 2;
		} else if (letter.equals("D")) {
			value = 1;
		} else if (letter.equals("F")) {
			value = 0;
		}
		
		if (plus.equals("+")) {
			value = value + 0.3;
		} else if (plus.equals("-")) {
			value = value - 0.3;
		}
		
		if (value > 4) {
			value = 4;
		} else if (value < 0) {
			value = 0;
		}
		
		System.out.println("The numeric value of your grade is " + value + ".");
		
	}
}
