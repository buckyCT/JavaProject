package groupWork;

public class Class0615 {

	public static void main(String[] args) {
		
		String x = "fez day ozzy65 zeynep";
		countYZ(x);

		int[] a = {1};
		int[] b = {1,2,2,3};
		int[] c = {3,4,4,3};
		int[] d = {1,2,3,2,4};
		System.out.println(scoreIncreasing(a));
		System.out.println(scoreIncreasing(b));
		System.out.println(scoreIncreasing(c));
		System.out.println(scoreIncreasing(d));

	}
	
	public static void countYZ(String str) {
		
		String arr[] = str.split(" "); //{ "fez", "day" }
		
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(Character.isLetter(arr[i].charAt(arr[i].length()-1))) {
				
				if(arr[i].charAt(arr[i].length()-1)=='y' || arr[i].charAt(arr[i].length()-1)=='z') {
					count++;
				}
			}else {
				
				if(arr[i].charAt(arr[i].length()-2)=='y' || arr[i].charAt(arr[i].length()-2)=='z') {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static boolean scoreIncreasing(int arr[]){

		boolean result = true;

		if(arr.length>1){
			for(int i=0; i<arr.length-1; i++){

				if(arr[i]<=arr[i+1]){ continue; }
				else{ result=false; }
			}
		}else{
			result=false;
			System.out.print("invalid array ");
		}
		return result;
	}
}
