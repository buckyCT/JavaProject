package assignments.Lab_Encapsulation;

public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee(String name, int idNumber, String department, String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}

	public Employee(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
		department="";
		position="";
	}
	
	public Employee() {
		name="";
		idNumber=0;
		department="";
		position="";
	}

}
