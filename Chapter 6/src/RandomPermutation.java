import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class RandomPermutation {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> permutation = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			array.add(i + 1);
		}
		
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
		
		System.out.println();
		int j = 0;
		int size = array.size();
		
		for (int i = 0; i < size; i++) {
			j = random.nextInt(array.size());
			permutation.add(array.get(j));
			array.remove(array.get(j));
		}
		
		for (int i = 0; i < permutation.size(); i++) {
			System.out.print(permutation.get(i) + " ");
		}
	}
}
