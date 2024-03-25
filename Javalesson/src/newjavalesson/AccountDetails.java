package newjavalesson;
class Account
{
public
	int account_number;
	String customer_name;
	String date_of_open;
	float balance;

void getData()
{
	account_number=12345;
	customer_name="John";
	date_of_open="10/ Jan/ 2023";
	balance=1000.00f;
}


void putData()
{
	System.out.println("account_number = "+account_number);
	System.out.println("customer_name = "+customer_name);
	System.out.println("date_of_open = "+date_of_open);
	System.out.println("balance = "+balance);
}
}
public class AccountDetails {

	public static void main(String[] args) {
		Account acc= new Account();
		acc.getData();
		acc.putData();

	}

}
