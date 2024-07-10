// Get an input for variable income and use comparison operator
//income>=7000 print "Scholarship is available" else "Not eligible for Scholarship"
import java.util.Scanner;
class CodingQues2
{
public static void main(String args[])
{
// Get an input for variable income and use comparison operator

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the income :");
    int income = input.nextInt();
    
    if (income>=7000)
    {
        System.out.println("Scholarship is available");
    }
    else
    {
        System.out.println("Not eligible for Scholarship");
    }
}
}