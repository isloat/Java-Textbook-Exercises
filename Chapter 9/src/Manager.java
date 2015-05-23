/*
 * Exercise 9.9.
 */
public class Manager extends Employee {
	private String department;
	
	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return this.department;
	}
}
