package projectfor10259;

public class BankApplication {
	
	
	int amount = 1000;
	
	void withdraw(int wa)
	{
		amount = amount-wa;
	}
	void deposit(int da)
	{
		amount = amount+da;
	}
    void checkCurrentBalc()
    {
    	System.out.println("current amount is :"+ amount);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankApplication  ob = new  BankApplication();
		 ob.deposit(1000);
		 // 1000 +1000
		 ob.checkCurrentBalc();
		 ob.withdraw(500);//2000 - 500
		 ob.checkCurrentBalc(); //1500
		
	}

}
