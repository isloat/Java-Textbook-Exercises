/* This implements the class Student.
 * 
 * Students have a name, a total quiz score, and tracks the amount of quizzes taken.
 */
public class Student {
	String name;
	int totalScore;
	int quizsTaken;
	
	public Student(String name) {
		this.name = name;
		totalScore = 0;
		quizsTaken = 0;
	}
	
	public void addQuiz(int score) {
		this.totalScore += score;
		this.quizsTaken++;
	}
	
	public int getTotalScore() {
		return this.totalScore;
	}
	
	public double getAverageScore() {
		double averageScore = (double) totalScore / quizsTaken;
		
		return averageScore;
	}
}
