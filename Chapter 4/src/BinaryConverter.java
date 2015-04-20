import java.util.Scanner;

public class BinaryConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		String binary = "";
		int count = 0;
		
		if (number == 0) {
			System.out.println("0");
		} else {
			while (number != 0) {
				if (count % 4 == 0) {
					binary = " " + binary;
				}
				
				binary = number % 2 + binary;
				number = number / 2;
				count++;
			}
		}
		
		count = count % 4;
		
		while (count != 4 && count != 0) {
			binary = "0" + binary;
			count++;
		}
		
		System.out.println(binary);
	}
}
