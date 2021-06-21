package replit.part3_string;

import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Enter full name:");
        String input = scan.nextLine();

        if (input.toLowerCase().equals("max payne") || input.toLowerCase().equals("alan wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }

    }
}
