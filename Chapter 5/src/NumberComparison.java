public class NumberComparison {
	public static void main(String[] args) {
		//test the methods
		
		double x = 17;
		double y = 18;
		double z = 19;
		
		System.out.println(allTheSame(x, y, z));
		System.out.println(allDifferent(x, y, z));
		System.out.println(sorted(x, y, z));
	}
	
	public static boolean allTheSame(double x, double y, double z) {
		boolean same = false;
		
		if (x == y && y == z) same = true;
		
		return same;
	}
	
	public static boolean allDifferent(double x, double y, double z) {
		boolean different = false;
		
		if (x != y && x != z && y != z) different = true;
		
		return different;
	}
	
	public static boolean sorted(double x, double y, double z) {
		boolean sorted = false;
		
		if (x <= y && y <= z) sorted = true;
		
		return sorted;
	}
}
