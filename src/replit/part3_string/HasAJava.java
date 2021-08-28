package replit.part3_string;

import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        try {
            if(word.substring(0,4).contains("java") || word.substring(1,5).contains("java")){
                exists = true;
            }
        }catch (StringIndexOutOfBoundsException e){}

        System.out.println(exists);
    }
}
