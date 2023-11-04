package interfaces;

import java.util.Comparator;

public class SortByHeight implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return Integer.compare(o1.height_in_inches, o2.height_in_inches);
	}

}
