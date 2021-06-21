package recording.day32_grocery;

import java.util.Scanner;

public class GroceryListMain {
	
	static Scanner sc = new Scanner(System.in);
	
	static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		
		printInstructions();
		
		boolean quit = false;
		
		int input;
		
		while(!quit) {
			
			System.out.println("Enter your choice");
			input = sc.nextInt();
			sc.nextLine();
			
			if(input==0) {printInstructions();}
			else if(input==1) {System.out.println("Printing grocery items"); groceryList.printGroceryList();}
			else if(input==2) {System.out.println("Adding items to the list"); addItem();}
			else if(input==3) {System.out.println("Modifying items in the list"); modifyItem();}
			else if(input==4) {System.out.println("Removing item from the list"); removeItem();}
			else if(input==5) {System.out.println("Searching item in the list"); searchItem();}
			else if(input==6) {System.out.println("quiting"); quit = true;}
		}

	}
	
	public static void printInstructions() {
		
		System.out.println( "Press"
							+ "\n\t0 - To print choice options."
							+ "\n\t1 - To print the list of grocery items."
							+ "\n\t2 - To add an item to the list."
							+ "\n\t3 - To modify an item in the list."
							+ "\n\t4 - To remove an item from the list."
							+ "\n\t5 - To search an item in the list."
							+ "\n\t6 - To quit application." );
	}

	private static void addItem() {
		
		System.out.println("Enter your grocery item ");
		groceryList.addGroceryItem(sc.nextLine());
	}
	
	private static void modifyItem() {
		
		System.out.println("Enter item number: ");
		int itemNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = sc.nextLine();
		groceryList.modifyGroceryItem(itemNo-1, newItem);
	}
	
	private static void removeItem() {
		
		System.out.println("Enter item number: ");
		int itemNo = sc.nextInt();
		sc.nextLine();
		groceryList.removeGroceryItem(itemNo-1);
	}

	private static void searchItem() {
		
		System.out.println("Enter item to search for: ");
		String searchItem = sc.nextLine();
		
		if(groceryList.findItem(searchItem) != null) {
			System.out.println("Found " + searchItem + " in your grocery list!");
		}else {
			System.out.println(searchItem + " is not in your grocery list!");
		}
	}

	

}
