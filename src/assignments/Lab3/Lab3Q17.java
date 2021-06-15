package assignments.Lab3;

public class Lab3Q17 {

	public static void main(String[] args) {
		
		System.out.println(palindrome("Level"));

	}
	
	public static boolean palindrome(String str) {
		
		String x = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			x = x.concat(str.substring(i, i+1));
			
		}
		if(x.replace(" ", "").equalsIgnoreCase(str.replace(" ", ""))) {
			return true;
		}else return false;
		
	}

}
