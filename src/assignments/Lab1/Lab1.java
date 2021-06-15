package assignments.Lab1;

public class Lab1 {

	public static void main(String args[]) {

		stringTimes("Hi", 2);
		love6(2, 4);
		specialEven(21);
		deerPlay(95, true);
		caughtSpeeding(81, true);
		cigarParty(70, true);
	}
	
	
	
	
	// ---------------------
	// Q1
	public static void stringTimes(String s, int a) {
		while (a >= 0) {
			for (int i = 1; i <= a; i++) {
				System.out.print(s);
			}
			System.out.println();
			break;
		}
	}

	// -----------------
	// Q2
	public static void love6(int x, int y) {
		boolean z;
		if (x == 6 || y == 6) {
			z = true;
		} else if (x + y == 6 || x - y == 6 || y - x == 6) {
			z = true;
		} else
			z = false;
		System.out.println(z);
	}

	// ------------------
	// Q3
	public static void specialEven(int x) {
		boolean z;
		if (x % 11 == 0 || x % 11 == 1) {
			z = true;
		} else
			z = false;
		System.out.println(z);
	}

	// ------------------
	// Q4
	public static void deerPlay(int x, boolean isSummer) {
		boolean z;
		if (x >= 60 & x <= 90) {
			z = true;
		} else if (x >= 60 & x <= 100 & isSummer == true) {
			z = true;
		} else
			z = false;
		System.out.println(z);
	}

	// ------------------
	// Q5
	public static void caughtSpeeding(int x, boolean birthday) {
		int y;
		while (x > 0) {

			if (birthday == true) {
				x -= 5;
			}

			if (x <= 60) {
				y = 0;
			} else if (x <= 80) {
				y = 1;
			} else {
				y = 2;
			}
			System.out.println(y);
			break;
		}

	}

	// ------------------------
	// Q6
	public static void cigarParty(int x, boolean isWeekend) {
		boolean z;
		if (x >= 40 & x <= 60) {
			z = true;
		} else if (x > 60 && isWeekend == true) {
			z = true;
		} else
			z = false;
		System.out.println(z);
	}

}
