import java.util.*;

/*
 * 6.20: Write a method that computes the average of the neighbors of a 2D array element in eight directions.
 * 
 * However, if the element is located at the boundary of the array, only include the neighbors that are
 * inside the array. For example, if row = 0, column = 0, there are only three neighbors.
 */
public class NeighborsAverage {
	public static void main(String[] args) {
		Random random = new Random();
		final int n = 4;
		
		int[][] values = new int[n][n];
		int row = random.nextInt(n);
		int column = random.nextInt(n);
		
		System.out.println(row + " and " + column);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				values[i][j] = random.nextInt(10);
			}
		}
		
		for (int i = 0; i < n; i++) { // draw the square
			for (int j = 0; j < n; j++) {
				System.out.print(values[i][j] + " ");
			}
			
			System.out.println();
		}

		System.out.println("\nThe average value of neighbors of [" + row + ", " + column + "] is "
				+ neighborAverage(values, row, column));
	}
	
	public static double neighborAverage(int[][] values, int row, int column) {
		double average = 0;
		double sum = 0;
		int neighbors = 0;
		boolean[] directions = new boolean[8]; // 0 = north, 1 = northeast, 2 = east ... 7 = northwest
		Arrays.fill(directions, true);
		
		if (row == 0) {
			directions[5] = false;
			directions[6] = false;
			directions[7] = false;
		} else if (row == values.length - 1) {
			directions[1] = false;
			directions[2] = false;
			directions[3] = false;
		}
		
		if (column == 0) {
			directions[7] = false;
			directions[0] = false;
			directions[1] = false;
		} else if (column == values[0].length - 1) { // We assume that the 2D array is square. 
			directions[3] = false;
			directions[4] = false;
			directions[5] = false;
		}
		
		if (directions[0]) {
			neighbors++;
			sum += values[row][column - 1];
		}
		if (directions[1]) {
			neighbors++;
			sum += values[row + 1][column - 1];
		}
		if (directions[2]) {
			neighbors++;
			sum += values[row + 1][column];
		}
		if (directions[3]) {
			neighbors++;
			sum += values[row + 1][column + 1];
		}
		if (directions[4]) {
			neighbors++;
			sum += values[row][column + 1];
		}
		if (directions[5]) {
			neighbors++;
			sum += values[row - 1][column + 1];
		}
		if (directions[6]) {
			neighbors++;
			sum += values[row - 1][column];
		}
		if (directions[7]) {
			neighbors++;
			sum += values[row - 1][column - 1];
		}
					
		average = sum / neighbors;
		return average;
	}
}
