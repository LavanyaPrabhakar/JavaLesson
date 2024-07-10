//Get input for variable a and b then print the numbers from a to b
import java.util.*;
class CodingQues9
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value for a:");
        int a=input.nextInt();
         System.out.println("Enter value for b:");
        int b=input.nextInt();
        //System.out.println("Print the values from a to b");
        if (a<b)
        {
            System.out.println("Print the values from a to b");
            for(int i=a;i<=b;i++)
            {
                 System.out.println(i);
            }
        }
        else 
        {
            System.out.println("Print the values from a to b");
            for(int i=a;i>=b;i--)
            {
                 System.out.println(i);
            }
        }
    }
}