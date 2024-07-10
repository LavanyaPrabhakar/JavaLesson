//Get input for two integer number and find which number is greater using Ternary Operator 
import java.util.*;
class TernaryOper2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1:");
        int number1=input.nextInt();
        System.out.println("Enter number2:");
        int number2=input.nextInt();



        String result = number1>number2?number1+"  is greater than "+number2 :number2+"  is greater than "+number1;
        System.out.println(result);
    }
}