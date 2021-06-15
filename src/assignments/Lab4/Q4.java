package assignments.Lab4;

public class Q4 {

	public static void main(String[] args) {
		
		int[] arr = { 3,-2,10,4 };
		
		sumArr(arr);

	}
	
	public static int sumArr(int[] x) {
		
		int sum=0;
		
		for(int each: x) {
			
			sum += each;
			
		}
		
		System.out.println(sum);
		return sum;
		
	}

}
