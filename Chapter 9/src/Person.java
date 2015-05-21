/*
 * Implement a superclass Person. Make two classes, Student and Instructor, that inherit
 * from Person.
 * 
 * A person has a name and a year of birth.
 * 
 * A student has a major, and an instructor has a salary.
 */
public class Person {
	private String name;
	private int birthYear;
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBirthYear() {
		return this.birthYear;
	}
}
