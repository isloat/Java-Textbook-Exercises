/* This implements the class Student.
 * 
 * Students have a name, a total quiz score, and tracks the amount of quizzes taken.
 * 
 * Students also have a grade point average.
 */
public class Student {
	String name;
	int totalScore;
	int quizsTaken;
	int totalGrade;
	int gradesReceived;
	
	public Student(String name) {
		this.name = name;
		totalScore = 0;
		quizsTaken = 0;
		totalGrade = 0;
		gradesReceived = 0;
	}
	
	public void addQuiz(int score) {
		this.totalScore += score;
		this.quizsTaken++;
	}
	
	public int getTotalScore() {
		return this.totalScore;
	}
	
	public double getAverageScore() {
		if (quizsTaken == 0) {
			return 0;
		} else {
			double averageScore = (double) totalScore / quizsTaken;
			
			return averageScore;
		}
	}
	
	public void addGrade(String grade) {
		this.totalScore += calculateGrade(grade);
	}
	
	private double calculateGrade(String grade) {
		String letter = grade.substring(0, 1);
		String plus = null;
		
		if (grade.length() == 2) {
			plus = grade.substring(1, 2);
		}

		double value = 0;
		
		if (letter.equals("A")) {
			value = 4;
		} else if (letter.equals("B")) {
			value = 3;
		} else if (letter.equals("C")) {
			value = 2;
		} else if (letter.equals("D")) {
			value = 1;
		} else if (letter.equals("F")) {
			value = 0;
		}
		
		if (plus.equals("+")) {
			value = value + 0.3;
		} else if (plus.equals("-")) {
			value = value - 0.3;
		}
		
		if (value > 4) {
			value = 4;
		} else if (value < 0) {
			value = 0;
		}
		
		return value;
	}
	
	public double getGPA() {
		double gpa = (double) totalGrade / gradesReceived;
		
		return gpa;
	}
}
