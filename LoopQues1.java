import java.util.Scanner;
class LoopQues1
{
public static void main(String args[])
{
// Get an input for variable meghna and use comparison operator

    Scanner input = new Scanner(System.in);
    System.out.println("Enter String value for meghna (dead/alive):");
    String result = input.nextLine();
    String meghna = "dead";
    if (meghna.equals(result))
    {
        System.out.println("Surya weds Ramya");
    }
    else
    {
        System.out.println("Surya weds Meghna");
    }
}
}