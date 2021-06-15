package assignments.Lab4;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		
		int[] arr = { 110,5,98,0,1200,11,-4 };
		
		maxArr(arr);
		
	}
	
	public static void maxArr(int[] x) {
		
		int max = 0;
		
		for(int i=0; i<x.length; i++) {
			
			if( x[i]>max  ) {
				max = x[i];
			}
			
		}
		
		for(int i=0; i<x.length; i++) {
			x[i]=max;
		}
		
		System.out.println(Arrays.toString(x));
		
	}

}
