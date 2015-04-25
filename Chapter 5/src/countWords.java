public class countWords {
	public static void main(String[] args) {
		String sentence = "Mary had a little lamb";
		
		System.out.println(wordCount(sentence));
	}
	
	public static int wordCount(String str) {
		int words = 1; // each input will have at least one word
		
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(" ")) {
				words++;
			}
		}
		
		return words;
	}
}
