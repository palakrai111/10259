package projectfor10259;

public class NoOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome TO java"; // 8,2
		/*
		 * String x[] = s.split(" "); System.out.println("word count :"+ x.length); char
		 * ch[] = s.toCharArray(); System.out.println("char count :"+ ch.length);
		 */
		int scount = 0;
		int ccount = 0;
		for(int i = 0; i < s.length();i++)
		{
			char j = s.charAt(i);
			if( j != ' ')
			{
				ccount++;
			}
			else
			{
				scount++;
			}
		}
		System.out.println("ccount : "+ ccount);
		System.out.println("scount : "+ scount);
		
		
		String y[] = s.split(" "); //{welcome,to,java}
		
		String a = y[0].toUpperCase();
		String b = y[1].toLowerCase();
		String c = y[2].replace('a', 'e');
		String newString = a+" "+b+" "+c;
		System.out.println(newString);
		//palak {0,1,2,3,4}
		//alakp
		
		String z = "palak";
		String z1= z.substring(1)+z.charAt(0);
		System.out.println("newstring :"+z1);
		
		String w = "WELcome"; //welCOME
		String newstring = "";
		
		for(int i = 0 ; i <w.length();i++)
		{
			char c1 = w.charAt(i);
			
			if(c1>='A' && c1<='Z')
			{
				int x1=c1+32;
				System.out.println((char)x1);
				newstring = newstring+(char)x1;
			}
			else
			{
				int x2 = c1-32;
				System.out.println((char)x2);
				newstring = newstring+(char)x2;
			}
		}
		
		
       System.out.println(newstring);
       

	}

}
