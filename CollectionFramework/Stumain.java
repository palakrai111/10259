package CollectionFramework;

import java.util.ArrayList;

public class Stumain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> s1 = new ArrayList<Student>();
		
		s1.add(new Student(1,"palak"));
		s1.add(new Student(2,"gaurik"));
		s1.add(new Student(3,"gagan"));
		s1.add(new Student(4,"kiara"));
		
		for(Student s: s1)
		{
			System.out.println(s.getName() + " "+ s.getId());
		}
		
		for(Student s: s1)
		{
			if(s.getId() == 3)
			{
			System.out.println(s.getName() );
			}
			else
			{
				System.out.println("not found");
			}
		}
		

	}

}
