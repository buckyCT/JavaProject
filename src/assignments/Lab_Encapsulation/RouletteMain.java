package assignments.Lab_Encapsulation;

import java.util.Scanner;

public class RouletteMain {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter pocket number");
		
		int x = sc.nextInt();
		
		Roulette roulette = new Roulette(x);
		
		System.out.println(roulette.getPocketColor());

	}

}
