import java.util.Random;

public class ArrayWarmup {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) { // initialize every position in the array with a random value
			array[i] = random.nextInt(1000);
		}
		
		for (int i = 1; i < array.length; i = i + 2) { // print every even index
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) { // print every even element
			if (array[i] % 2 == 0) System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for (int i = array.length - 1; i >= 0; i--) { // reverse order
			System.out.print(array[i] + " " );
		}
		
		System.out.println();
		
		System.out.print(array[0] + " " + array[array.length - 1]); // first and last
	}
}
