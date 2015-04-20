import java.util.Scanner;

public class DrawSquares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		System.out.println();
		
		for (int i = 1; i <= integer; i++) {
			if (i == 1 || i == integer) {
				for (int j = 0; j <= integer * 2; j++) {
					if (j == integer) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}

				System.out.println();
			} else {
				for (int j = 0; j < integer; j++) {
					System.out.print("*");
				}
				
				System.out.print(" *");
				for (int j = 1; j < integer - 1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
	}
}