package assignments.Lab4;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		
		int[] a = { 1,2,3,4,5 };
		int[] b = { 4,5,9,0 };
		
		concatArr(a, b);

	}
	
	public static void concatArr(int[] x, int[] y) {
		
		int[] arr = new int[x.length+y.length];
		
		for(int i=0; i<x.length; i++) {
			arr[i] = x[i];
		}
		
		for(int i=x.length; i<arr.length; i++) {
			arr[i]=y[i-x.length];
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
