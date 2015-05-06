import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class RestroomStalls {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of bathroom stalls: ");
		int stalls = input.nextInt();
		
		boolean[] occupied = new boolean[stalls]; // array of occupied/unoccupied values that is size of input # of stalls
		
		for (int i = 0; i < stalls; i++) {			
			System.out.println();
			occupied[nextTaken(occupied)] = true;
			
			for (int j = 0; j < stalls; j++) {
				if (occupied[j]) System.out.print("X ");
				else System.out.print("_ ");
			}
		}
	}
	
	public static int nextTaken(boolean[] occupied) {
		int longStart = -1; // the start of the longest run
		int longRun = 0; // length of longest run
		int currentStart = -1; // the start of the currently tracked run
		int currentRun = 0; // length of currently tracked run
		boolean isRun = false;
		
		for (int i = 0; i < occupied.length; i++) { // check the entire array
			if (isRun && occupied[i]) { // if we're on a run, and the next stall up is occupied
				isRun = false; // the run ends
				
				if (currentRun >= longRun) { // if that run was the longest
					longRun = currentRun; // set it to be the longest
					longStart = currentStart;
				}
			} else if (!isRun && !occupied[i]) { // not on a run, and not occupied?
				isRun = true; // start a run
				currentStart = i;
				currentRun = 1;
			} else if (isRun && !occupied[i]) { // on a run, not occupied?
				currentRun++; // run longer
			}
		}
		
		if (isRun) {
			if (currentRun >= longRun) { // in case above for-loop completes without "finishing" a run
				longRun = currentRun; // set longest run to the run length
				longStart = currentStart;
			}
		}
		
		int middlePos = (longRun - 1) / 2 + longStart; // half of longRun plus start of the run will give you the middle of that run
		
		return middlePos;
	}
}
