package recording.day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many questions in exam: ");
		int numQ = sc.nextInt();
		System.out.println("how many questions missed: ");
		int miss = sc.nextInt();
		
		FinalExam f = new FinalExam(numQ, miss);
		System.out.println(f.getGrade());

	}

}
