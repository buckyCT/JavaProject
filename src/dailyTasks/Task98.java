package dailyTasks;

public class Task98 {

	public static void main(String[] args) {
		
		String s1 = "\"&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$\"";
		String s2 = "\"N%&/(%(/i%&/n%$)&%&/e 2574354^¨*¨¨^T44==hr$%%&e__¨\"_~``e !·|€€F()=;;ou3257r==";
		
		decodeTheCode(s1);
		decodeTheCode(s2);

	}
	
	public static String decodeTheCode(String s) {
		
		String dummy = "";
		
		for(int i=0; i<s.length(); i++) {
			
			if(Character.isLetter(s.charAt(i))) {
				dummy += s.charAt(i);
			}
		}
		
		dummy = dummy.toLowerCase();
		
		dummy = dummy.replace("one", "1 ");
		dummy = dummy.replace("two", "2 ");
		dummy = dummy.replace("three", "3 ");
		dummy = dummy.replace("four", "4 ");
		dummy = dummy.replace("five", "5 ");
		dummy = dummy.replace("six", "6 ");
		dummy = dummy.replace("seven", "7 ");
		dummy = dummy.replace("eight", "8 ");
		dummy = dummy.replace("nine", "9 ");
		dummy = dummy.replace("zero", "0 ");
		
		dummy = dummy.trim();
		
		System.out.println(dummy);
		
		return dummy;
	}
}
