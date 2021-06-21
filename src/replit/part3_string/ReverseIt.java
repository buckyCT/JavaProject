package replit.part3_string;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        if(word.length()>5){
            System.out.println("Too long!");
        }else if(word.length()<5){
            System.out.println("Too short!");
        }else{

            for (int i=word.length()-1; i>=0; i--){
                System.out.print(word.charAt(i));
            }

        }



    }
}
