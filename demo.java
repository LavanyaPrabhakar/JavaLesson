import java.util.Scanner;
import java.lang.System;
class Demo
{
public static void main(String args[])
{
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Number 1 :");

        int num1 = input.nextInt();
         System.out.println("Enter Number 2 :");
        int num2 = input.nextInt();

   if ( num1==num2)
   {
    System.out.println("Number 1 and Number 2 are equal");
   }
   else{
    System.out.println("Number 1 and Number 2 are not equal");
   }
}
}