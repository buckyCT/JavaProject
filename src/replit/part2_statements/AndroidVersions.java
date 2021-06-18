package replit.part2_statements;

import java.util.Scanner;

public class AndroidVersions {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();

        //WRITE YOUR CODE HERE:

        double[] versions = {1.5,1.6,2.1,2.2,2.3,3.1,4.0,4.1,4.4,5.0,8.0,9.0};
        String[] names={"Cupcake","Donut","Eclair","Froyo","Gingerbread","Honeycomb","Ice Cream Sandwich","Jelly Bean","KitKat","Lollipop","Oreo","Pie"};
        //System.out.println(versions.length+" "+names.length);


        label: do{
            for (int i = 0; i<versions.length; i++){
                if(version==versions[i]){
                    System.out.println(names[i]);
                    break label;
                }
            }
            System.out.println("Sorry, I don't know this version!");
        }while(false);

    }
}
