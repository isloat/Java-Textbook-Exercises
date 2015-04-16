import java.util.Scanner;

public class Paycheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.next();
		System.out.print("Enter your hourly salary: ");
		double salary = input.nextDouble();
		System.out.print("How many hours did you work in the past week?: ");
		double hours = input.nextDouble();
		
		double wages = 0;
		
		if (hours <= 0) {
			wages = 0;
		} else if (hours > 40) {
			wages = (hours - 40) * salary * 1.5 + 40 * salary;
		} else {
			wages = hours * salary;
		}
		
		System.out.print(name + ", you will receive $");
		System.out.printf("%.2f", wages);
		System.out.print(" for this week of work.");
	}
}
