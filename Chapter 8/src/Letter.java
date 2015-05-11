/* Provide a class for authoring a simple letter. 
 * 
 * The constructor should have the names of the giver and the receiver.
 * 
 * It should have addLine and getText methods.
 */
public class Letter {
	// Tester for the Letter class.
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
	
	String sender;
	String receiver;
	StringBuilder content;
	String header;
	String footer;
	
	public Letter(String sender, String receiver) {
		this.sender = sender;
		this.receiver = receiver;

		this.header = String.format("Dear %s:\n\n", receiver);
		this.footer = String.format("\nSincerely, \n\n%s", sender);
		
		this.content = new StringBuilder();
	}
	
	public void addLine(String line) {
		content.append(String.format("%s\n", line));
	}
	
	public String getText() {
		String text = header + content.toString() + footer;
		
		return text;
	}
}
