/*
 * Exercise 9.9.
 */
public class Executive extends Manager {
	private int bonus;
	
	public Executive(String name, int salary, String department, int bonus) {
		super(name, salary, department);
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return this.bonus;
	}
}
