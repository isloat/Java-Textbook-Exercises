import java.util.*;

/**
 *  A question with multiple choices.
 */
public class ChoiceQuestion extends Question {
	private ArrayList<String> choices;
	
	/**
	 *  Constructs a choice question with no choices.
	 */
	public ChoiceQuestion() {
		choices = new ArrayList<String>();
	}
	
	/** 
	 * Adds an answer choice to this question.
	 * @param choice the choice to add
	 * @param correct true if this is the correct choice, false otherwise
	 */
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		
		if (correct) {
			// Convert choices.size() to string.
			String choiceString = "" + choices.size();
			setAnswer(choiceString);
		}
	}
}
