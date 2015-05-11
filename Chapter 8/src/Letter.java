/* Provide a class for authoring a simple letter. 
 * 
 * The constructor should have the names of the giver and the receiver.
 * 
 * It should have addLine and getText methods.
 */
public class Letter {
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

