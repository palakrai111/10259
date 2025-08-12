package Comparatorexample;

import java.util.ArrayList;
import java.util.Collections;

public class Comstumain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Studendata> al = new ArrayList<Studendata>();
		al.add(new Studendata(3,"palak" ));
		al.add(new Studendata(4,"ba" ));
		al.add(new Studendata(2,"alakrai" ));
		al.add(new Studendata(1,"c" ));
		//System.out.println(al);
		
		for(Studendata  s: al)
		{
			System.out.println(s.id + " "+s.name);
		}
		
		System.out.println("after sorting");
		
		Collections.sort(al, new Idcomparator());
		System.out.println("==");
		for(Studendata  s: al)
		{
			System.out.println(s.id + " "+s.name);
		}
		System.out.println("== sorting y name====");
		Collections.sort(al, new Namecomparator());
		
		for(Studendata  s: al)
		{
			System.out.println(s.id + " "+s.name);
		}
		
		
	}

}
