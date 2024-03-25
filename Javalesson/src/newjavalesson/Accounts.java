package newjavalesson;
class Account1
{
	public
	int account_number;
	String customer_name;
	String date_of_open;
	float balance;

	Account1()
	{	System.out.println("This is Constructor1");
		account_number=12346;
		customer_name="Jack";
		date_of_open="11/ Jan/ 2023";
		balance=2000.00f;
    }
	void putData()
	{
		System.out.println("account_number = "+account_number);
		System.out.println("customer_name = "+customer_name);
		System.out.println("date_of_open = "+date_of_open);
		System.out.println("balance = "+balance);
	}
}
	class Account2
	{
		public
		int account_number;
		String customer_name;
		String date_of_open;
		float balance;

		Account2()
		{	System.out.println("This is Constructor2");
			account_number=12347;
			customer_name="Claire";
			date_of_open="15/ Jan/ 2023";
			balance=3000.00f;
	    }
		void putData()
		{
			System.out.println("account_number = "+account_number);
			System.out.println("customer_name = "+customer_name);
			System.out.println("date_of_open = "+date_of_open);
			System.out.println("balance = "+balance);
		}
	}
		class Account3
		{
			public
			int account_number;
			String customer_name;
			String date_of_open;
			float balance;

			Account3()
			{	System.out.println("This is Constructor3");
				account_number=12348;
				customer_name="Jessica";
				date_of_open="17/ Jan/ 2023";
				balance=4000.00f;
		    }
	void putData()
	{
		System.out.println("account_number = "+account_number);
		System.out.println("customer_name = "+customer_name);
		System.out.println("date_of_open = "+date_of_open);
		System.out.println("balance = "+balance);
	}
}
public class Accounts {
	public static void main(String[] args)
	{
		Account1 a1=new Account1();
		a1.putData();
		Account2 a2=new Account2();
		a2.putData();
		Account3 a3=new Account3();
		a3.putData();
	}

}
