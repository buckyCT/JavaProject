package replit.part2_statements;

import java.util.Scanner;

public class BlackjackKeepHand {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        //Write your code here:

        if(player<22){

            if(player>house) System.out.println("player win");
            else if(player<house) System.out.println("player loss ");
            else System.out.println("its a tie");

        }else{
            System.out.println("player bust");
        }


    }
}
