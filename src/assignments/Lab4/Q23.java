package assignments.Lab4;

import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {
		
		createArr(7);

	}
	
	public static void createArr(int x) {
		
		int[] arr = new int[x];
		
		for(int i=0; i<x; i++) {
			arr[i]=i;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
