import java.util.Scanner;
import java.lang.System;
class GetVariable2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        System.out.println(name+"  "+age);
    }
}