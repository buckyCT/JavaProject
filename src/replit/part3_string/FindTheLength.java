package replit.part3_string;

import java.util.Scanner;

public class FindTheLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String input = sc.nextLine();

        System.out.println("Length is: " + input.length());


    }
}
