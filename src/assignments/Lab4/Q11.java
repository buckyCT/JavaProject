package assignments.Lab4;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {
		
		int x[] = { 1,2,3,4,1,3,2,3,6  };
		
		foll23(x);

	}
	
	public static String foll23(int x[]) {
		
		for(int i=0; i<x.length-1; i++) {
			
			if(x[i]==2 && x[i+1]==3) {
				
				x[i+1] = 0;
				
			}
			
		}
		
		System.out.println(Arrays.toString(x));
		
		return Arrays.toString(x);
		
	}

}
