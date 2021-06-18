package replit.part2_statements;

import java.util.Scanner;

public class Citizens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");

        int sC = sc.nextInt();
        int nSC = sc.nextInt();

        System.out.println("What is new citizen's age?");

        int age = sc.nextInt();

        if(age>=65) {
            sC++;
            System.out.println("Senior Citizen");
        }
        else {
            nSC++;
            System.out.println("Non-Senior Citizen");
        }

        System.out.println("New seniorCitizens count " + sC);
        System.out.println("New nonSeniorCitizens count " + nSC);



    }
}
