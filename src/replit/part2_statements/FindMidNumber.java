package replit.part2_statements;

import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int x = sc.nextInt();

        System.out.println("Enter second number:");
        int y = sc.nextInt();

        System.out.println("Enter third number:");
        int z = sc.nextInt();

        int midValue;

        if((x>y && x<z) || (x<y && x>z)) midValue=x;
        else if((y>x && y<z) || (y<x && y>z)) midValue=y;
        else midValue=z;


        System.out.println("Medium value is: " + midValue);


    }
}
