package assignments.Lab4;

import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {
		
		int[] array = { 4,5,10,30,31,32,40,41,10,11 };
		
		System.out.println(Arrays.toString(array));
		mult10(array);
		mult10Version2(array);

	}
	
	public static void mult10(int[] x) {
		
		int temp;
		
	qwe: for(int i=0; i<x.length-1; i++) {
			
			if(x[i] % 10 == 0) {
				
				if(x[i+1] % 10 != 0) {
					
					temp = x[i];
					
					for(int j=i+1; j<x.length-1; j++) {
						
						i=j;
						
						x[j] = temp;
						
						if(x[j+1] % 10 == 0) {
							
							continue qwe;
						}
						
					}
					
					x[x.length-1] = temp;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(x));
		
	}
	
	public static void mult10Version2(int[] x) {
		
		for(int i=0; i<x.length-1; i++) {
			
			if((x[i] % 10 == 0) && (x[i+1] % 10 != 0) ) {
				
				x[i+1] = x[i];
			}
		}
		
		System.out.println(Arrays.toString(x));
	}
	
	
}
