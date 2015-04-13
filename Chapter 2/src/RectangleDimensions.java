import java.util.Scanner;

public class RectangleDimensions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle: ");
		double rectLength = input.nextDouble();
		System.out.print("Enter the width of the rectangle: ");
		double rectWidth = input.nextDouble();
		
		double rectArea = rectLength * rectWidth;
		double rectPerimeter = rectLength * 2 + rectWidth * 2;
		// a^2 + b^2 = c^2, we find a^2 + b^2 which is c^2, then sqrt(c^2).
		double rectDiagonal = Math.sqrt((rectLength * rectLength) + (rectWidth * rectWidth)); 
		
		System.out.printf("The area of the rectangle is %.2f", rectArea);
		System.out.printf(" and the perimeter is %.2f", rectPerimeter);
		System.out.printf(". \nThe diagonal of the rectangle is %.2f", rectDiagonal);
		System.out.print(".");
	}
}
