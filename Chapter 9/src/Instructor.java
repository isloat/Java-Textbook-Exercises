/*
 * Extensions of Person superclass.
 */
public class Instructor extends Person {
	private int salary;
	
	public Instructor(String name, int birthYear, int salary) {
		super(name, birthYear);
		this.salary = salary;
	}
	
	public int getSalary() {
		return this.salary;
	}
}
