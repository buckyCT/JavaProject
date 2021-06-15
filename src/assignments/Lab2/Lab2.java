package assignments.Lab2;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		q3();
		
	}
	
	public static void q1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter your second number: ");
		int n2 = sc.nextInt();
		
		int[]arr;
		arr = new int[5];
		arr[0]=n1; arr[1]=n2;
		int temporary;
		
		for(int i = 2; i < 5; i++) {
			
			System.out.print("Do you want to add another number? (limit is 5) 0-NO, 1-YES");
			int a = sc.nextInt();
			
			if(a==1) {
				
				System.out.print("Enter your next number: ");
				int n3 = sc.nextInt();
				arr[i] = n3;
				
				
			}
			else if(a==0){
				
				break;
			}else {
				System.out.println("you should enter either 1 or 0 !");
				break;
			}
		}
		
//		System.out.print("all numbers you have entered are: ");
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {                 //we find a number which is bigger than the next one
					temporary = arr[i];				//and we swap their positions
					arr[i] = arr[j];
					arr[j] = temporary;
					
				}
			}										//when these loops end, the last int in array is biggest
		}											//we print that
		System.out.println("biggest number you have entered is: " + arr[arr.length-1]);
		
//		System.out.print("all numbers you have entered are: ");
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				System.out.println("smallest number you have entered is: " + arr[i]);
				break;
			}
		}
		
		
		sc.close();
		
	}
	
	public static void q2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many cookies did you eat? ");
		int eaten = sc.nextInt();
		
		//40 cookies is 10 servings, so 1 serving is 4 cookies and 300 calories
		//so 1 cookie is 75 calorie 
		
		int calGained = eaten*75;
		
		System.out.println("by eating " + eaten + " cookies, you gained: " + calGained + " calories.");
		sc.close();
	}
	
	public static void q3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a positive non zero integer value: ");
		int x = sc.nextInt();
		int sum=0;
		
		if(x>0) {
			for(int i = 1; i<=x; i++) {
				sum = sum + i;
			}
			System.out.println("sum of all number from 0 to " + x + " are " + sum);
		}else System.out.println("you didnt enter a valid number");
		sc.close();
		
	}
	
	public static void q4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of males: ");
		int m = sc.nextInt();
		System.out.print("Number of females: ");
		int f = sc.nextInt();
		
		int pOfM, pOfF;
		
		pOfM = (100*m)/(m + f);
		pOfF = 100-pOfM;
		System.out.println("%" + pOfM + " is male and %" + pOfF + " is female");
		sc.close();
		
	}
	
	public static void q5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter charge of the meal: ");
		int charge = sc.nextInt();
		
		double tax = charge * 6.75 / 100;
		
		double tip = (charge+tax)/5;
		
		double total = charge+tip;
		
		total = Math.round(total*100);
		total = total/100;
		
		System.out.println(	"your charge: " + charge + "\nyour tax: " + tax + "\nyour tip: " + tip 
							+ "\nyour total fee is: " + total);
		sc.close();
		
	}
	
	public static void q6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter charge: ");
		int charge = sc.nextInt();
		
		double stTax = charge/25.0;
		double coTax = charge/50.0;
		double totalTax = stTax+coTax;
		double totalCharge = charge + totalTax;
		
		System.out.println("your charge: " + charge + "\nstate tax: " + stTax + "\ncountry tax: " +
							coTax + "\ntotal tax: " + totalTax + 
							"\nyour total charge is: " + totalCharge);
		sc.close();
		
	}
	
	
	
	
	
	
	
	
	
	

}
