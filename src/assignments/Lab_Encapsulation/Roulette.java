package assignments.Lab_Encapsulation;

public class Roulette {
	
	private int pocketNumber;
	
	public Roulette(int pocketNumber) {
		this.pocketNumber=pocketNumber;
	}
	
	public String getPocketColor() {
		
		if(pocketNumber==0) {
			return "Green";
		}
		else if( ((pocketNumber>=1 && pocketNumber<=10) || (pocketNumber>=19 && pocketNumber<=28)) && (pocketNumber%2==1) ) {
			return "Red";
		}
		else if( ((pocketNumber>=11 && pocketNumber<=18) || (pocketNumber>=29 && pocketNumber<=36)) && (pocketNumber%2==0) ) {
			return "Red";
		}
		else if( ((pocketNumber>=11 && pocketNumber<=18) || (pocketNumber>=29 && pocketNumber<=36)) && (pocketNumber%2==1) ) {
			return "Black";
		}
		else if( ((pocketNumber>=1 && pocketNumber<=10) || (pocketNumber>=19 && pocketNumber<=28)) && (pocketNumber%2==0) ) {
			return "Black";
		}
		else {
			return "Invalid pocket number";
		}
		
	}

}
