import java.util.Scanner;

public class BookOrderPrice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the total price of all books you will order: ");
		double bookPrice = input.nextDouble();
		System.out.print("Enter the number of books you are ordering: ");
		int bookNumber = input.nextInt();
		
		double bookTax = bookPrice * 0.075;
		int shippingCharge = bookNumber * 2;
		double totalPrice = bookPrice + bookTax + shippingCharge;
		
		System.out.printf("The total cost of your order will be $%.2f", totalPrice);
		System.out.print(".");
	}
}
