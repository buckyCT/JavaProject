package replit.part2_statements;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int balance=100;

        switch (input){
            case "Blanket":
                balance-=60;
                break;
            case "Charger":
                balance-=25;
                break;
            case "Hat":
                balance-=25;
                break;
            case "Headphones":
                balance-=30;
                break;
            case "Laptop":
                balance-=200;
                break;
            case "Pants":
                balance-=50;
                break;
            case "Pillow":
                balance-=40;
                break;
            case "Smartphone":
                balance-=1000;
                break;
            case "Socks":
                balance-=5;
                break;
            case "USB cable":
                balance-=10;
                break;
            default:
                System.out.println("Invalid item!");
                break;
        }

        if(balance!=100){

            if(balance>0){
                System.out.println("Thank you for your purchase! "
                + "\nYour current balance is: " + balance + "$");
            }else{
                System.out.println("Sorry, not enough funds on your gift card!");
            }

        }





    }
}
