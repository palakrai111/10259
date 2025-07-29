package projectfor10259;
class Bank
{
	
    int getRateOfInterest()
    {
    	return 0;
    }

}
class sbi extends Bank
{
	
	int getRateOfInterest()
    {
    	return 5;
    }
}
class pnb extends Bank
{
	
	int getRateOfInterest()
    {
    	return 7;
    }
}


public class Overridingexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Bank b = new Bank();
		Bank b;
		 b = new sbi();
		System.out.println("rate of interest is" + " "+b.getRateOfInterest());
		b = new pnb();
		System.out.println("rate of interest is" + " "+b.getRateOfInterest());
		

	}

}
