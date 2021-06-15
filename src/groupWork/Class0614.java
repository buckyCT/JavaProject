package groupWork;

public class Class0614 {

	public static void main(String[] args) {
		
		String x = "AxyzB";
		
		//System.out.println(xyzMiddle(x));
		
		System.out.println(xyzMiddle2(x));

	}
	
	public static boolean xyzMiddle(String x) {
		
		if( x.substring( (x.length()/2)-2, (x.length()/2)+2 ).contains("xyz") ) {
			return true;
		}
		
		return false;
	}
	
	public static boolean xyzMiddle2(String y) {
		
		
		String actual1 = y.substring(0, y.indexOf('x'));
		String actual2 = y.substring(y.indexOf('z')+1);
		
		int len1 = actual1.length();
		int len2 = actual2.length();
		
		if(len1-len2 == -1 || len1-len2 == 0 || len1-len2 ==1) {
			return true;
		}
		return false;
		
	}

}
