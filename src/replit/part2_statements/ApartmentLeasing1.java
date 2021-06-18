package replit.part2_statements;

import java.util.Scanner;

public class ApartmentLeasing1 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        //WRITE YOUR CODE HERE:

        switch (numberOfBedrooms){
            case 1:
                startingPrice+=1100;
                System.out.println("One Bedroom Selected");
                System.out.println("Starting Price: "+startingPrice);
                break;
            case 2:
                startingPrice+=1850;
                System.out.println("Two Bedroom Selected");
                System.out.println("Starting Price: "+startingPrice);
                break;
            case 3:
                startingPrice+=2550;
                System.out.println("Three Bedroom Selected");
                System.out.println("Starting Price: "+startingPrice);
                break;
            default:
                System.out.println("No such Bedrooms available");
                break;
        }


    }
}
