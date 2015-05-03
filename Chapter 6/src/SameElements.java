import java.util.Random;
import java.util.Arrays;

public class SameElements {
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
		System.out.println(sameSet(array, array2));
	}
	
	public static boolean sameSet(int[] array, int[] array2) { // check whether two arrays have the same elements, ignoring duplicates
		Arrays.sort(array); 	// first I'll want to sort those arrays
		Arrays.sort(array2);		
		
		array = removeDuplicates(array); 	// then I'll want to remove all duplicates from both arrays
		array2 = removeDuplicates(array2);
		
		return equals(array, array2); // then I check if the arrays are equal
	}
	
	public static int[] removeDuplicates(int[] array) {
		if (array.length < 2) return array;
		
		int i = 1;
		int j = 0;
		
		while (i < array.length) {
			if (array[i] == array[j]) {
				i++;
			} else {
				j++;
				array[j] = array[i];
				i++;
			}
		}
		
		int[] newArray = Arrays.copyOf(array, j + 1);
		
		return newArray;
	}
	
	public static boolean equals(int[] a, int[] b) {		
		if (b.length > a.length) return false;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) return false;
		}
		
		return true;
	}
}
