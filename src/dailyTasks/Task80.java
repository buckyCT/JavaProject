package dailyTasks;

public class Task80 {

	public static void main(String[] args) {
		
		checkedString("Aviation is love", "love");

	}
	
	public static void checkedString(String x, String y) {
		
		if(x.indexOf(y)>-1) {
			System.out.println("Position of " + y + " in " + x + " is: " + x.indexOf(y));
		}else {
			System.out.println("not found...");
		}
		
	}

}
