package replit.part3_string;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.print(word.substring(0,word.length()/2));
        System.out.print(word.substring(0,word.length()/2));


    }
}
