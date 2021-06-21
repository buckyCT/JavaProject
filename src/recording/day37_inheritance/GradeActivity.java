package recording.day37_inheritance;

public class GradeActivity {
	
	private double score;
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score=score;
	}
	
	public char getGrade() {
		
		char c;
		
		if(score>=90) c='A';
		else if(score>=80) c='B';
		else if(score>=70) c='C';
		else if(score>=60) c='D';
		else c='F';
		
		return c;
	}

}
