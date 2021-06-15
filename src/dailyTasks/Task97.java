package dailyTasks;

public class Task97 {

	public static void main(String[] args) {
		
		String s1 = "$ab@-/c*d";
		String s2 = "";
		
		for(int i=0; i<s1.length(); i++) {
			
			char c = s1.charAt(i);
			
			if(Character.isLetter(c)) {
				
				s2 += c;
			}
		}
		
		System.out.println(s2);

	}

}
