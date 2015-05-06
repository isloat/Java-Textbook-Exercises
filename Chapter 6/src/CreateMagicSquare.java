import java.util.*;

/*
 * This program implements an algorithm that will create a magic square if n is odd.
 * 
 * The algorithm is as follows:
 * 
 * Set row = n - 1 and column = n / 2.
 * for i = 1 ... n*n:
 * 		Place i at [row][column].
 * 		Increment row and column.
 * 		If the row or column == n, replace with 0.
 * 		If the element at [row][column] has already been filled:
 * 			Set row and column to previous values.
 * 			Decrement row.
 */
public class CreateMagicSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		
		while (n <= 0 && n % 2 == 0) {
			System.out.print("Enter the length n of your magic square. n must be odd. ");
			n = input.nextInt();
		}
		
		int[][] square = new int[n][n];
		
		square = createSquare(n);
		drawSquare(square, n);
	}
	
	public static int[][] createSquare(int n) {
		int row = n - 1;
		int prevRow = -1;
		int column = n / 2;
		int prevColumn = -1;
		int[][] square = new int[n][n];
		boolean[][] filled = new boolean[n][n];
		
		for (int i = 1; i <= n * n; i++) { // for k = 1 ... n * n;
			square[row][column] = i; // place i at [row][column]
			filled[row][column] = true; // mark as seen 
			
			prevRow = row;
			row++; // increment row
			prevColumn = column;
			column++; // increment column
			
			if (row == n) row = 0; // if == n, replace with 0
			if (column == n) column = 0;
			
			if (filled[row][column]) { // if already filled, prevRow and prevColumn, decrement row
				row = prevRow;
				column = prevColumn;
				row--;
			}
		}
		
		return square;
	}
	
	public static void drawSquare(int[][] square, int n) {
		System.out.println();
		
		for (int i = 0; i < n; i++) { // draw the square
			for (int j = 0; j < n; j++) {
				System.out.print(square[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
