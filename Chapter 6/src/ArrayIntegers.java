import java.util.Random;
import java.util.Arrays;

public class ArrayIntegers {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) { // initialize every position in the array with a random value
			array[i] = random.nextInt(1000);
		}
		
		System.out.println(Arrays.toString(array));
		
		array = swap(array);
		System.out.println(Arrays.toString(array));
		
		array = shift(array);
		System.out.println(Arrays.toString(array));
		
		array = evenIsZero(array);
		System.out.println(Arrays.toString(array));
		
		array = largerNeighbor(array);
		System.out.println(Arrays.toString(array));
		
		array = removeMiddle(array);
		System.out.println(Arrays.toString(array));
		
		array = moveEvens(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println(secondLargest(array));
		
		System.out.println("It is " + isOrdered(array) + " that the array is sorted in increasing order.");
		
		System.out.println("It is " + adjacentDuplicate(array) + " that there are two adjacent duplicates in the array.");
		
		System.out.println("It is " + duplicate(array) + " that the array contains duplicate elements.");
	}
	
	public static int[] swap(int[] array) { // swap first and last
		int hold = array[0];
		array[0] = array[array.length - 1];
		array[array.length - 1] = hold;
		
		return array;
	}
	
	public static int[] shift(int[] array) { // shift right 1, wraparound      // can also use collections.rotate for future reference
		int hold = array[array.length - 1];
		
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		
		array[0] = hold;
		
		return array;
	}
	
	public static int[] evenIsZero(int[] array) { // swap evens with 0
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = 0;
			}
		}
		
		return array;
	}
	
	public static int[] largerNeighbor(int[] array) { // swap all elements except first/last with larger of two neighbors
		int[] newArray = Arrays.copyOf(array, array.length); // copy new array
		int left = 0;
		int right = 0;
		int current = 0;
		
		for (int i = 1; i < array.length - 1; i++) { // start at position 1 and end 1 before end
			left = array[i - 1];
			current = array[i];
			right = array[i + 1];
			
			if (current < left || current < right) { // if current is smaller than either neighbor 
				if (left >= right) { // if left is largest
					newArray[i] = left; // replace with left
				} else if (right > left) { // else if right is largest
					newArray[i] = right; // replace with right
				}
			}
		}
		
		return newArray;
	}
	
	public static int[] removeMiddle(int[] array) { // remove middle element if length odd, else middle two
		int half = (int) (array.length / 2f - 0.5);
		int[] newArray = new int[half * 2];
		
		System.arraycopy(array, 0, newArray, 0, half);
		System.arraycopy(array, array.length - half, newArray, half, half);
		
		return newArray;
	}
	
	public static int[] moveEvens(int[] array) { // moves all even elements to the front, otherwise preserving order
		int[] newArray = new int[array.length];
		int pos = 0;
		
		for (int i = 0; i < array.length; i++) { // find even elements first
			if (array[i] % 2 == 0) {
				newArray[pos] = array[i];
				pos++;
			}
		}
		
		for (int i = 0; i < array.length; i++) { // now find odd elements
			if (array[i] % 2 == 1) {
				newArray[pos] = array[i];
				pos++;
			}
		}
		
		return newArray;
	}
	
	public static int secondLargest(int[] array) { // find second largest element
		int largest = 0;
		int secondLargest = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest && array[i] < largest) {
				secondLargest = array[i];
			}
		}
		
		return secondLargest;
	}
	
	public static boolean isOrdered(int[] array) { // check if array is in increasing order
		int previous = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (!(array[i] > previous)) {
				return false;
			}
			
			previous = array[i];
		}
	
		return true;
	}
	
	public static boolean adjacentDuplicate(int[] array) { // check if there are adjacent duplicates
		int previous = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] == previous) {
				return true;
			}
			
			previous = array[i];
		}
		
		return false;
	}
	
	public static boolean duplicate(int[] array) { // do duplicate elements exist?
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == array[i]) {
					return true;
				}
			}
		}
		
		return false;
	}
}
