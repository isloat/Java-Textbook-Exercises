
public class AccountBalancePrinter {
	private static double INITIAL_BALANCE = 1000;
	private static double accountBalance = INITIAL_BALANCE;
	
	public static void main(String[] args) {
		System.out.println("The bank account's initial balance is $" + accountBalance + ".");
		accountBalance = accountBalance * 1.05;
		System.out.println("One year later, the balance will be $" + accountBalance + ".");
		accountBalance = accountBalance * 1.05;
		System.out.println("After the second year, the balance will be $" + accountBalance + ".");
		accountBalance = accountBalance * 1.05;
		System.out.println("Finally, after three years, the balance will be $" + accountBalance + ".");
	}
}
