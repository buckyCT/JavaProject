package week9_live;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPraactice1 {

	public static void main(String[] args) {

		String[] countryNmes = { "United States of America", "United Kingdom", "Turkey", "Russia" };

		ArrayList<String> countries = new ArrayList<>(Arrays.asList(countryNmes));

		System.out.println(countries);

//		countries.removeIf(each -> each.length() > 10);
//
//		System.out.println(countries);
		
		countries.retainAll(Arrays.asList("Turkey", "United Kingdom"));
		
		System.out.println(countries);

	}

}
