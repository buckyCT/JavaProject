package assignments.Lab3;

public class Lab3Q12 {

	public static void main(String[] args) {
		
		System.out.println(countCatDog("catsadfdog"));

	}

	public static boolean countCatDog(String str) {

		int cat = 0;
		int dog = 0;

		for (int i = 0; i < str.length() - 2; i++) {

			if (str.substring(i, i + 3).equals("cat")) {
				cat++;
			}
			if (str.substring(i, i + 3).equals("dog")) {
				dog++;
			}

		}
//		for (int i = 0; i < str.length() - 2; i++) {
//
//			if (str.substring(i, i + 3).equals("dog")) {
//				dog++;
//			}
//
//		}
		if(cat==dog) return true;
		else return false;

	}
}
