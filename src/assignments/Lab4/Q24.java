package assignments.Lab4;

public class Q24 {

	public static void main(String[] args) {
		
		int[] x = { 1,2,1,3 };
		everywhere(x, 2	);

	}
	
	public static boolean everywhere(int[] x, int y) {
		
		boolean res = false;
		
		for(int i=0; i<x.length-2; i++) {
			
			if(x[i]==y && (x[i+1]==y || x[i+2]==y)) {
				
				res = true;
			}
		}
		
		System.out.println(res);
		return res;
		
	}

}
