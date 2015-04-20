import java.util.Scanner;

public class DrawDiamonds {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		for (int i = 0; i < integer; i++) {
			for (int j = 0; j < integer - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = integer - 2; i >= 0; i--) {
			for (int j = 0; j < integer - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
