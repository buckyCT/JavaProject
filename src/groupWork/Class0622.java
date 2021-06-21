package groupWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Class0622 {
    public static void main(String[] args) {

        String a = "ABCDE";
        q1Reverse(a);

        String b = "craig_federighi@apple.com";
        q2Email(b);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("cyber","tek","school","dotcom"));
        System.out.println(list);
        q3GitGud(list);
    }

    public static void q1Reverse(String str){

        String result="";

        if(str.length()>5){ System.out.println("Too long!"); }
        else if(str.length()<5){ System.out.println("Too short!"); }
        else{

            for(int i=str.length()-1; i>=0; i--){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void q2Email(String str){

        String fullName = str.split("@")[0];
        String fullDomain = str.split("@")[1];

        String firstName = fullName.split("_")[0];
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        String lastName = fullName.split("_")[1];
        lastName = lastName.substring(0,1).toUpperCase() + firstName.substring(1);

        String domain = fullDomain.split("\\.")[0];
        String TopDomain = fullDomain.split("\\.")[1];

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + TopDomain);
    }

    public static  void q3GitGud(ArrayList<String> list){

        if(list.size()>2){
            list.set(0,"git");
            list.set(2,"gud");
        }
        System.out.println(list);
    }
}
