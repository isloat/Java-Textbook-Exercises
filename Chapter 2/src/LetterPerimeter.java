
public class LetterPerimeter {
	public static void main(String[] args) {
		final double MILLIMETER_CONVERSION = 25.4;
		final double LETTER_WIDTH = 8.5;
		final double LETTER_LENGTH = 11;
		
		double mmWidth = LETTER_WIDTH * MILLIMETER_CONVERSION;
		double mmLength = LETTER_LENGTH * MILLIMETER_CONVERSION;
		double letterPerimeter = (mmWidth * 2) + (mmLength * 2);
		double letterDiagonal = Math.sqrt((mmWidth * mmWidth) + (mmLength * mmLength));
		
		System.out.printf("The perimeter of a letter-sized sheet of paper is %.1f", letterPerimeter);
		System.out.println(" millimeters in length.");
		System.out.printf("The diagonal of a letter-sized sheet of paper is %.1f", letterDiagonal);
		System.out.println(" millimeters long.");
	}
}
