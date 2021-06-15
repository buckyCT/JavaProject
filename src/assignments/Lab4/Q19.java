package assignments.Lab4;

public class Q19 {

	public static void main(String[] args) {
		
		int[] arr = { 1,2,6,2,3,78,7,1,8 };
		
		sumEx67(arr);

	}
	
	public static void sumEx67(int[] x) {
		
		int sum=0;
		
		label1: for(int i=0; i<x.length; i++) {
			
			if(x[i]==6) {
				
				for(int j=i; j<x.length; j++) {
					
					i=j;
					if(x[j]==7) {
						continue label1;
					}
				}
			}
			else {
				sum+=x[i];
			}
		}
		
		System.out.println(sum);
		
		
	}

}
