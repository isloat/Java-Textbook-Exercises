import java.util.Scanner;

public class BankTransaction {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the balance of your checkings account: ");
		double checkings = input.nextDouble();
		System.out.print("Enter the balance of your savings account: ");
		double savings = input.nextDouble();
		
		System.out.print("What transaction do you want to make? 'D'eposit, 'W'ithdrawal, or 'T'ransfer?: ");
		String transaction = input.next();
		System.out.print("From which account? 'C'heckings or 'S'avings?: ");
		String account = input.next();
		System.out.print("How much money will you transact?: ");
		double money = input.nextDouble();
		
		boolean printMessage = false;
		System.out.println();
		
		if (checkings < 0 || savings < 0) {
			System.out.println("You cannot have a negative balance. Try again.");
		} else if (transaction.equals("D")) {
			if (account.equals("C")) {
				checkings += money;
			} else if (account.equals("S")) {
				savings += money;
			}
			
			printMessage = true;
		} else if (transaction.equals("W")) {
			if (account.equals("C")) {
				if ((checkings - money) < 0) {
					System.out.println("This would overdraw your account. Try again.");
				} else {
					checkings -= money;
					printMessage = true;
				}
			} else if (account.equals("S")) {
				if ((savings - money) < 0) {
					System.out.println("This would overdraw your account. Try again.");
				} else {
					savings -= money;
					printMessage = true;
				}			
			}
		} else if (transaction.equals("T")) {
			if (account.equals("C")) {
				if ((checkings - money) < 0) {
					System.out.println("This would overdraw your account. Try again.");
				} else {
					checkings -= money;
					savings += money;
					printMessage = true;
				}
			} else if (account.equals("S")) {
				if ((savings - money) < 0) {
					System.out.println("This would overdraw your account. Try again.");
				} else {
					savings -= money;
					checkings += money;
					printMessage = true;
				}
			}
		}
		
		if (printMessage) {
			System.out.printf("Checking balance: $%.2f", checkings);
			System.out.printf("\nSavings balance: $%.2f", savings);
		}
	}
}
