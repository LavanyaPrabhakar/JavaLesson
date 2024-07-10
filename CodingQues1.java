// Get an input for variable mark and use comparison operator
//mark>=35 print "pass" else "Fail"
import java.util.Scanner;
class CodingQues1
{
public static void main(String args[])
{


    Scanner input = new Scanner(System.in);
    System.out.println("Enter the mark (out of 100):");
    int mark = input.nextInt();
    
    if (mark>=35)
    {
        System.out.println("pass");
    }
    else
    {
        System.out.println("fail");
    }
}
}