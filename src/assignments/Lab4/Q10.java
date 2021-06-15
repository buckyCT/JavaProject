package assignments.Lab4;

public class Q10 {

	public static void main(String[] args) {
		
		int[] x = { 1,2,3,4,2,2,3,5 };
		has23twice(x);

	}
	
	public static boolean has23twice(int[] x) {
		
		int c2=0, c3=0;
		
		for(int i=0; i<x.length; i++) {
			
			if(x[i]==2) c2++;
			if(x[i]==3) c3++;
			
		}
		
		if(c2==2 || c3==2) {
			System.out.println(true);
			return true;
		}
		else { 
			System.out.println(false);
			return false;
		}
		
		
		
		
		
	}

}
