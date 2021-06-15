package groupWork;

public class Class2 {

	public static void main(String[] args) {
		
		int[] array = { 1,2,3,4,5,6 };
		
		average(array);
		sumEven(array);
		max(array);

	}
	
	public static void average(int[] array) {
		
		double dummy=0;
		
		for(int each: array) {
			dummy = dummy+each;
		}
		
		dummy = dummy/array.length;
		System.out.println(dummy);
		
	}
	
	public static void sumEven(int[] array) {
		
		double dummy=0;
		
		for(int each: array) {
			if(each%2==0) {
				dummy+=each;
			}
		}
		System.out.println(dummy);
	}
	
	public static void max(int[] array) {
		
		int max=0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		
		System.out.println(max);
		
	}

}
