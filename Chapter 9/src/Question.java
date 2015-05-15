/* It occurs to me that I should probably implement the Question class
 * provided in the text, so those exercises don't constantly throw 
 * errors at me.
 */

/**
 * A question with a text and an answer.
 */
public class Question {
	private String text;
	private String answer;
	
	/**
	 * Constructs a question with empty question and answer.
	 */
	public Question() {
		text = "";
		answer = "";
	}
	
	/**
	 * Sets the question text.
	 * @param questionText The text of the question.
	 */
	public void setText(String questionText) {
		text = questionText;
	}	
	
	/**
	 * Adds text to the question text.
	 * @param additionalText 
	 */
	public void addText(String additionalText) {
		text += " " + additionalText;
	}
	

	/**
	 * Sets the answer for this question.
	 * @param correctResponse The correct answer.
	 */
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}
	
	/**
	 * Checks a given response for correctness.
	 * @param response The response to check.
	 * @return true if the response was correct, false otherwise.
	 */
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
	
	/**
	 * Displays the question.
	 */
	public void display() {
		System.out.println(text);
	}
}
