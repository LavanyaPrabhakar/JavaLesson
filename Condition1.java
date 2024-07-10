import java.util.*;
import java.lang.System;

class Condition1
{
    public static void main(String args[])
    {
        //When its raining take the umbrella and if not don't.
        Scanner input = new Scanner(System.in);
        System.out.println("Is it raining outside (Type true or false) ?:");
        boolean rain = input.nextBoolean();
        
        if(rain==true)
            {
            System.out.println("Take the Umbrella");
             }
            else
            {
               System.out.println("No need to take the Umbrella"); 
            }
       

    }
}