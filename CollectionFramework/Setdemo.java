package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Emp123> s = new HashSet<Emp123 >();
		s.add(new Emp123(1,"palak"));
		s.add(new Emp123(1,"palak"));
		s.add(new Emp123(2,"gagan"));
		
		for(Emp123 b :s)
		{
			System.out.println(b.id + " "+ b.name);
		}

	}

}
