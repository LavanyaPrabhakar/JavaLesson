/*Create a class "Find" with method evenorodd(int num) and get input from user. 
Find whether the number is even or odd. */
import java.util.*;
class Find
{
    String evenOrOdd(int num)
    {
        if(num%2==0)
        return "Even";
        else
        return "Odd";

    }

    public static void main(String[] args)
    {
        Find obj = new Find();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
             
        String result = obj.evenOrOdd(input.nextInt());

        System.out.println(result);
    }
}