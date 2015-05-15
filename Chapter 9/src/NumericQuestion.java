/* Extends an earlier example in the chapter by adding a class NumericQuestion.
 * 
 * If response and expected answer differs by no more than 0.01, accept response as correct.
 */
public class NumericQuestion extends Question {
	private double answer;
	
	public void setAnswer(double correctResponse) {
		answer = correctResponse;
	}
	
	public boolean checkAnswer(String response) {
		double responseDouble = Double.parseDouble(response);
		return (Math.abs(responseDouble - answer) <= 0.01);
	}
}
