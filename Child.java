package projectfor10259;

public class Child implements Mother,Father
{

	@Override
	public void calheight() {
		// TODO Auto-generated method stub
		int x = Mother.height + Father.height;
		System.out.println("height is "+x);
		
	}

}
