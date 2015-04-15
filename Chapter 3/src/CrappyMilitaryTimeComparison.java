import java.util.Scanner;

public class CrappyMilitaryTimeComparison {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two times in military format: ");
		int time1 = input.nextInt();
		int time2 = input.nextInt();
		
		int hour1 = time1 / 100;
		int hour2 = time2 / 100;
		int minute1 = time1 % 100;
		int minute2 = time2 % 100;
		
		if (hour1 < hour2) {
			System.out.println(time1);
			System.out.println(time2);
		} else if (hour1 == hour2) {
			if (minute1 < minute2) {
				System.out.println(time1);
				System.out.println(time2);
			} else if (minute1 == minute2) {
				System.out.println("Both times are the same.");
			} else {
				System.out.println(time2);
				System.out.println(time1);
			}
		} else {
			System.out.println(time2);
			System.out.println(time1);
		}
		
	}
}
