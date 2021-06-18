package replit.part2_statements;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int input = sc.nextInt();

        int candy = input/10;
        input = input%10;

        int gumball = input/3;

        if(candy>0 || gumball>0){
            System.out.println("Number of Candies: " + candy);
            System.out.println("Number of Gumballs: " + gumball);
        }else{
            System.out.println("Not enough coupons");
        }



    }
}
