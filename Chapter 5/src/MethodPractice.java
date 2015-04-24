public class MethodPractice {
	public static void main(String[] args) {
		double x = 7;
		double y = 18;
		double z = 11;
		
		System.out.println(smallest(x, y, z));
		System.out.println(average(x, y, z));
	}
	
	public static double smallest(double x, double y, double z) {
		double smallest = 0;
		
		if (x <= y && x <= z) {
			smallest = x;
		} else if (y <= x && y <= z) {
			smallest = y;
		} else if (z <= x && z <= y) {
			smallest = z;
		}
		
		return smallest;
	}
	
	public static double average(double x, double y, double z) {
		return ((x + y + z) / 3);
	}
}
