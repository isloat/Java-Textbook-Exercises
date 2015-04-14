import java.util.Scanner;

public class MilitaryTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MINUTES_IN_DAY = 1440; // 24 * 60
	
		System.out.print("Enter the first time in military format: ");
		int firstTime = input.nextInt();
		System.out.print("Enter the second time in military format: ");
		int secondTime = input.nextInt();
		
		int firstMinutes = firstTime / 100;
		firstMinutes = firstMinutes * 60 + firstTime % 100; // convert time into minutes;
		int secondMinutes = secondTime / 100;
		secondMinutes = secondMinutes * 60 + secondTime % 100; // above
		int timeDiff = 0;
		int timeHours = 0;
		int timeMinutes = 0;
		
		if (firstTime <= secondTime) { 
			timeDiff = secondMinutes - firstMinutes;
			timeHours = timeDiff / 60; 
			timeMinutes = timeDiff - timeHours * 60;
		} else { //secondtime is after midnight!
			firstMinutes = MINUTES_IN_DAY - firstMinutes; // how long it takes from firstTime to midnight
			timeDiff = firstMinutes + secondMinutes; // how long it takes from midnight to secondTime, added to the above number
			timeHours = timeDiff / 60;
			timeMinutes = timeDiff - timeHours * 60;
		}
		
		System.out.print(timeHours + " hours " + timeMinutes + " minutes.");
	}
}
