package replit.part3_string;

import java.util.Locale;
import java.util.Scanner;

public class WithoutXX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.toLowerCase().charAt(0) == 'x'){
            word = word.substring(1);
        }
        if(word.toLowerCase().charAt(word.length()-1) == 'x'){
            word = word.substring(0,word.length()-1);
        }

        System.out.println(word);

    }
}
