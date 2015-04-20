import java.util.Scanner;

public class Factoring {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		int factoredInteger = integer;

		for (int i = 2; i <= integer;) {
			if (factoredInteger % i == 0) {
				System.out.println(i);
				factoredInteger = factoredInteger / i;
			} else {
				i++;
			}
		}
	}
}
