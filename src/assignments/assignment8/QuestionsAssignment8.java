package assignments.assignment8;

import java.util.Scanner;

public class QuestionsAssignment8 {

	public static void main(String[] args) {
		
//		plus();
//		cube(6);
//		helloWorld();
//		printHollowRect();
//		sign(0);
//		next3();
//		System.out.println(isPalindrome(12321));
//		fib();
//		System.out.println(fib2(9));
//		System.out.println(max(11,5));
//		System.out.println(isEven(8));
//		System.out.println(c_profits(100,1500));
//		System.out.println(hamletQuote(false,false));
//		System.out.println(waterTax(151));
//		System.out.println(threeLocks(false,false,true));
//		System.out.println(validateTask(false,3,2));
//		System.out.println(simpleRoomBook(true,7,2,2018));
//		System.out.println(getThunderBlazz(false,true,9,7,3));

	}
	
	//Q1
	public static void plus() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int x = sc.nextInt();
		
		System.out.println("Enter second number:");
		int y = sc.nextInt();
		
		System.out.println("result: " + (x+y));
		sc.close();
		
		
	}
	
	//Q2=====================================
	
	public static void cube(int x) {
		System.out.println(x*x*x);
	}
	
	//Q3====================================
	
	public static String hello() {
		return "Hello";
	}
	
	public static String world() {
		return "World!";
	}
	
	public static void helloWorld() {
		System.out.println(hello() + " " + world());
	}
	
	//Q4====================================
	
	public static void printHollowRect() {
		
		for(int i = 1; i<=5; i++) {
			if(i==1 || i==5) {
				System.out.println("*****");
			}else {
				System.out.println("*   *");
			}
		}
	}
	
	//Q5===================================
	
	public static void sign(int x) {
		
		if(x>0) System.out.println(1);
		else if(x==0) System.out.println(0);
		else System.out.println(-1);
		
	}
	
	//Q6===================================
	
	public static void next3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number:");
		int x = sc.nextInt();
		
		System.out.println("next 3 are:\n" + ++x + " " + ++x + " " + ++x);
		
		sc.close();
		
	}
	
	//Q7===============================
	
	public static boolean isPalindrome(int x) {
		
		int remainder,sum=0,temporary;
		
		temporary = x;
		
		while(x>0) {
			
			remainder = x%10;
			
			sum = sum*10 + remainder;
			
			x=x/10;
			
		}
		if(temporary == sum) return true;
		else return false;
		
	}
	
	//Q8=====================================
	
	public static void fib() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number:");
		
		int x = sc.nextInt();
		int n1=0, n2=1, n3=n2+n1;
		
		for(int i = 3; i<x; i++) {
			
			int next = n3+n2;
			n2=n3;
			n3=next;
			
		}
		System.out.println(n3);
		sc.close();
	}
	
//	public static int fib2(int x) {
//		if(x<=1) return x;
//		
//		return fib2(x-1)+fib2(x-2);
//	}
	
	//Q9===============================
	
	public static int max(int x, int max) {
		
		if(x>max) return max;
		return x;
		
	}
	
	//Q10============================
	
	public static boolean isEven(int x) {
		if(x%2==0)return true;
		return false;
	}
	
	//Q11============================
	
	public static int buyPrice(int x) {
		return x;
	}
	public static int sellPrice(int x) {
		return x;
	}
	public static String c_profits(int x, int y) {
		
		x=buyPrice(x);
		y=sellPrice(y);
		
		if(x>y) return "loss";
		else if(x==y) return "no loss";
		return "profit";
		
	}
	
	//Q12====================================
	
	public static boolean hamletQuote(boolean x, boolean y) {
		
		if(x || y) return true;
		return false;
		
	}
	
	//Q13================================
	
	public static double waterTax(double x) {
		
		double bill;
		
		if(x<=50) { bill = x*0.6; }
		else { bill = x*0.9; }
		
		if(x>100 && x<150) { bill += 50; }
		if(x>=150) { bill += 100; }
		
		return bill;
		
	}
	
	//Q14================================
	
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		
		if( (a&&b) || c ) return true;
		return false;
		
	}
	
	//Q15==============================
	
	public static boolean validateTask(boolean b, int x, int y) {
		
		if(b && x-1==y) return true;
		else return false;
		
	}
	
	//Q16==============================
	
	public static boolean simpleRoomBook(boolean b, int x, int y, int z) {
		
		if( !b || z!=2018 || (x==7 && y>=1 && y<=8) ) {
			return false;
		}else return true;
		
	}
	
	//Q17==============================
	
	public static boolean getThunderBlazz(boolean a, boolean b, int x, int y, int z) {
		
		if((a||b) || (x==1 && y==2 && z==3) || (x==3 && y==1 && z==2)) {
			return true;
		}else return false;
		
	}

}
