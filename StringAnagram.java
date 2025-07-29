package projectfor10259;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "keep";
		String s2 = "peeks";
		
		if(s1.length() == s2.length())
		{
			char ch1[] = s1.toCharArray(); //{k,e,e,p}
			char ch2[] = s2.toCharArray();//{p,e,e,k}
			Arrays.sort(ch2);
			Arrays.sort(ch1);
			boolean b = Arrays.equals(ch1, ch2);
			if(b)
			{
				System.out.println("Arrays are anagram");
			}
			else
			{
				System.out.println("Arrays are not anagram ");
			}
			
		}else
		{
			System.out.println("Arrays are not anagram due to unequal lenagth");
		}

	}

}
