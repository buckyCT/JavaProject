package replit.part3_string;

import java.util.Scanner;

public class MergeThem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        if(word1.length()==3 && word2.length()==3){
            for (int i=0; i<word1.length(); i++){
                System.out.print(word1.charAt(i));
                System.out.print(word2.charAt(i));
            }
        }else{
            System.out.println("cannot merge");
        }

    }
}
