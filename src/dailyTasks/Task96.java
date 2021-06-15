package dailyTasks;

import java.util.Arrays;

public class Task96 {

	public static void main(String[] args) {
		
		String s1 = "Today weather is sunny and 72 degree. It is perfect day!";
		
		System.out.println(s1);
		
		String[] s2 = s1.split(" degree");
		
		String[] s3 = s2[0].split(" ");
		
		String s4 = s3[s3.length-1];
		
		double x = Double.parseDouble(s4);
		
		double y = (x-32)*5/9;
		
		System.out.println(s4 + " degree is equal to " + y + " celcius");
		
	}

}
