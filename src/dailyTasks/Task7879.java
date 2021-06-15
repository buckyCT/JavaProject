package dailyTasks;

public class Task7879 {

	public static void main(String[] args) {
		
		String word = "abcabqcabc";
		int count=0;
		char c = 'a';
		
		for(int i=0; i < word.length(); i++) {
			
			char t = word.charAt(i);
			
			if(t == c) {
				count++;
			}
			
		}
		
		System.out.println("number of " + c + " in "  + word + " is: " + count);
		
		
		//79
		String word2 = "Cybertek School";
		
		for(int i=0; i < word2.length(); i++) {
			
			char t = word2.charAt(i);
			
			if(t=='a'||t=='e'||t=='o'||t=='u'||t=='i') {
				System.out.print(t + " ");
				
			}
			
		}
		
		
		

	}

}
