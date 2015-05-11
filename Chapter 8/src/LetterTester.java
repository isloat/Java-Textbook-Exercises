/* A main method to test Letter.java.
 */
public class LetterTester {
	public static void main(String[] args) {
		String sender = "Alice";
		String receiver = "Bob";
		
		Letter test = new Letter(sender, receiver);
		
		String line1 = "I am sorry we must part.";
		String line2 = "I wish you all the best.";
		
		test.addLine(line1);
		test.addLine(line2);
		
		System.out.println(test.getText());
	}
}
