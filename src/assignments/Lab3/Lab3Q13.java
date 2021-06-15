package assignments.Lab3;

public class Lab3Q13 {

	public static void main(String[] args) {
		
		System.out.println(doubleChar("The-End"));

	}
	
	public static String doubleChar(String str) {
		
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			for(int j = 1; j<3; j++) {
				result = result.concat(str.substring(i, i+1));
			}
		}
		
		return result;
		
	}

}
