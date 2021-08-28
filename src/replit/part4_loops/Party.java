package replit.part4_loops;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String nameList = "";
        String cont = "";
        boolean bool = true;

        while (bool){

            System.out.println("Please enter guest name:");

            name = input.next();
            nameList += name;

            System.out.println("Do you want to enter new guest name:");
            cont = input.next();

            if(cont.equals("no")){
                bool = false;
            }else{
                nameList += ", ";
            }

        }

        System.out.println("Guest's list: " + nameList);
    }
}
