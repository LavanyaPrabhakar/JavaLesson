//Get input for variable a which should be greater than 10. If it is not greater than 10 ask the user to reenter until the right input.
import java.util.Scanner;
class LoopDoWhile2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        do
        {
            System.out.println("Enter the number greater than 10");
            number = scan.nextInt();
        }while(number<10);
    }
}