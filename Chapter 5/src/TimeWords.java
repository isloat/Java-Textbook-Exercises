import java.util.Scanner;

public class TimeWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hours = -1;
		int minutes = -1;
		
		do {
			System.out.print("Enter the hour, between 1 to 12: ");
			hours = input.nextInt();
		} while (hours <= 0 || hours > 12);
		
		do {
			System.out.print("Enter the minutes, between 0 to 59: ");
			minutes = input.nextInt();
		} while (minutes < 0 || minutes > 59);
		
		System.out.println(getTimeName(hours, minutes));
	}
	
	public static String getTimeName(int hours, int minutes) {
		String hourName = "";
		String timeName = "";
		
		if (minutes > 30) hours++; // the time shifts "to (hour+1)"
		if (hours == 13) hours = 1; // wraparound
		
		switch (hours) {
			case 1: hourName = "one"; break;
			case 2: hourName = "two"; break;
			case 3: hourName = "three"; break;
			case 4: hourName = "four"; break;
			case 5: hourName = "five"; break;
			case 6: hourName = "six"; break;
			case 7: hourName = "seven"; break;
			case 8: hourName = "eight"; break;
			case 9: hourName = "nine"; break;
			case 10: hourName = "ten"; break;
			case 11: hourName = "eleven"; break;
			case 12: hourName = "twelve"; break;
		}
		
		switch (minutes) {
			case 0: timeName = hourName + " o'clock"; break;
			case 1: timeName = "a minute past " + hourName; break;
			case 2: timeName = "two minutes past " + hourName; break;
			case 3: timeName = "three minutes past " + hourName; break;
			case 4: timeName = "four minutes past " + hourName; break;
			case 5: timeName = "five  past " + hourName; break;
			case 6: timeName = "six minutes past " + hourName; break;
			case 7: timeName = "seven minutes past " + hourName; break;
			case 8: timeName = "eight minutes past " + hourName; break;
			case 9: timeName = "nine minutes past " + hourName; break;
			case 10: timeName = "ten past " + hourName; break;
			case 11: timeName = "eleven minutes past " + hourName; break;
			case 12: timeName = "twelve minutes past " + hourName; break;
			case 13: timeName = "thirteen minutes past " + hourName; break;
			case 14: timeName = "fourteen minutes past " + hourName; break;
			case 15: timeName = "a quarter past " + hourName; break;
			case 16: timeName = "sixteen minutes past " + hourName; break;
			case 17: timeName = "seventeen minutes past " + hourName; break;
			case 18: timeName = "eighteen minutes past " + hourName; break;
			case 19: timeName = "ninteen minutes past " + hourName; break;
			case 20: timeName = "twenty past " + hourName; break;
			case 21: timeName = "twenty-one minutes past " + hourName; break;
			case 22: timeName = "twenty-two minutes past " + hourName; break;
			case 23: timeName = "twenty-three minutes past " + hourName; break;
			case 24: timeName = "twenty-four minutes past " + hourName; break;
			case 25: timeName = "twenty-five past " + hourName; break;
			case 26: timeName = "twenty-six minutes past " + hourName; break;
			case 27: timeName = "twenty-seven minutes past " + hourName; break;
			case 28: timeName = "twenty-eight minutes past " + hourName; break;
			case 29: timeName = "twenty-nine minutes past " + hourName; break;
			case 30: timeName = "half past " + hourName; break;
			case 31: timeName = "twenty-nine minutes to " + hourName; break;
			case 32: timeName = "twenty-eight minutes to " + hourName; break;
			case 33: timeName = "twenty-seven minutes to " + hourName; break;
			case 34: timeName = "twenty-six minutes to " + hourName; break;
			case 35: timeName = "twenty-five to " + hourName; break;
			case 36: timeName = "twenty-four minutes to " + hourName; break;
			case 37: timeName = "twenty-three minutes to " + hourName; break;
			case 38: timeName = "twenty-two minutes to " + hourName; break;
			case 39: timeName = "twenty-one minutes to " + hourName; break;
			case 40: timeName = "twenty to " + hourName; break;
			case 41: timeName = "nineteen minutes to " + hourName; break;
			case 42: timeName = "eighteen minutes to " + hourName; break;
			case 43: timeName = "seventeen minutes to " + hourName; break;
			case 44: timeName = "sixteen minutes to  " + hourName; break;
			case 45: timeName = "a quarter to " + hourName; break;
			case 46: timeName = "fourteen minutes to " + hourName; break;
			case 47: timeName = "thirteen minutes to " + hourName; break;
			case 48: timeName = "twelve minutes to " + hourName; break;
			case 49: timeName = "eleven minutes to " + hourName; break;
			case 50: timeName = "ten to " + hourName; break;
			case 51: timeName = "nine minutes to " + hourName; break;
			case 52: timeName = "eight minutes to " + hourName; break;
			case 53: timeName = "seven minutes to " + hourName; break;
			case 54: timeName = "six minutes to " + hourName; break;
			case 55: timeName = "five to " + hourName; break;
			case 56: timeName = "four minutes to " + hourName; break;
			case 57: timeName = "three minutes to " + hourName; break;
			case 58: timeName = "two minutes to " + hourName; break;
			case 59: timeName = "a minute to " + hourName; break;
		}
		
		return timeName;
	}
}
