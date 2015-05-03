import java.util.Random;
import java.util.Arrays;

public class SameOrder {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[10];
		int[] array2 = new int[10];
		
		for (int i = 0; i < array.length; i++) { // initialize every position in the array with a random value
			array[i] = random.nextInt(1000);
			array2[i] = random.nextInt(1000);
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		System.out.println(equals(array, array2));
	}
	
	public static boolean equals(int[] a, int[] b) {
		if (b.length > a.length) return false;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) return false;
		}
		
		return true;
	}
}
