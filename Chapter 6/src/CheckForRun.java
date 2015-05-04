import java.util.Random;
import java.util.Arrays;

public class CheckForRun {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[20];
		
		for (int i = 0; i < array.length; i++) { // initialize every position in the array with a random value
			array[i] = random.nextInt(6) + 1;
		}
		
		System.out.println(Arrays.toString(array));
		inRun(array);
	}
	
	public static void inRun(int[] array) {
		boolean runCheck = false;
		
		for (int i = 0; i < array.length; i++) {
			if (runCheck) {
				if (array[i] != array[i - 1]) {
					System.out.print(")");
					runCheck = false;
				}
			} else if (!runCheck) {
				if (i + 1 == array.length) {
					
				} else if (array[i] == array[i + 1]) {
					System.out.print("(");
					runCheck = true;
				}
			}
			
			System.out.print(" " + array[i] + " ");
		}
		
		if (runCheck) System.out.print(")");
	}
}
