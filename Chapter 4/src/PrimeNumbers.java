import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		boolean isPrime = true;
		
		if (integer >= 1) {
			System.out.println("The prime numbers up to " + integer + " are: ");
			
			for (int i = 1; i < integer; i++) {
				isPrime = true;
				
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				
				if (isPrime) {
					System.out.println(i);
				}
			}
		}
		
		
	}
}
