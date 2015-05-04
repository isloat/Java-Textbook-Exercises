import java.util.Random;
import java.util.Arrays;

public class LongestRun {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[20];
		
		for (int i = 0; i < array.length; i++) { // initialize every position in the array with a random value
			array[i] = random.nextInt(6) + 1;
		}
		
		System.out.println(Arrays.toString(array));
		longRun(array);
	}
	
	public static void longRun(int[] array) {
		int runStartTemp = 0;
		int runEndTemp = 0;
		
		int runStart = 0;
		int runEnd = 0;
		
		for (int i = 0; i < array.length - 1; i++) { // cycle through entire array
			if (array[i] == array[i + 1]) { // do we discover a new run?
				runStartTemp = i; // set startPos here
				
				while (array[i] == array[i + 1]) { // cycle through rest of run
					runEndTemp = i + 1; // update length of run
					
					if (i == array.length - 2) break;
					else i++;
				}
				
				if (i == array.length - 1) break;
			}
			
			if ((runEndTemp - runStartTemp) > (runEnd - runStart)) { // did we find a longer run?
				runStart = runStartTemp;
				runEnd = runEndTemp;
			}
		}
		
		printRun(array, runStart, runEnd); // print off the marked run
	}
	
	public static void printRun(int[] array, int runStart, int runEnd) {
		if (runEnd - runStart == 0) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
		} else {
			for (int i = 0; i < array.length; i++) {
				if (i == runStart) System.out.print("(" + array[i] + " ");
				else if (i == runEnd) System.out.print(array[i] + ") ");
				else System.out.print(array[i] + " ");
			}
		}
	}
}
