package projectfor10259;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Palak");
		sb.append("Rai");
		sb.append("Suryawanshi");
		//System.out.println(sb);
		sb.insert(1,'x');
	//	System.out.println(sb);
		sb.delete(6, 9);
		//System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		

	}

}
