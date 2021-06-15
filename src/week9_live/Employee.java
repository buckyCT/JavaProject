package week9_live;

public class Employee {
	
	String name, jobTitle;
	int id;
	double salary;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, String jobTitle) {
		this(name);
		this.jobTitle = jobTitle;
	}
	
	public Employee(String name, String jobTitle, int id) {
		this(name,jobTitle);
		this.id = id;
	}
	
	public Employee(String name, String jobTitle, int id, double salary) {
		this(name,jobTitle, id);
		this.salary = salary;
	}
	
	public void toStringg() {
		System.out.println("Employee [name=" + name + ", jobTitle=" + jobTitle + ", ID=" + id + ", salary=" + salary + "]");
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee("keko","balici",13,140);
		emp.toStringg();
	}

}
