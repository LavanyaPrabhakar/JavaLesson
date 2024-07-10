// Get an input for salary and age. 
// if salary>=20000 or age<=25 get input for required loan amount. If not  print "You are not eligible for loan"
// if required loan amount is <=50000 print "You are eligible for loan".
// if it is >=50000 print "Maximum loan amount is 50000"


import java.util.Scanner;
class CodingQues8
{
public static void main(String args[])
{

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the salary :");
    int salary = input.nextInt();
    System.out.println("Enter the age:");
    int age = input.nextInt();
   
    
    if (salary >= 20000 || age <= 25)
    {
        
    System.out.println("Enter the Loan :");
    int loan = input.nextInt();
        if (loan <=50000)
        {
            System.out.println("You are eligible for loan");
        }
        else
        {
            
            System.out.println("Maximum loan amount is 50000");
       
        }
    }
    else 
    {
       System.out.println("You are not eligible for loan"); 
    }
}
}