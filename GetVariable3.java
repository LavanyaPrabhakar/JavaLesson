import java.util.Scanner;
import java.lang.System;
class GetVariable3
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        input.nextLine();
        String address = input.nextLine();

        System.out.println(name+"  "+age+"  "+address);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
    }
}