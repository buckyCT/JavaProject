package replit.part4_loops;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        int i=1;
        boolean devam=true;

        while (devam && i<=10){
            System.out.println("Enter Item"+i+" and its price:");

            item = scan.next();
            price = scan.nextDouble();

            totalPrice += price;

            shoppingListReport += "Item" + i + ": " + item + " Price: " + price;

            System.out.println("Add one more item?");

            countinue = scan.next();

            if(countinue.equals("no")){
                devam = false;
            }else{
                shoppingListReport += ", ";
            }

            i++;
        }

        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);

    }
}
