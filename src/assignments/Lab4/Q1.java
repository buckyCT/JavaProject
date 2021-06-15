package assignments.Lab4;

public class Q1 {

	public static void main(String[] args) {
		
		int[] x = { 6,1,2,3,6,4,5 };
		
		System.out.println(q1(x));

	}
	
	public static boolean q1(int[] arr) {
		
		if(arr.length<1) {
			return false;
		}
		
		if(arr[0]==6 || arr[arr.length-1]==6) {
			
			return true;
			
		}
		
		return false;
		
	}

}
