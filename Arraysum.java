package projectfor10259;

public class Arraysum {
	int sum =0;
	  int sumofArray(int arr[]) // boolean PassOrFail(int marks[])
	  {
		  for(int x:arr)
		  {
		  sum = sum + x;
		  }
		 return sum; 
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arraysum ob = new Arraysum();
		int a[] = {1,2,3,4};
		int y=ob.sumofArray(a);   // boolean result = ob.passorfail(marks)
		System.out.println("sumof array is : "+y);//if(result)
	}

}
