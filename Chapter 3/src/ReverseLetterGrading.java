import java.util.Scanner;

public class ReverseLetterGrading {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 4: ");
		double grade = input.nextDouble();
		String letter = "error";
		
		// A = 3.85+ 
		// A- = 3.5 to 3.84
		// B+ = 3.15 to 3.49
		// B = 2.85 to 3.14
		// B- = 2.5 to 2.84
		// C+ = 2.15 to 2.49
		// C = 1.85 to 2.14
		// C- = 1.5 to 1.84
		// D+ = 1.15 to 1.49
		// D = .85 to 1.14
		// D- = .5 to .84
		// F+ = .15 to .49
		// F = .14-
		
		if (grade >= 3.85) {
			letter = "A";
		} else if (grade >= 3.5) {
			letter = "A-";
		} else if (grade >= 3.15) {
			letter = "B+";
		} else if (grade >= 2.85) {
			letter = "B";
		} else if (grade >= 2.5) {
			letter = "B-";
		} else if (grade >= 2.15) {
			letter = "C+";
		} else if (grade >= 1.85) {
			letter = "C";
		} else if (grade >= 1.5) {
			letter = "C-";
		} else if (grade >= 1.15) {
			letter = "D+";
		} else if (grade >= .85) {
			letter = "D";
		} else if (grade >= .5) {
			letter = "D-";
		} else if (grade >= .15) {
			letter = "F+";
		} else {
			letter = "F";
		}
		
		System.out.println("Your grade is " + letter + ".");
	}
}
