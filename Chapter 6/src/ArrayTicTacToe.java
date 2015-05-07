import java.util.*;

public class ArrayTicTacToe {
	static final int SIDE_LENGTH = 3;
	
	public static void main(String[] args) {
		boolean player = true;		// Player 1 == TRUE; Player 2 == FALSE.
		int[][] tTT = new int[SIDE_LENGTH][SIDE_LENGTH];
		int winner = 0; 
		
		while (winner == 0) {
			takeInput(tTT, player);
			player = !player;
			winner = isWinner(tTT);
		}
		
		System.out.println();
		if (winner == 1) System.out.println("Player X Wins!");
		else if (winner == 2) System.out.println("Player Y Wins!");
	}
	
	public static void drawBoard(int[][] tTT) {
		for (int y = 0; y < SIDE_LENGTH; y++) {
			for (int x = 0; x < SIDE_LENGTH; x++) {
				if (tTT[x][y] == 0) System.out.print("_");
				else if (tTT[x][y] == 1) System.out.print("X");
				else if (tTT[x][y] == 2) System.out.print("O");
				
				System.out.print("  ");
			}
			
			System.out.println();
		}
	}
	
	public static int[][] takeInput(int[][] tTT, boolean player) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		drawBoard(tTT);
		if (player) System.out.println("\nPLAYER X TURN");
		else if (!player) System.out.println("\nPLAYER Y TURN");
		
		int x = 0;
		int y = 0;
		boolean successfulPlay = false;
		
		while (!successfulPlay) {
			do {
				System.out.print("Enter the x coordinate: ");
				x = input.nextInt();
			} while (x > 2 || x < 0);
			
			do {
				System.out.print("Enter the y coordinate: ");
				y = input.nextInt();
			} while (y > 2 || y < 0);
			
			if (tTT[x][y] == 0) {
				if (player) tTT[x][y] = 1;
				else if (!player) tTT[x][y] = 2;
				successfulPlay = true;
			} else if (tTT[x][y] == 1) {
				if (player) System.out.println("You have already played there.");
				else if (!player) System.out.println("Your opponent has already played there.");
			} else if (tTT[x][y] == 2) {
				if (!player) System.out.println("You have already played there.");
				else if (player) System.out.println("Your opponent has already played there.");
			}
		}
		
		return tTT;
	}
	
	public static int isWinner(int[][] tTT) {
		int winner = 0; 	// 0 == No Winner. 1 == Player X Wins. 2 == Player O Wins.
		
		// Check columns.
		for (int x = 0; x < SIDE_LENGTH; x++) {
			if (tTT[x][0] == tTT[x][1] && tTT[x][1] == tTT[x][2]) {
				winner = tTT[x][0];
			}
		}
		
		// Check rows.
		for (int y = 0; y < SIDE_LENGTH; y++) {
			if (tTT[0][y] == tTT[1][y] && tTT[1][y] == tTT[2][y]) {
				winner = tTT[0][y];
			}
		}
		
		// Check backslash.
		if (tTT[0][0] == tTT[1][1] && tTT[1][1] == tTT[2][2]) winner = tTT[1][1];
		// Check slash.
		if (tTT[0][2] == tTT[1][1] && tTT[1][1] == tTT[2][0]) winner = tTT[1][1];
		
		return winner;
	}
}
