package day18_userInput;

import java.util.Scanner;

public class ChangeMaker {
	
public static void main(String[] args) {
		
		calc();
		
	}
	
	public static void calc() {
		
		Scanner sc = new Scanner(System.in);
		int attempt=0;
		
		do {
			
			System.out.print("Enter a number from 1 to 99: ");
			int amount = sc.nextInt();
			
			if(amount >= 1 && amount <= 99) {
				
				int quarter = amount/25;
				amount = amount % 25;
				int dimes = amount/10;
				amount = amount % 10;
				int pennies = amount;
				
				System.out.println("quareter: " + quarter);
				System.out.println("dimes: " + dimes);
				System.out.println("pennies: " + pennies);
				break;
				
				
			}else {
				
				attempt++;
				if(attempt>=3) {
					System.out.println("you are done with attempts...");
					break;
				}
				System.out.println("enter a valid number");
			}
			
			
		}while(true);
		
		
		
		
		
		
		
	}

}
