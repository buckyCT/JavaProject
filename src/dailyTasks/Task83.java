package dailyTasks;

import java.util.Random;
import java.util.Scanner;

public class Task83 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		do {
			
			System.out.println("rolling dice...");
			int x = rn.nextInt(6)+1;
			int y = rn.nextInt(6)+1;
			System.out.println("Their values are: " + x + " " + y);
			
			System.out.println("Roll them again? (y=yes) ");
			String z = sc.nextLine();
			
			if(!(z.equalsIgnoreCase("y"))) {
				break;
			}
			
		}while(true);
		sc.close();

	}

}
