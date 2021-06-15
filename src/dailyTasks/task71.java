package dailyTasks;

public class task71 {

	public static void main(String[] args) {
		
		calcFeetInchesToCm(100);
		calcFeetInchesToCm(6, 5);
		
	}
	
	public static double calcFeetInchesToCm(double feet, double inches) {
		
		double feetCm = 30.48 * feet;
		double inchCm = 2.54 * inches;
		double sum = feetCm+inchCm;
		
		if(feet >= 0 && inches >= 0 && inches <=12) {
			System.out.println(feet + " feet and " + inches + " inches are "
								 + sum + " cm");
			return sum;
			
		}else {System.out.println("Invalid"); return -1;}
	}
	
	
	
	
	
	
	
	
	public static double calcFeetInchesToCm(double inches) {
		
		double inchesRemaining = inches % 12;
		double inchInFeet = (inches-inchesRemaining) / 12;
		
		
		
		if(inches>=0) {
			
			System.out.println(inches + " inches=" + inchInFeet + 
								" feet and " + inchesRemaining + " inches");
			
			double cm = calcFeetInchesToCm(inchInFeet, inchesRemaining);
			
			return cm;
			
		}else { System.out.println("Invalid");  return -1;}
	}
	
	
	
	
	
	
	

}
