// Get an input for variable a and check whether a is divisible by 3 and 5
import java.util.Scanner;
class CodingQues3
{
public static void main(String args[])
{

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value for a :");
    int a = input.nextInt();
    int a1 = a%3;
    int a2 = a%5;
    
    if (a1==0 && a2==0)
    {
        System.out.println("The number is divisible by both 3 and 5");
    }
    else if(a1==0 && a2!=0)
    {
        System.out.println("The number is divisible by 3 but not divisible by 5");
    }
    else if(a1!=0 && a2==0)
        {
        System.out.println("The number is not divisible by 3 but divisible by 5");
    }
    else
    {
        System.out.println("The number is not divisible by both 3 and 5");
    }
}
}
