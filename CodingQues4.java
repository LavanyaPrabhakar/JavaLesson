// Get an input for a number and check whether it is even or odd
import java.util.Scanner;
class CodingQues4
{
public static void main(String args[])
{

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value for a :");
    int a = input.nextInt();
    int a1 = a%2;
       
    if (a1==0)
    {
        System.out.println("It is an even number");
    }
    else
    {
       System.out.println("It is an odd number");
    }
}
}
