/* This program will add a method, undo(), that adds
 * a button that allows an operator to
 * undo an accidental button click. 
 * 
 * Make sure that the operator cannot click this button more
 * often than they can click the count button.
 * 
 * Extension of Exercise 8.2 from the book.
 */
public class UndoButton {
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public void count() {
		value++;
	}	
	
	public void undo() {
		if (value > 0) {
			value --;
		}
	}
	
	public void reset() {
		value = 0;
	}
}
