package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(99);
		a1.add(100);
		a1.add(100);
		a1.add(null);
		a1.add(999000);
		System.out.println(a1);
		
		
		ArrayList<Integer> a3 = new ArrayList<Integer>(a1);
		a3.add(10001);
		a3.add(990001);
		System.out.println(a3);
		
		/*
		 * ArrayList<Integer> a2 = new ArrayList<Integer>(); a2.add(11); a1.add(999);
		 * a1.add(1000); a1.add(1000); a1.add(null); a2.addAll(a1);
		 * System.out.println(a2);
		 */
		
		int a[] = {1111,2222,3333};
		
		for(int i = 0; i < a.length;i++)
		{
			a1.add(a[i]);
		}
		
        for(int j = 0; j<a1.size();j++)
        {
        	System.out.println(a1.get(j));
        }
        
        Iterator itr = a1.iterator();
        
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
	}

}
