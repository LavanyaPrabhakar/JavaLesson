//Get five array input and print its sum
import java.util.*;
import java.lang.System;
class ArrayInput1
{
    public static void main(String args[])
    {
Scanner input = new Scanner(System.in);
int[] num = new int[5];
System.out.println("Enter num1:");
 num[0] = input.nextInt();
System.out.println("Enter num2:");
 num[1] = input.nextInt();
System.out.println("Enter num3:");
 num[2] = input.nextInt();
System.out.println("Enter num4:");
 num[3] = input.nextInt();
System.out.println("Enter num5:");
 num[4] = input.nextInt();
int sum = num[0] + num[1] + num[2]+ num[3]+ num[4];
System.out.println("Sum="+sum);
    }
}