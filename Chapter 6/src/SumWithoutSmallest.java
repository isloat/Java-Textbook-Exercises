import java.util.Random;
import java.util.Arrays;

public class SumWithoutSmallest {
	public static void main(String[] args) {
		Random random = new Random();
		double[] array = new double[10];
		
		for (int i = 0; i < array.length; i++) { // initialize every position in the array with a random value
			array[i] = random.nextInt(1000);
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(sumWithoutSmallest(array));
	}
	
	public static double sumWithoutSmallest(double[] array) {
		double sum = 0;
		double smallest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] <= smallest) {
				smallest = array[i];
			}
		}
		
		return (sum - smallest);
	}
}
