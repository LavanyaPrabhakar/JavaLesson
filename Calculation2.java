import java.util.Scanner;
import java.lang.System;
class Calculation2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = input.nextLine();
        
        System.out.println("Enter Department:");
        String department = input.nextLine();
        System.out.println("Enter Result out of 100:");
        double result = input.nextDouble();
        double score = result/10;

        System.out.println(name+"  "+department+"  "+score+"/10");
        System.out.println("Name : "+name);
        System.out.println("Department : "+department);
        System.out.println("Score out of 10: "+score+"/10");
    }
}