/*Create a class "School" with method passorfail(int totalmark) and get input from totalmark. 
Find whether the totalmark is pass or fail. */
import java.util.*;
class School
{
    String passorfail(int totalmark)
    {
        if(totalmark>=35)
        return "Pass";
        else
        return "Fail";

    }

    public static void main(String[] args)
    {
        School obj = new School();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter totalmark:");
             
        String result = obj.passorfail(input.nextInt());

        System.out.println(result);
    }
}