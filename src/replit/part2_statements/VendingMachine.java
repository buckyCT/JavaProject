package replit.part2_statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        // penny1 nickel5 dime10 quar25

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cents:");
        int cents = sc.nextInt();

        if(cents>0 && cents<100){
            int quarters = cents/25;
            cents = cents%25;

            int dimes = cents/10;
            cents = cents%10;

            int nickels = cents/5;
            cents = cents%5;

            int pennies = cents;

            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");
        }else{
            System.out.println("Invalid cents amount");
        }




    }
}
