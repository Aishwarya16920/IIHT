package interfaces;

import java.util.Comparator;

public class SortByWeight implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return Integer.compare(o1.weight, o2.weight);
	}

}
