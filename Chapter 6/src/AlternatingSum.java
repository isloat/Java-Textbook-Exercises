import java.util.Random;
import java.util.Arrays;

public class AlternatingSum {
	public static void main(String[] args) {
		Random random = new Random();
		double[] array = new double[10];
		
		for (int i = 0; i < array.length; i++) { // initialize every position in the array with a random value
			array[i] = random.nextInt(1000);
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(altSum(array));
	}
	
	public static double altSum(double[] array) {
		double alternate = array[0];
		boolean add = false; // 1 - 2 + 3 - 4 + 5 ....
		
		for (int i = 1; i < array.length; i++) {
			if (add) alternate += array[i];
			else alternate -= array[i];
			
			add = !add; // invert it for each step
		}
		
		return alternate;
	}
}
