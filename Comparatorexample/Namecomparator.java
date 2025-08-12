package Comparatorexample;

import java.util.Comparator;

public class Namecomparator implements Comparator<Studendata>
{

	@Override
	public int compare(Studendata o1, Studendata o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
		
	}

}
