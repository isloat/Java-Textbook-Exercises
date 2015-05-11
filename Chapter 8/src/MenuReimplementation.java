import java.util.*;

/* This will reimplement the Menu class from Chapter 8 so that it stores all
 * menu items in one long string.
 */
public class MenuReimplementation {
	private String options;
	private int optionsCount = 0;
	
	public MenuReimplementation() {
		this.options = "";
	}
	
	public void getOptions() {
		System.out.println(options);
	}
	
	public void addOptions(String option) {
		this.optionsCount++;
		this.options += String.format("%s%d)%s=n", this.options, this.optionsCount, option);
	}
	
	public void getInput() {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.print("Choose which option: ");
			choice = input.nextInt();
		} while (choice < 1 || choice > optionsCount);
		input.close();
	}
}
