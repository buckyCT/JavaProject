package dailyTasks;

import java.util.Random;
//import java.util.Scanner;

public class Task85 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int sumComp=0, sumHuman=0;
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("rolling dice for comp...");
			int x = rn.nextInt(6)+1;
			int y = rn.nextInt(6)+1;
			System.out.println("Their values are: " + x + " " + y);
			sumComp += x+y;
			
			System.out.println("rolling dice for human...");
			int a = rn.nextInt(6)+1;
			int b = rn.nextInt(6)+1;
			System.out.println("Their values are: " + a + " " + b);
			sumHuman += a+b;
			
		}
		
		System.out.println("\nComputer: " + sumComp + "\nHuman: " + sumHuman);
		
		if(sumComp>sumHuman) System.out.println("Computer won!");
		else if(sumComp<sumHuman) System.out.println("Human won!");
		else System.out.println("There is no winner!");
		
		
		
		
		
		

	}

}
