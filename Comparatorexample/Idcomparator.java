package Comparatorexample;

import java.util.Comparator;

public class Idcomparator implements Comparator<Studendata> {

	@Override
	public int compare(Studendata o1, Studendata o2) {
		// TODO Auto-generated method stub
		if (o1.id == o2.id) {
			return 0;
		} else if (o1.id > o2.id) {
			return 1;
		} else {
			return -1;
		}
	}

}
