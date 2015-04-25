public class CountVowel {
	public static void main(String[] args) {
		String str = "mixZler";
		
		System.out.println(middle(str));
	}
	
	public static String middle(String str) {
		String middle = "error";
		int length = str.length();
		
		if (length % 2 == 0) {
			length = length / 2;
			middle = str.substring(length - 1, length + 1);
		} else {
			length = length / 2;
			middle = str.substring(length, length + 1);
		}
		
		return middle;
	}
}
