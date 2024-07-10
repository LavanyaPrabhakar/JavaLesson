import java.util.Scanner;
class LoopQues
{
public static void main(String args[])
{
// Get an input for variable RCB and use comparison operator

    Scanner input = new Scanner(System.in);
    System.out.println("Enter String value for rcb(win/loose):");
    String result = input.nextLine();
    String rcb = "win";
    if (rcb.equals(result))
    {
        System.out.println("Ee sala cup namdhey");
    }
    else
    {
        System.out.println("Cup illa");
    }
}
}