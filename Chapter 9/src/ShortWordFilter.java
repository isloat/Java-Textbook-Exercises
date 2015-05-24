import java.util.*;

public class ShortWordFilter implements Filter {
	public boolean accept(Object x) {
		return x.toString().length() < 5;
	}
	
	public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter filter) {
		ArrayList<Object> collected = new ArrayList<Object>();
		
		for (Object object : collected) {
			if (filter.accept(object)) {
				collected.add(object);
			}
		}
		
		return collected;
	}
}
