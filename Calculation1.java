import java.util.Scanner;
import java.lang.System;
class Calculation1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        int division = d/e;
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        System.out.println("division = "+division);

    }
}