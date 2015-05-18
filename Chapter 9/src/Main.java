import java.util.*;

/**
 * Main method for testing Chapter 9 exercises.
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		Question q = new Question();
//		q.setText("Who was the inventor of Java?");
//		q.setAnswer("James Gosling");
		
		ChoiceQuestion q = new ChoiceQuestion();
		q.setText("Who was the inventor of Java?");
		q.addChoice("Walt Disney", false);
		q.addChoice("James Gosling", true);
		q.addChoice("Richard Stallman", false);
		q.addChoice("Barack Obama", false);
	
		q.display();
		System.out.print("Enter your answer: ");
		String response = input.nextLine();
		input.close();
		
		System.out.println(q.checkAnswer(response));
	}
}
