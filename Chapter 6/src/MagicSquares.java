import java.util.*;

/* This program will read in a certain amount of inputs from the user
 * then test whether or not these inputs validate to a Magic Square.
 * 
 * A Magic Square is a n x n matrix filled with the numbers 1 ... n^2, 
 * where the sum of each row, column, and both diagonals are the same value.
 * 
 * Potential improvements: Input validation
 */
public class MagicSquares {
	static final int MATRIX_SIDE = 4;
	static final int SQUARE_SIZE = (int) Math.pow(MATRIX_SIDE, 2);
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] square = new int[MATRIX_SIDE][MATRIX_SIDE];
		
		System.out.println("Enter " + SQUARE_SIZE + " integers to create a " + MATRIX_SIDE + "x" + MATRIX_SIDE + " square: ");
		
		for (int i = 0; i < MATRIX_SIDE; i++) { // get the values
			for (int j = 0; j < MATRIX_SIDE; j++) {
				square[i][j] = input.nextInt();
			}
		}
		
		System.out.println();
		for (int i = 0; i < MATRIX_SIDE; i++) { // draw the square
			for (int j = 0; j < MATRIX_SIDE; j++) {
				System.out.print(square[i][j] + " ");
			}
			
			System.out.println();
		}
		
		if (isMagicSquare(square)) { // validate
			System.out.println("\nThis is a magic square.");
		} else {
			System.out.println("\nThis is not a magic square.");
		}
	}
	
	public static boolean isMagicSquare(int[][] square) { // See if it's actually a magic square
		if (!validRange(square)) return false;
		
		int baseSum = slashSum(square);
		
		if (baseSum != backslashSum(square)) return false;
		
		for (int i = 0; i < MATRIX_SIDE; i++) {
			if (baseSum != rowSum(square, i)) return false;
			if (baseSum != columnSum(square, i)) return false;
		}
		
		return true;
	}
	
	public static boolean validRange(int[][] square) { // check that 1 ... squareSize exists in the array
		for (int i = 0; i < MATRIX_SIDE; i++) {
			for (int j = 0; j < MATRIX_SIDE; j++) {
				int number = square[i][j];
				boolean[] alreadySeen = new boolean[SQUARE_SIZE]; // array of length square_size -- if we see a number, we mark corresponding position TRUE
				
				if (number < 1 || number > SQUARE_SIZE) { // if outside bounds, not a magic square
					return false;
				} else if (alreadySeen[number - 1]) { // if we've already seen this number, it's a duplicate and not a magic square
					return false; 
				} else { // mark this number seen in the boolean array
					alreadySeen[number - 1] = true;
				}
			}
		}
		
		return true;
	}
	
	public static int rowSum(int[][] square, int row) {
		int sum = 0;
		
		for (int i = 0; i < MATRIX_SIDE; i++) {
			sum += square[row][i];
		}
		
		return sum;
	}
	
	public static int columnSum(int[][] square, int column) {
		int sum = 0;
		
		for (int i = 0; i < MATRIX_SIDE; i++) {
			sum += square[i][column];
		}
		
		return sum;
	}
	
	public static int backslashSum(int[][] square) { // \
		int sum = 0;
		
		for (int i = 0; i < MATRIX_SIDE; i++) {
			sum += square[i][i];
		}
		
		return sum;
	}
	
	public static int slashSum(int[][] square) { // /
		int sum = 0;
		
		for (int i = 0; i < MATRIX_SIDE; i++) {
			sum += square[i][MATRIX_SIDE - i - 1];
		}
		
		return sum;
	}
}
