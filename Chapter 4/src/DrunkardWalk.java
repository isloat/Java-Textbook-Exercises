import java.util.Random;

public class DrunkardWalk {
	public static void main(String[] args) {
		Random random = new Random();
		final int NORTH = 0;
		final int EAST = 1;
		final int SOUTH = 2;
		final int WEST = 3;

		int x = 0;
		int y = 0;
		int direction = 0;
		
		System.out.println("The drunkard starts at (" + x + ", " + y + ").");
		
		for (int i = 0; i < 100; i++) { // 100 intersections
			direction = random.nextInt(4);
			
			if (direction == NORTH) {
				y++;
			} else if (direction == EAST) {
				x++;
			} else if (direction == SOUTH) {
				y--;
			} else if (direction == WEST) {
				x--;
			} else {
				System.out.println("There has been an error.");
			}
		}
		
		System.out.println("One hundred intersections later, the drunkard is at (" + x + ", " + y + ").");
	}
}
