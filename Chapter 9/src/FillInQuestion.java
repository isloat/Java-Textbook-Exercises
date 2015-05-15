import java.util.*;

/* Extends an earlier example (Question) in the chapter by adding a class FillInQuestion.
 * 
 * This type of question is constructed by a string that contains the answer, surrounded
 * by _ _.
 * 
 * Example: The inventor of Java was _James Gosling_.
 * The question should be displayed as: The inventor of Java was _____
 */
public class FillInQuestion extends Question {
	public void setText(String questionText) {
		Scanner parse = new Scanner(questionText);
		parse.useDelimiter("_");
		
		String question = parse.next();
		String answer = parse.next();
		
		question += "_____" + parse.next();
		parse.close();
		
		super.setText(question);
		super.setAnswer(answer);
	}
}
