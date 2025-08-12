package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListIteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(12);
		al.add(3);
		al.add(14);
		//4
		ListIterator litr = al.listIterator(3);
		
		while(litr.hasPrevious())
		{
			
			System.out.println(litr.previous());
			
			}
		
		Collections.sort(al);
		System.out.println("sorting");
		System.out.println(al);
		
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		System.out.println(Collections.binarySearch(al,14));
		
		
		Stack stk = new Stack();
	      stk.push(1);
	      stk.push(18);
	      stk.push(16);
	      stk.push(11);
	      System.out.println(stk);
	      stk.pop();
	      stk.pop();
	      System.out.println(stk);
	      System.out.println(stk.peek());
	      
	      
	      Vector v = new Vector();
	      v.addElement(1);
	      v.addElement(2);
	      v.addElement(3);
	      System.out.println(v);
	      
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		

	}

}
