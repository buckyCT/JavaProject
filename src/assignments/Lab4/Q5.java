package assignments.Lab4;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,4,5,6,7 };
		
		rotateArray(arr);

	}
	
	public static String rotateArray(int[] x) {
		
		int[] y = new int[x.length];
		
		for(int i=0; i<x.length-1; i++) {
			
			y[i] = x[i+1];
			
			if(i==x.length-2) {
				
				y[x.length-1]=x[0];
				break;
			}
			
		}
		
		String arr = Arrays.toString(y);
		System.out.println(arr);
		return arr;
		
	}

}
