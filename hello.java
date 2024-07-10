import java.util.Scanner;
import java.lang.System;
class hello
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Value is "+input.nextInt());
        input.nextLine();
        
        System.out.println("Value is "+input.nextLine());
        System.out.println("Value is BLANK ");
        System.out.println("Value is "+input.nextInt());
        input.nextLine();
        System.out.println("Value is "+input.nextLine());
       
        
/*        int a = input.nextInt();
        

        System.out.println("Enter value of b:");
        int b = input.nextInt();
        

        System.out.println("Enter value of c:");
        int c = input.nextInt();
        System.out.println(c);

        input.nextLine();

        System.out.println("Enter value of s:");
        String s = input.nextLine();
        System.out.println("Tha value of s is :"+ s);

        System.out.println("Tha value of a is :"+a);
        System.out.println("Tha value of b is :"+b);
        System.out.println("Tha value of c is :"+c);
*/

    }
}