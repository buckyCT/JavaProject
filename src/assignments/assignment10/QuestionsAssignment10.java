package assignments.assignment10;

import java.util.Scanner;

public class QuestionsAssignment10 {

	public static void main(String[] args) {
		
//		hasJava();
//		charPrint();
//		multiString();
//		System.out.println(countJavaString());
		System.out.println(factor(6));
//		System.out.println(prefix());
//		findId();
//		sandwich();
//		System.out.println(countJavaPython());
//		mergeStrings("java","selenium");
//		uniqueChars("java");
//		coverString("apples", "pears");
//		clean("he said bla bla bla","bla");
//		limit("bla bla",3);
//		at3("blabla","a");
//		isPalindrome("Ma dda m");

	}
	
	//Q16
	
	public static void hasJava() {
		
		Scanner sc = new Scanner(System.in);
		String x;
		
		do {
			x="";
			System.out.println("enter a string more than 3 characters: ");
			x = x.concat(sc.nextLine());
			
		}while(x.length()<4);
		
		if(x.indexOf("java")==0 || x.indexOf("java")==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}sc.close();
	}
	
	//Q17====================================
	
	public static void charPrint() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter chars:");
		
		char x = sc.nextLine().charAt(0);
		char y = sc.nextLine().charAt(0);
		
		int a=x, b=y;
		
		for(int i = a; i<=b; i++) {
			System.out.print((char) i);
		}
		
	}
	
	//Q18=======================================
	
	public static void multiString() {
		
		String a = "Word";
		String b = "X";
		int c = 4;
		
		for(int i=1; i<=c; i++) {
			
			System.out.print(a);
			if(i==c) {
				break;
			}
			System.out.print(b);
			
		}
	}
	
	//Q19==========================================
	
	public static int countJavaString() {
		
		Scanner sc = new Scanner(System.in);
		String x = "java";
		int count=0;
		
		System.out.println("enter a string");
		String input = sc.nextLine();
		sc.close();
		
		for(int i = 0; i<input.length()-3; i++) {
			
			if(input.substring(i, i+4).equalsIgnoreCase(x)) {
				++count;
			}
			
		}return count;
		
	}
	
	//Q20=================================================
	
	public static int factor(int x) {
		
		int result=1;
		for(int i=1; i<=x; i++) {
			
			result = i*result;
			
		}
		return result;
	}
	
	//Q21=================================================
	
	public static boolean prefix() {
		
		String str = "abXYabc";
		int x = 2;
		
		for(int i = x; i<str.length()-x+1; i++) {
			
			if( str.substring(0, x).equalsIgnoreCase(str.substring(i, i+x))  ) {
				
				System.out.println(str.substring(0, x) + " appears multiple times!");
				return true;
			}
			
		}
		System.out.println(str.substring(0, x) + " appears once only!");
		return false;
		
	}
	
	//Q22==================================================
	
	public static void findId() {
		
		String code = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		
		if(code.contains("<html>")) {
			
			int a = code.indexOf("id=\"");
			String str = code.substring(a+4);    //+4 is length of (id=") which is 4
			String result = str.substring(0, str.indexOf("\""));
			System.out.println(result);
			
		}
		else {
			System.out.println("Invalid input!");
		}
		
	}
	
	//Q23==============================================
	
	public static void sandwich() {
		
		String str = "breadbutterbread";
		String temp = "";
		
		if(str.contains("bread")) {
			
			int pos = str.indexOf("bread");
			
			temp = temp + str.substring(pos+5);
			
			if(temp.contains("bread")) {
				
				temp = temp.substring(0, temp.indexOf("bread"));
				
				System.out.println(temp);
				
			}	
			else {
				temp = "";
				System.out.println("nothing");
			}
			
			
		}else {
			System.out.println("nothing");
		}
		
	}
	
	//Q24===================================
	
	public static boolean countJavaPython() {
		
		String str = "What's the difference between java, javascript and python?";
		int cJava=0, cPython=0;
		
		for(int i=0; i<str.length()-5; i++) {
			
			if(str.substring(i, i+4).equals("java")) {
				cJava++;
			}
			if(str.substring(i, i+6).equals("python")) {
				cPython++;
			}
			
		}
//		System.out.println(cJava + "\n" + cPython);
		if(cJava==cPython) return true;
		else return false;
		
	}
	
	//Q25===========================================
	
	public static String mergeStrings(String s1, String s2) {
		
		
//		String s1 = "wooden";
//		String s2 = "spoon";
		String result = "";
		
		for(int i = 0; i<s1.length() || i<s2.length(); i++) {
			
			if(i>=s1.length()) {
				
				result = result + s2.charAt(i);
				
			}
			else if(i>=s2.length()) {
				
				result = result + s1.charAt(i);
				
			}else {
				result = result + s1.charAt(i);
				result = result + s2.charAt(i);
			}
			
			
			
		}
		
		System.out.println(result);
		return result;
		
	}
	
	//Q26===========================================
	
	public static void uniqueChars(String str) {
		
		String a = "";
		
		for(int i=0; i<str.length(); i++) {
			
			String x = "";
			x = x + str.charAt(i);
			
			if(a.contains(x)) {
				continue;
			}
			
			a = a + x;
			
		}System.out.println(a);
		
	}
	
	//Q27===========================================
	
	public static void coverString(String s1, String s2) {
		
		String result = "";
		
		if(!s1.contains(s2)) {
			result = "[" + s1 + "]";
		}else {
			
			result = s1.replace(s2, "[" + s2 + "]");
			
		}System.out.println(result);
		
	}
	
	//Q28===========================================
	
	public static void clean(String s1, String s2) {
		s1 = s1.replace(s2, "");
		System.out.println(s1);
	}
	
	//Q29===========================================
	
	public static String limit(String str, int x) {
		
		String result = "";
		
		result = str.substring(0, x);
		
		System.out.println(result);
		return result;
		
	}
	
	//Q30===========================================
	
	public static String at3(String s1, String s2) {
		
		String result = s1.substring(0,3) + s2 + s1.substring(3);
		
		System.out.println(result);
		return result;
		
	}
	
	//Q31===========================================
	
	public static boolean isPalindrome(String str) {
		
		String result = "";
		str = str.replace(" ", "");
		
		for(int i=str.length()-1; i>=0; i--) {
			
			result = result + str.substring(i, i+1);
			
		}
		if(result.equalsIgnoreCase(str)) {
			System.out.println(true);
			return true;
		}
		else {
			System.out.println(false);
			return false;
		}
		
	}
	
	
	
	

}
