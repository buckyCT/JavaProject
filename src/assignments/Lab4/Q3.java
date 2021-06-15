package assignments.Lab4;

public class Q3 {

	public static void main(String[] args) {
		
		int[] x = { 1,2,3 };
		int[] y = { 1 };
		
		firstLast(x, y);

	}
	
	public static boolean firstLast(int[] arr1, int arr2[]) {
		
		if(arr1.length<2) {
			System.out.println("array1 is not valid");
			return false;
		}
		if(arr2.length<2) {
			System.out.println("array2 is not valid");
			return false;
		}
		
		if(arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1]) {
			
			System.out.println(true);
			return true;
			
		}else {
			
			System.out.println(false);
			return false;
			
		}
		
	}

}
