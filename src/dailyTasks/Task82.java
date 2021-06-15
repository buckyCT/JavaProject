package dailyTasks;

import java.util.Scanner;

public class Task82 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String username = "bucky";
		String password = "alex";
		
		System.out.print("enter username:");
		String inUser = sc.nextLine();
		
		System.out.print("enter password:");
		String inPass = sc.nextLine();
		
		if(inUser.equals(username) && inPass.equals(password)) {
			System.out.println("Success!");
		}
		else if(inUser.equals("") && inPass.equals("")) {
			System.out.println("username and password can not be empty");
		}
		else if(inUser.equals("") && !inPass.equals("")) {
			System.out.println("username can not be empty");
		}
		else if(!inUser.equals("") && inPass.equals("")) {
			System.out.println("password can not be empty");
		}
		else if(!inUser.equals(username) || !inPass.equals(password)){
			System.out.println("Invalid username or password!");
		}
		
		sc.close();

	}
	
}
