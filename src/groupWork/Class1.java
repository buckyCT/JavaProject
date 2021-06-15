package groupWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Class1 {

	public static void main(String[] args) {
		
		String arr1[] = { "A", "B", "C" };
		String arr2[] = { "D", "E", "F", "G" };
		
		
		System.out.println(method(arr1, arr2));
		
	}
	
	public static ArrayList<String> method(String array1[], String array2[]){
		
		ArrayList<String> array = new ArrayList<>();
		
		array.addAll(Arrays.asList(array1));
		array.addAll(Arrays.asList(array2));
		
		return array;
		
	}

}
