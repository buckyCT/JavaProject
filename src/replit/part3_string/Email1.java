package replit.part3_string;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if(email.contains("_")){
            String first = email.split("@")[0].split("_")[0];
            String second = email.split("@")[0].split("_")[1];

            String newName = second+"_"+first;

            System.out.println(newName+"@"+email.split("@")[1]);
        }else{
            System.out.println(email);
        }

    }
}
