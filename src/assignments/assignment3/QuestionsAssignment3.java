package assignments.assignment3;

public class QuestionsAssignment3 {

	public static void main(String args[]) {
		
		//Q1
		double gallon=15,liter;
		liter = 3.78541178 * gallon;
		System.out.println(gallon + " gallon is " + liter + " liter");
		
		//=================
		//Q2
		String name = "Ozzy";
		int birthYear = 2006; int age = 2021-birthYear;
		System.out.println("Hello " + name + "! Based on your input, your age is " + 
		age + " :)");
		
		//============================
		//Q3
		double width=4.5, height=7.9, area = width*height;
		System.out.println(area);
		
		//=========================
		//Q4
		int n1=10, n2=20;
		n1=n1+n2; n2=n1-n2; n1=n1-n2;
		System.out.println(n1 + ", " + n2);
		
		//=========================
		//Q5
		int inSeconds = 3695;
		int hours=0, minutes=0, seconds=0;
		
		seconds = inSeconds%60;
		minutes = inSeconds/60;
		
		hours = minutes/60;
		minutes = minutes%60;
		
		System.out.println(inSeconds + " seconds is, " + hours + " hours " + minutes + 
				" minutes and " + seconds + " seconds");
		
		//============================
		//Q6
		double cafMili=500;
		double cafOverInMili=10000;
		double cafNeedDrinks = cafOverInMili/cafMili;
		
		System.out.println("Number of miligrams in drink: " + cafMili);
		System.out.println("It would take about " + cafNeedDrinks + " drinks for a lethal overdose");
		
		//==============================
		//Q7
		int priceInCents = 55;
		int change = 100-priceInCents;
		int quarter=0, dimes=0, nickles=0;
		
		quarter = change/25;
		change = change%25;
		
		dimes = change/10;
		change = change%10;
		
		nickles = change/5;
		change = change%5;
		
		System.out.println("Your change is " + quarter + " quarters, " + dimes + 
				" dimes, " + "and " + nickles + " nickles");
		
		
		
		
		
		
	}

}
