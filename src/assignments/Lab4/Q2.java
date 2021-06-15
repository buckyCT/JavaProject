package assignments.Lab4;

public class Q2 {

	public static void main(String[] args) {
		
		int x[] = { 1,2,3,4,1 };
		q2(x);

	}
	
	public static boolean q2(int[] arr) {
		
		if(arr.length<2) {
			System.out.println("not a valid array");
			return false;
		}
		
		if(arr[0]==arr[arr.length-1]) {
			System.out.println(true);
			return true;
		}
		else {
			System.out.println(false);
			return false;
		}
		
	}

}
