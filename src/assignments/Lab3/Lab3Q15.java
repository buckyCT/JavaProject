package assignments.Lab3;

public class Lab3Q15 {

	public static void main(String[] args) {
		
		System.out.println(hasBad("bhdtyx"));

	}
	
	public static boolean hasBad(String str) {
		
		if(str.length()<3) {
			return false;
		}else {
			
			if(str.indexOf("bad")==0 || str.indexOf("bad")==1) {
				return true;
			}
			else return false;
			
		}
		
	}

}
