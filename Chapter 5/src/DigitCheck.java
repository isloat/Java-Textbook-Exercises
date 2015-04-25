public class DigitCheck {
	public static void main(String[] args) {
		int n = 177424; // number to test methods
		
		System.out.println(firstDigit(n));
		System.out.println(lastDigit(n));
		System.out.println(digits(n));
	}
	
	public static int firstDigit(int n) {
		int digit = n;
		
		while (digit >= 10) {
			digit = digit / 10;
		}
		
		return digit;
	}
	
	public static int lastDigit(int n) {
		int digit = n % 10;

		return digit;
	}
	
	public static int digits(int n) {
		int digit = n;
		int count = 1;
		
		while (digit >= 10) {
			digit = digit / 10;
			count++;
		}
		
		return count;
	}
}
