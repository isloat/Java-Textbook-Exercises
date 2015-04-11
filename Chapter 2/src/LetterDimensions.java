
public class LetterDimensions {
	public static void main(String[] args) {
		final double MILLIMETER_CONVERSION = 25.4;
		final double LETTER_WIDTH = 8.5;
		final double LETTER_LENGTH = 11;
		
		double mmWidth = LETTER_WIDTH * MILLIMETER_CONVERSION;
		double mmLength = LETTER_LENGTH * MILLIMETER_CONVERSION;
		
		System.out.printf("The dimensions of a letter-sized sheet of paper are %.1f", mmWidth);
		System.out.printf(" millimeters by %.1f", mmLength);
		System.out.print(" millimeters.");
	}
}
