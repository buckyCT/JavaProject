package groupWork;

public class Class4 {

	public static void main(String[] args) {
		
		String x = "fez day ozzy65 zeynep";
		countYZ(x);

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

}
