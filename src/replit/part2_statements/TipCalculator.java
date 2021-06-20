package replit.part2_statements;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        //Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%

        Scanner sc = new Scanner(System.in);

        System.out.println("Split:");
        String yesOrNo = sc.nextLine();

        System.out.println("Number of people:");
        int numberPeople = sc.nextInt();

        System.out.println("Check amount:");
        double checkAmount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Service Quality:");
        String serviceQuality = sc.nextLine();

        System.out.print("Number of people entered: ");
        for (int i=1; i<=numberPeople; i++){
            System.out.print("&");
        }
        System.out.println();

        double percentage;
        double totalPerPerson;
        double tip;

        switch (serviceQuality.toLowerCase()){
            case "excellent":
                percentage = 0.25;
                tip = checkAmount*percentage;
                checkAmount += tip;
                totalPerPerson = checkAmount/numberPeople;
                break;
            case "great":
                percentage = 0.2;
                tip = checkAmount*percentage;
                checkAmount += tip;
                totalPerPerson = checkAmount/numberPeople;
                break;
            case "good":
                percentage = 0.15;
                tip = checkAmount*percentage;
                checkAmount += tip;
                totalPerPerson = checkAmount/numberPeople;
                break;
            case "fair":
                percentage = 0.1;
                tip = checkAmount*percentage;
                checkAmount += tip;
                totalPerPerson = checkAmount/numberPeople;
                break;
            case "poor":
                percentage = 0.05;
                tip = checkAmount*percentage;
                checkAmount += tip;
                totalPerPerson = checkAmount/numberPeople;
                break;
            default:
                tip=0;
                totalPerPerson=0;
                break;
        }

        System.out.println("Total to pay: " + checkAmount);
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + (tip/numberPeople));



    }
}
