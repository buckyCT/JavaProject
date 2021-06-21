package recording.day37_inheritance;

public class FinalExam extends GradeActivity {
	
	private int numQuestions;
	private double pointsEach;
	private int numMissedQuest;
	
	public FinalExam(int numQuestions, int numMissedQuest) {
		
		double numericScore;
		
		this.numMissedQuest=numMissedQuest;
		this.numQuestions=numQuestions;
		
		pointsEach = 100/numQuestions;
		numericScore = 100 - (pointsEach*numMissedQuest);
		
		setScore(numericScore);
	}
}
