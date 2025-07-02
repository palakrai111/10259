package projectfor10259;

public class StringDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "nayan";
		String x=s.concat("rai");
	//	s = "nayan";
		System.out.println(x);
		String s1 = new String("xyz");
		System.out.println(s1);
		
		String s2 = "xyz";
		if(s1 == s2)
		{
			System.out.println("equal");
		}
		else 
		{
			System.out.println("not equal");
		}

		System.out.println("equals method");
		if(s1.equals(s2))
		{
			System.out.println("equal");
		}
		else 
		{
			System.out.println("not equal");
		}
		System.out.println("compare to method");
		int x1 = s1.compareTo(s2);
		System.out.println(x1);
		
		// comapareTo -> int
		//equals -> boolean
		// == ( not preffered)
		
		String s4 = "abc";
		String s5 = "abc";
		//reversing of string
		System.out.println("reversed string");
		String rev = "";
		for(int i = s.length()-1; i >=0;i--)  //palak -> 5, 0-5,
		{
			char last = s.charAt(i);  // 4,3,2,1,0
			rev = rev + last; //kalap
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("palindrome");
		}else
		{
			System.out.println("not palindrome");
		}
		
		
	}

}
