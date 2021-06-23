package replit.part3_string;

import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String fullName = email.split("@")[0];
        String fullDomain = email.split("@")[1];

        String firstName = fullName.split("_")[0];
        String lastName = fullName.split("_")[1];

        String domain = fullDomain.split("\\.")[0];

        System.out.println("First name: " + firstName.substring(0,1).toUpperCase()+firstName.substring(1));
        System.out.println("Last name: " + lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain: " + domain);


    }
}
