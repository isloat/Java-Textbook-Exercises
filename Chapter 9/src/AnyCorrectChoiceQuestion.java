/* Adds a class AnyCorrectChoiceQuestion that extends Question by
 * allowing multiple correct choices.
 * 
 * Responses should provide any one of the correct choices.
 * 
 * Answer string should contain all correct choices, separated by spaces.
 * Provide instructions in question text.
 */

/**
 * Extends ChoiceQuestion to allow for multiple correct answers.
 */
public class AnyCorrectChoiceQuestion extends ChoiceQuestion {
	private String allAnswers;

	/**
	 * Calls setText, but also adds instruction to the question text.
	 * 
	 * @param questionText The text of the question.
	 */
	public void setText(String questionText) {
		super.setText(questionText);
		super.addText("\nThere are multiple correct answers. Select one: ");
	}

	/**
	 * Additional answers will be added to the allAnswers variable every time this method is called.
	 * @param correctResponse One of the correct answers to the question.
	 */
	public void setAnswer(String correctResponse) {
		allAnswers = correctResponse + " " + allAnswers;
	}
	
	/**
	 * Checks response against allAnswers.
	 * @param response The selected choice.
	 * @return true if correct, otherwise false.
	 */
	public boolean checkAnswer(String response) {
		return allAnswers.contains(response);
	}
}
