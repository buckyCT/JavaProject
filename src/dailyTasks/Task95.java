package dailyTasks;

public class Task95 {

	public static void main(String[] args) {
		
		int[][] students = { 
								{ 68,75,54,80 },
								{ 100,64,20,50 },
								{ 10,35,40,90 }
						   };
		int sum = 0;
		int totalMath = 0;
		
		for(int i=0; i<students.length; i++) {
			
			for(int j=0; j<students[i].length; j++) {
				
				sum = sum + students[i][j];
				
			}
			
			int avg = sum/students[i].length;
			System.out.println("student"+(i+1)+"'s average is: " + avg);
			sum=0;
			
			totalMath += students[i][0];
			
		}
		
		System.out.println("total math score is: " + totalMath);
		
		

	}

}
