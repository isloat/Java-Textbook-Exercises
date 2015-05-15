/* It occurs to me that I should probably implement the Question class
 * provided in the text, so those exercises don't constantly throw 
 * errors at me.
 */
public class Question {
	private String text;
	private String answer;
	
	public Question() {
		text = "";
		answer = "";
	}
	
	public void addText(String additionalText) {
		text += " " + additionalText;
	}
	
	public void setText(String questionText) {
		text = questionText;
	}
	
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}
	
	public boolean checkAnswer(String response) {
		// We want to ignore excess whitespace, but we don't want to wholly ignore whitespace.
		// Consider the difference between PENIS and PEN IS.
		if (response.trim().replaceAll("\\s+", " ").equalsIgnoreCase(answer.trim().replaceAll("\\s+", " "))) {
			// Now ignore character case.
			return response.toLowerCase().equals(answer.toLowerCase());
		} else {
			return false;
		}
	}
	
	public void display() {
		System.out.println(text);
	}
}
