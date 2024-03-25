package newjavalesson;
class Employee
{
	int emp_id;
	String emp_name;

Employee()
{
	emp_id=101;
	emp_name="Velonie";
	System.out.println("emp_id= "+emp_id);
	System.out.println("emp_name= "+emp_name);
}
}
public class AccountConstructor {

	public static void main(String[] args) {
	Employee emp= new Employee();	
	}

}
