// Use OR operator and Compare two boolean values
import java.util.Scanner;
class LogicalOper1
{
public static void main(String args[])
{

// both true means true
//either one is true means true
//both false means false

    boolean cricket = false;
    boolean football = false;
    
    if (cricket || football)
    {
        System.out.println("play");
    }
    else
    {
        System.out.println("Don't play");
    }
}
}
