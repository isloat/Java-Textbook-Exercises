import java.util.Random;

public class BuffonNeedle {
	public static void main(String[] args) {
		Random random = new Random();
		double LINE_DISTANCE = 2; // each line 2 inches apart
		double NEEDLE_LENGTH = 1; // 1 inch needle
		int ANGLE_MAX = 180;
		double tries = 0; // # of attempts
		double hits = 0; // # of successes
		
		double ylow = 0; // y-coord of bottom point of the needle
		double yhigh = 0; // y of top point -- find this by ylow * sin(angle)
		int angle = 0; // the angle of the needle in degrees -- 0* to 180*
		
		for (int i = 0; i < 10000; i++) {
			ylow = random.nextDouble() * LINE_DISTANCE; // generate a number between 0 and LINE_DISTANCE
			angle = random.nextInt(ANGLE_MAX + 1);
			yhigh = ylow + Math.sin(Math.toRadians(angle));
			
			if (yhigh >= LINE_DISTANCE) {
				hits++;
			}
			
			tries++;
		}
		
		System.out.println("You dropped a needle on the paper " + (int) tries + " times and hit a ruled line " + (int) hits + " times.");
		System.out.printf("You had a %.2f", tries / hits); // this should approximate pi
		System.out.println("% success rate.");
	}
}
