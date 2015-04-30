import java.util.Random;
import java.util.Arrays;

public class SumWithoutSmallest {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) { // initialize every position in the array with a random value
			array[i] = random.nextInt(1000);
		}
	}
	
	public static double sumWithoutSmallest(double[] array) {
		double sum = 0;
		double smallest = 0;
		
		return sum;
	}
}
